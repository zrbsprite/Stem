package com.stem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletInputStream;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stem.core.commons.AjaxConroller;
import com.stem.wechat.WeChat;
import com.stem.wechat.bean.WeChatBuyPost;
import com.stem.wechat.bean.WeChatFeedBack;
import com.stem.wechat.oauth.Pay;
import com.stem.wechat.tools.ConfKit;
import com.stem.wechat.tools.Tools;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

@Controller
@RequestMapping("pay")
public class WechatPayController extends AjaxConroller {

	private final String STATUC_SUCCESS = "success";
	
	private final String STATUC_FAIL    = "fail";
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("")
	public String pay(Model model) throws UnsupportedEncodingException{
		// 判断是否微信环境, 5.0 之后的支持微信支付
		boolean isweixin = WeChat.isWeiXin(request);
		if(isweixin){
			//商品支付信息
			String productName = "测试商品001";
			String total_fee = "100";
			String orderid = "123456";
			
			Map<String, String> params = new HashMap<String, String>();
			// 对商品名截取, 去除空格
			productName = productName.replaceAll(" ","");
			productName = productName.length() > 17 ? productName.substring(0,17) + "..." : productName;

			// 商品描述。
			params.put("body",productName); 
		    // 订单总金额
			params.put("total_fee",total_fee);
			// 现金支付币种,取值： 1 （人民币）
			params.put("fee_type","1");
			// 商户系统内部的订单号
			params.put("out_trade_no",orderid); 
			// ip
			params.put("spbill_create_ip",getIp(request)); 
			// 参数
			String timeStamp = System.currentTimeMillis() + "";
			String nonceStr = RandomStringUtils.random(8,"123456789"); // 8位随机数
			String packagestring = Pay.getPackage(params); // 对参数打包
			String paySign = Pay.paySign(timeStamp,nonceStr,packagestring); // 构造签名

			// appId
			model.addAttribute("appid",ConfKit.get("AppId"));
			// timeStamp
			model.addAttribute("timeStamp", timeStamp);
			// nonceStr
			model.addAttribute("nonceStr", nonceStr);
			// package
			model.addAttribute("package", packagestring);
			// paySign
			model.addAttribute("paySign", paySign);
			// 判定微信
			model.addAttribute("isweixin", 1);
		}
		return "pay";
	}
	
	/**
	 * @author: stem zhang
	 * 修改时间：2015年8月14日 - 下午5:18:57<br/>
	 * 功能说明：支付回调<br/>
	 * @return
	 */
	@RequestMapping("notify")
	public void payNotify(PrintWriter out){
		// post 过来的xml
		WeChatBuyPost postData = null;
		String openid = null;
		String appsignature = null;
		try {
			ServletInputStream in = request.getInputStream();
			// 转换微信post过来的xml内容
			XStream xs = new XStream(new DomDriver());
			xs.alias("xml", WeChatBuyPost.class);
			String xmlMsg = Tools.inputStream2String(in);
			postData = (WeChatBuyPost) xs.fromXML(xmlMsg);
			logger.debug("微信回调回传信息："+postData.toString());
			// OpenId=oOGf-jjDL7Kv-xT6MBD1qoyKtzeU, AppId=wx136bc734aff403df, IsSubscribe=1, TimeStamp=1392628878, NonceStr=54ah1fs5UsTZrf8s, AppSignature=02b5d8f2ccd8ca42cf13c6e44b48513c13294093, SignMethod=sha1
			// 校验支付
			long timestamp   = postData.getTimeStamp();
			String noncestr  = postData.getNonceStr();
			openid = postData.getOpenId();
			int issubscribe  = postData.getIsSubscribe();
			appsignature = postData.getAppSignature();
			boolean temp = Pay.verifySign(timestamp, noncestr, openid, issubscribe, appsignature);
			if (!temp) {
				logger.warn("校验支付error！");
				writeHtml(STATUC_FAIL);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 微信post过来的参数
		Map<String, String[]> parasMap = request.getParameterMap();
		// 构造新的参数
		Map<String, String> paraMap = new HashMap<String, String>();
		for (Entry<String, String[]> entry : parasMap.entrySet()) {
			String   key   = entry.getKey();
			String[] value = entry.getValue();
			System.out.println(key + ":\t" + value);
			if (null == value) {
				continue;
			} else {
				paraMap.put(key, value[0]);
			}
		}
		/*
		 paraMap:	{"transport_fee":["0"],"trade_mode":["1"],"trade_state":["0"],"sign_type":["MD5"],"input_charset":["UTF-8"],"fee_type":["1"],"out_trade_no":["7805803"],"transaction_id":["1217484201201402188208911673"],"discount":["0"],"bank_billno":["201402180770175"],"sign":["F06A82B69D7819785478E34A84BE5CA0"],"attach":["yongle"],"total_fee":["1"],"time_end":["20140218095638"],"partner":["1217484201"],"notify_id":["Kl8hcMyrMFtQLMvOl_hfnEOahccJRPEf-tFuN7ctFfxVxRPLeD0kqMf_AU7ADdMF1zsRaW4FZQ9K_kvMQFc62ScV_NvEhL-D"],"bank_type":["0"],"product_fee":["1"]}
		 */
		
		/*
		// 必填：否
		sign_type           签名类型， 取值： MD5、 RSA，
		service_version     版本号，默认为 1.0
		input_charset       字符编码,取值： GBK、 UTF-8，
		sign_key_index      多密钥支持的密钥序号， 默认 1
		pay_info            支付结果信息， 支付成功时为空
		bank_billno         银行订单号
		attach              商家数据包，原样返回
		transport_fee       物流费用，单位分，默认 0。如果有值，必须保证transport_fee + product_fee = total_fee
		product_fee         物品费用， 单位分。 如果有值，必 须 保 证 transport_fee + product_fee=total_fee
		discount            折扣价格， 单位分， 如果有值, 通知的 total_fee + discount =请求的 total_fee 买家别名
		buyer_alias         对应买家账号的一个加密串
		
		必填：是
		sign                签名
		trade_mode          1-即时到账
		trade_state         0—成功 其他保留支付结果信息
		partner             商户号，也即之前步骤的partnerid, 由微信统一分配的10 位正整数 (120XXXXXXX)
		bank_type           银行类型，在微信中使用 WX
		total_fee           总金额  支付金额，单位为分，如果discount 有值， 通知的 total_fee+ discount = 请求的 total_fee
		fee_type            现金支付币种,目前只支持人民币,默认值是 1-人民币
		notify_id           支付结果通知 id， 对于某些特定商户，只返回通知 id，要求商户据此查询交易结果
		transaction_id      交易号， 28位长的数值，其中前10位为商户号之后8位为订单产生的日期如20090415，最后10位是流水号。
		out_trade_no        商户系统的订单号， 与请求一致。
		time_end            支付完成时间，格式为yyyyMMddhhmmss ，时区为 GMT+8 beijing。
		 */
		String trade_state  = request.getParameter("trade_state");
		String totalFee     = request.getParameter("total_fee");
		String orderId      = request.getParameter("out_trade_no");
		String transId      = request.getParameter("transaction_id");
		//String timeEnd      = request.getParameter("time_end");

		logger.info("trade_state:\t" + trade_state + "totalFee:\t" + totalFee + "orderId:\t" + orderId);
		
		if (StringUtils.isEmpty(orderId)) {
			writeHtml(STATUC_FAIL);
			return;
		}
		// 自己的业务逻辑 bg
		// ***************
		// 自己的业务逻辑 ed
		
		// 发送客服消息
		try {
			String accessToken = WeChat.getAccessToken();
			WeChat.message.sendText(accessToken, orderId, "您的订单号" + orderId + "已经支付成功！");
			//发货通知！推荐支付成功后就发送此通知...
			Pay.delivernotify(accessToken, openid, transId, transId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		writeHtml(STATUC_SUCCESS);
	}
	
	@RequestMapping("back")
	public String payFeeDBBack() throws UnsupportedEncodingException, IOException{
		ServletInputStream in = request.getInputStream();
		// 转换微信post过来的xml内容
		XStream xs = new XStream(new DomDriver());
		xs.alias("xml", WeChatFeedBack.class);
		String xmlMsg = Tools.inputStream2String(in);
		WeChatFeedBack postData = (WeChatFeedBack) xs.fromXML(xmlMsg);
		if (null == postData) {
			logger.info("postData:isnull...");
			return null;
		}
		logger.info(postData.toString());
		// 标记客户的投诉处理状态
		String msgType = postData.getMsgType();
		String feedBackId = postData.getFeedBackId();
		// 将处理的信息更新或保存到数据库 bg
		// ******************************
		//		try {
		//			// 另外标记处理状态的请自行处理，可单独后台页面由客服联系用户去处理，处理的同事并发送客服消息，
		//			WeChat.payfeedback(postData.getOpenId(), postData.getFeedBackId());
		//		} catch (Exception e) {
		//			e.printStackTrace();
		//		}
		// ******************************
		// 将处理的信息更新或保存到数据库 ed
		
		// 调用客服api，根据不同type安抚用户，同支付成功
//		if (msgType.equals(WeChatFeedBack.MSGTYPE_REQUEST)) {
//			
//		} else ...
		
		return null;
	}
}
