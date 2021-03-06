package com.stem.wechat;

import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.core.commons.SpringContextUtil;
import com.stem.wechat.bean.Articles;
import com.stem.wechat.bean.Attachment;
import com.stem.wechat.bean.InMessage;
import com.stem.wechat.bean.OutMessage;
import com.stem.wechat.inf.MessageProcessingHandler;
import com.stem.wechat.oauth.Group;
import com.stem.wechat.oauth.Menu;
import com.stem.wechat.oauth.Message;
import com.stem.wechat.oauth.Qrcod;
import com.stem.wechat.oauth.WechatUserUtils;
import com.stem.wechat.tools.HttpKit;
import com.stem.wechat.tools.JsApiSign;
import com.stem.wechat.tools.Tools;
import com.stem.wechat.tools.XStreamFactory;
import com.thoughtworks.xstream.XStream;

@SuppressWarnings("unchecked")
public class WeChat {

	private static final String ACCESSTOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential";
	private static final String PAYFEEDBACK_URL = "https://api.weixin.qq.com/payfeedback/update";
	private static final String GET_MEDIA_URL = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token=";
	private static final String UPLOAD_MEDIA_URL = "http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token=";
	private static final String JSAPI_TICKET = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?type=jsapi&access_token=";

	private static MessageProcessingHandler messageProcessingHandler;

	/**
	 * 消息操作接口
	 */
	public static final Message message = new Message();
	/**
	 * 菜单操作接口
	 */
	public static final Menu menu = new Menu();
	/**
	 * 用户操作接口
	 */
	public static final WechatUserUtils user = new WechatUserUtils();
	/**
	 * 分组操作接口
	 */
	public static final Group group = new Group();

	/**
	 * 分组操作接口
	 */
	public static final Qrcod qrcod = new Qrcod();

	/**
	 * 获取access_token
	 *
	 * @return
	 * @throws Exception
	 */
	public static String getAccessToken() throws Exception{

		String appid = PropertiesUtils.getConfigByKey("AppId");
		String secret = PropertiesUtils.getConfigByKey("AppSecret");
		String jsonStr = HttpKit.get(ACCESSTOKEN_URL.concat("&appid=") + appid + "&secret="
				+ secret);
		Map<String, Object> map = JSONObject.parseObject(jsonStr);
		return map.get("access_token").toString();
	}

	/**
	 * 获取access_token
	 *
	 * @return
	 * @throws Exception
	 */
	public static Map<String, Object> getAccessTokenBean() throws Exception{

		String appid = PropertiesUtils.getConfigByKey("AppId");
		String secret = PropertiesUtils.getConfigByKey("AppSecret");
		String jsonStr = HttpKit.get(ACCESSTOKEN_URL.concat("&appid=") + appid + "&secret="
				+ secret);
		Map<String, Object> map = JSONObject.parseObject(jsonStr);
		return map;
	}

	/**
	 * 获取access_token
	 *
	 * @return
	 * @throws Exception
	 */
	public static String getAccessToken(String appid,String secret) throws Exception{

		String jsonStr = HttpKit.get(ACCESSTOKEN_URL.concat("&appid=") + appid + "&secret="
				+ secret);
		Map<String, Object> map = JSONObject.parseObject(jsonStr);
		return map.get("access_token").toString();
	}

	/**
	 * 支付反馈
	 *
	 * @param openid
	 * @param feedbackid
	 * @return
	 * @throws Exception
	 */
	public static boolean payfeedback(String openid,String feedbackid) throws Exception{

		Map<String, String> map = new HashMap<String, String>();
		String accessToken = getAccessToken();
		map.put("access_token",accessToken);
		map.put("openid",openid);
		map.put("feedbackid",feedbackid);
		String jsonStr = HttpKit.get(PAYFEEDBACK_URL,map);
		Map<String, Object> jsonMap = JSONObject.parseObject(jsonStr);
		return "0".equals(jsonMap.get("errcode").toString());
	}

	/**
	 * 签名检查
	 * 
	 * @param token
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @return
	 */
	public static Boolean checkSignature(String token,String signature,String timestamp,String nonce){

		return Tools.checkSignature(token,signature,timestamp,nonce);
	}

	/**
	 * 根据接收到用户消息进行处理
	 * 
	 * @param responseInputString
	 *            微信发送过来的xml消息体
	 * @return
	 */
	public static String processing(String responseInputString,String serverPath){

		messageProcessingHandler = SpringContextUtil.getBean("messageProcessingHandler");
		
		InMessage inMessage = parsingInMessage(responseInputString);
		// 取得消息类型
		String type = inMessage.getMsgType();
		switch (type) {
			case "event":
				messageProcessingHandler.eventTypeMsg(inMessage,serverPath);
				break;
			case "text":
				messageProcessingHandler.textTypeMsg(inMessage, serverPath);
				break;
			default:
				messageProcessingHandler.allType(inMessage);
				break;
		}

		OutMessage oms = messageProcessingHandler.getOutMessage();
		String xml = null;
		if(oms != null){
			// 调用事后处理
			oms.setCreateTime(System.currentTimeMillis());
			oms.setFromUserName(inMessage.getToUserName());
			oms.setToUserName(inMessage.getFromUserName());
			messageProcessingHandler.afterProcess(inMessage,oms);
			// 把发送发送对象转换为xml输出
			XStream xs = XStreamFactory.init(true);
			xs.alias("xml", oms.getClass());
			xs.alias("item", Articles.class);
			xml = xs.toXML(oms);
		}
		return xml;
	}

	/**
	 * 消息体转换
	 * 
	 * @param responseInputString
	 * @return
	 */
	private static InMessage parsingInMessage(String responseInputString){

		// 转换微信post过来的xml内容
		XStream xs = XStreamFactory.init(false);
		xs.alias("xml",InMessage.class);
		InMessage msg = (InMessage) xs.fromXML(responseInputString);
		return msg;
	}

	/**
	 * 获取媒体资源
	 * 
	 * @param accessToken
	 * @param mediaId
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public static Attachment getMedia(String accessToken,String mediaId) throws IOException,
			ExecutionException,InterruptedException{

		String url = GET_MEDIA_URL + accessToken + "&media_id=" + mediaId;
		return HttpKit.download(url);
	}

	/**
	 * 上传素材文件
	 * 
	 * @param type
	 * @param file
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchProviderException
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public static Map<String, Object> uploadMedia(String accessToken,String type,File file)
			throws Exception{

		String url = UPLOAD_MEDIA_URL + accessToken + "&type=" + type;
		String jsonStr = HttpKit.upload(url,file);
		return JSON.parseObject(jsonStr,Map.class);
	}

	/**
	 * 获得jsapi_ticket（有效期7200秒)
	 *
	 * @param accessToken
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 * @throws IOException
	 * @throws NoSuchProviderException
	 */
	public static JSONObject getTicket(String accessToken) throws InterruptedException,
			ExecutionException,NoSuchAlgorithmException,KeyManagementException,IOException,
			NoSuchProviderException{

		String jsonStr = HttpKit.get(JSAPI_TICKET.concat(accessToken));
		return JSONObject.parseObject(jsonStr);
	}

	/**
	 * 生成jsApi的签名信息
	 *
	 * @param jsapiTicket
	 * @param url
	 * @return
	 */
	public static Map<String, String> jsApiSign(String jsapiTicket,String url){

		return JsApiSign.sign(jsapiTicket,url);
	}

	/**
	 * 判断是否来自微信, 5.0 之后的支持微信支付
	 *
	 * @param request
	 * @return
	 */
	public static boolean isWeiXin(HttpServletRequest request){

		String userAgent = request.getHeader("User-Agent");
		if(StringUtils.isNotBlank(userAgent)){
			Pattern p = Pattern.compile("MicroMessenger/(\\d+).+");
			Matcher m = p.matcher(userAgent);
			String version = null;
			if(m.find()){
				version = m.group(1);
			}
			return (null != version && NumberUtils.toInt(version) >= 5);
		}
		return false;
	}
}
