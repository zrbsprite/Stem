package com.stem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletInputStream;

import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stem.core.AppContext;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerPay;
import com.stem.service.TigerPayService;
import com.stem.wechat.WeChat;
import com.stem.wechat.bean.PrePay;
import com.stem.wechat.bean.ProductInfo;
import com.stem.wechat.bean.WeChatBuyPost;
import com.stem.wechat.bean.WeChatFeedBack;
import com.stem.wechat.oauth.Pay;
import com.stem.wechat.tools.Tools;
import com.stem.wechat.tools.XStreamFactory;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

@Controller
@RequestMapping("wechat")
public class WechatPayController extends AjaxConroller {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TigerPayService tigerPayService;
	
	@RequestMapping("pay")
	public String pay(@ModelAttribute ProductInfo info, Model model) throws UnsupportedEncodingException{
		// 判断是否微信环境, 5.0 之后的支持微信支付
		boolean isweixin = WeChat.isWeiXin(request);
		if(isweixin){
			//商品支付信息
			String productName = info.getProductName();
			String total_fee = info.getTotalFee();
			String productId = info.getProductId();
			String orderid = createOrderId(productId);
			
			// 对商品名截取, 去除空格
			productName = productName.replaceAll(" ","");
			productName = productName.length() > 17 ? productName.substring(0,17) + "..." : productName;

			Map<String, String> params = new HashMap<String, String>();
			// 商品描述。
			params.put("body", productName); 
		    // 订单总金额,订单总金额，只能为整数,单位是：分
			params.put("total_fee", total_fee);
			// 商户系统内部的订单号
			params.put("out_trade_no", orderid); 
			// ip
			params.put("spbill_create_ip", getIp(request)); 
			//需要原样返回的信息
			params.put("attach", productName);			
			//此id为二维码中包含的商品ID，商户自行定义
			params.put("product_id", productId);
			//openid
	        String openid = (String) request.getSession().getAttribute("openid");
	        params.put("openid", openid);
			
			// 参数
			String timeStamp = System.currentTimeMillis() + "";
			String nonceStr = RandomStringUtils.random(8, "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			String serverPath = getServerLocalePath();
			String packageStr = Pay.getPackage(params, serverPath);
			XStream xs = XStreamFactory.init(false);
	        xs.ignoreUnknownElements();
	        xs.alias("xml", PrePay.class);
	        PrePay bean = (PrePay) xs.fromXML(packageStr);
			String packagestring = bean.getPrepay_id();
			
			String paySign = Pay.paySign(timeStamp, nonceStr, packagestring);
			
			// appId
			model.addAttribute("appid", PropertiesUtils.getConfigByKey("AppId"));
			// timeStamp
			model.addAttribute("timeStamp", timeStamp);
			// nonceStr
			model.addAttribute("nonceStr", nonceStr);
			// package
			model.addAttribute("package", packagestring);
			// paySign
			model.addAttribute("paySign", paySign);
		}
		return "pay/pay";
	}
	
	private String createOrderId(String id){
		StringBuffer sb = new StringBuffer("TIGER");
		sb.append(id);
		sb.append("V");
		sb.append(System.currentTimeMillis());
		sb.append("END");
		String tail = RandomStringUtils.random(4, "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		sb.append(tail);
		return sb.toString();
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
		String orderId = null;
		try {
			ServletInputStream in = request.getInputStream();
			// 转换微信post过来的xml内容
			XStream xs = new XStream(new DomDriver());
			xs.alias("xml", WeChatBuyPost.class);
			xs.ignoreUnknownElements();
			String xmlMsg = Tools.inputStream2String(in);
			postData = (WeChatBuyPost) xs.fromXML(xmlMsg);
			
			logger.debug("微信回调回传信息：" + xmlMsg);
			
			String returnCode = postData.getReturn_code();
			if (!returnCode.equalsIgnoreCase("SUCCESS")){
				logger.warn("校验支付error:" + postData.getReturn_msg());
				writeHtml("<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>");
				return;
			}
			openid = postData.getOpenid();
			orderId = postData.getOut_trade_no();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//记录用户支付信息
		TigerPay model = new TigerPay();
		model.setOpenid(openid);
		model.setOrderId(postData.getOut_trade_no());
		model.setTradeId(postData.getTransaction_id());
		String fee = postData.getTotal_fee();
		model.setPayMoney(Integer.valueOf(fee));
		model.setPayStatus(1);
		model.setPayTime(postData.getTime_end());
		model.setProductName(postData.getAttach());
		tigerPayService.add(model);
		
		// 发送客服消息
		try {
			String accessToken = (String) AppContext.getContext().getValue(AppContext.ACCESS_TOKEN_KEY);
			WeChat.message.sendText(accessToken, openid, "您的订单号" + orderId + "已经支付成功！");
		} catch (Exception e) {
			e.printStackTrace();
			logger.warn("发送客服消息异常："+e.getMessage());
		}
		writeHtml("<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>");
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
//		String msgType = postData.getMsgType();
//		String feedBackId = postData.getFeedBackId();
		return null;
	}
}
