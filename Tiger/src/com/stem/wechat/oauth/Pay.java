package com.stem.wechat.oauth;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.util.HttpUtils;
import com.stem.wechat.tools.HttpKit;

/**
 * 支付相关方法
 */
public class Pay {

	//y预支付接口
	private static final String UNIFIEDORDER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	
    // 发货通知接口
    private static final String DELIVERNOTIFY_URL = "https://api.weixin.qq.com/pay/delivernotify?access_token=";

    public static String getPackage(Map<String, String> params) throws UnsupportedEncodingException {
        String notifyUrl = PropertiesUtils.getConfigByKey("notify_url");
        //微信会将此参数原样返回
        //params.put("attach", "yongle");
        //接收微信支付异步通知回调地址
        params.put("notify_url", notifyUrl);
        //交易类型
        params.put("trade_type","JSAPI");
        
        String str = createSign(params, false);
        String sign = DigestUtils.md5Hex(str);
        params.put("sign",sign);
        
        //将map转换成xml
        StringBuffer xml = new StringBuffer("<xml>");
        Set<Entry<String, String>> set = params.entrySet();
        for(Entry<String, String> entry : set){
        	xml.append("<");
        	xml.append(entry.getKey());
        	xml.append(">");
        	xml.append(entry.getValue());
        	xml.append("<");
        	xml.append("/");
        	xml.append(entry.getKey());
        	xml.append(">");
        }
        xml.append("</xml>");
        //发送http请求
        try{
        	return HttpUtils.postHttpAsXml(UNIFIEDORDER_URL , xml.toString());
		} catch(IOException e){
			e.printStackTrace();
		}
        return null;
    }

    /**
     * 构造签名
     * @param params
     * @param encode
     * @return
     * @throws UnsupportedEncodingException 
     */
    public static String createSign(Map<String, String> params, boolean encode) throws UnsupportedEncodingException {
        Set<String> keysSet = params.keySet();
        Object[] keys = keysSet.toArray();
        Arrays.sort(keys);
        StringBuffer temp = new StringBuffer();
        boolean first = true;
        for (Object key : keys) {
            if (first) {
                first = false;
            } else {
                temp.append("&");
            }
            temp.append(key).append("=");
            Object value = params.get(key);
            String valueString = "";
            if (null != value) {
                valueString = value.toString();
            }
            if (encode) {
                temp.append(URLEncoder.encode(valueString, "UTF-8"));
            } else {
                temp.append(valueString);
            }
        }
        return temp.toString();
    }

    /**
     * 支付签名
     * @param timestamp
     * @param noncestr
     * @param packages
     * @return
     * @throws UnsupportedEncodingException 
     */
    public static String paySign(String timestamp, String noncestr,String packages) throws UnsupportedEncodingException {
        Map<String, String> paras = new HashMap<String, String>();
        paras.put("appid", PropertiesUtils.getConfigByKey("AppId"));
        paras.put("timeStamp", timestamp);
        paras.put("nonceStr", noncestr);
        paras.put("package", packages);
        paras.put("signType", "MD5");
        String str = createSign(paras, false);
        return DigestUtils.md5Hex(str);
    }
    
    
    /**
     * 发货通知签名
     * @param paras
     * @return
     * @throws UnsupportedEncodingException
     * 
     * @参数 appid、appkey、openid、transid、out_trade_no、deliver_timestamp、deliver_status、deliver_msg；
     */
    private static String deliverSign(Map<String, String> paras) throws UnsupportedEncodingException {
        paras.put("appkey", PropertiesUtils.getConfigByKey("paySignKey"));
        String string1 = createSign(paras, false);
        String paySign = DigestUtils.sha1Hex(string1);
        return paySign;
    }
    
    
    /**
     * 发货通知
     * @param access_token
     * @param openid
     * @param transid
     * @param out_trade_no
     * @return
     * @throws IOException 
     * @throws NoSuchProviderException 
     * @throws NoSuchAlgorithmException 
     * @throws KeyManagementException 
     * @throws InterruptedException 
     * @throws ExecutionException 
     */

    public static boolean delivernotify(String access_token, String openid, String transid, String out_trade_no) throws IOException, ExecutionException, InterruptedException {
        Map<String, String> paras = new HashMap<String, String>();
        paras.put("appid", PropertiesUtils.getConfigByKey("AppId"));
        paras.put("openid", openid);
        paras.put("transid", transid);
        paras.put("out_trade_no", out_trade_no);
        paras.put("deliver_timestamp", (System.currentTimeMillis() / 1000) + "");
        paras.put("deliver_status", "1");
        paras.put("deliver_msg", "ok");
        // 签名
        String app_signature = deliverSign(paras);
        paras.put("app_signature", app_signature);
        paras.put("sign_method", "sha1");
        String json = HttpKit.post(DELIVERNOTIFY_URL.concat(access_token), JSONObject.toJSONString(paras));
        if (StringUtils.isNotBlank(json)) {
            JSONObject object = JSONObject.parseObject(json);
            if (object.containsKey("errcode")) {
                int errcode = object.getIntValue("errcode");
                return errcode == 0;
            }
        }
        return false;
    }
}
