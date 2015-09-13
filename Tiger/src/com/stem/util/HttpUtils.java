package com.stem.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLHandshakeException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class HttpUtils {
	private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);
	     
    public static String requestAsHttpPOST(String urlvalue, Map<String, String> paras) {
    	HttpClient http = new HttpClient();
		HttpConnectionManagerParams managerParams = http.getHttpConnectionManager().getParams();
        // 设置连接超时时间(单位毫秒)
        managerParams.setConnectionTimeout(3000);
        // 设置读数据超时时间(单位毫秒)
        managerParams.setSoTimeout(10000);
        PostMethod method = new PostMethod(urlvalue);
		method.getParams().setHttpElementCharset("utf-8");
		method.getParams().setContentCharset("utf-8");
		method.getParams().setCredentialCharset("utf-8");
        for (String key : paras.keySet()) {
            method.addParameter(key, paras.get(key));
            logger.info(key + " : " + paras.get(key));
        }
        String result = "";
        try {
            http.executeMethod(method);
            result = method.getResponseBodyAsString();
        } catch (IOException e) {
            result = "";
            e.printStackTrace();
        }
        logger.info(result);
        return result;
    }
    
    public static String requestAsHttpPOSTAsGBK(String urlvalue, Map<String, String> paras) {
        HttpClient http = new HttpClient();
        PostMethod method = new PostMethod(urlvalue);
		method.getParams().setHttpElementCharset("gbk");
		method.getParams().setContentCharset("gbk");
		method.getParams().setCredentialCharset("gbk");
        for (String key : paras.keySet()) {
			method.addParameter(key, paras.get(key));
			logger.info(key + " : " + paras.get(key));
        }
        String result = "";
        try {
            http.executeMethod(method);
            result = method.getResponseBodyAsString();
        } catch (IOException e) {
            result = "";
            e.printStackTrace();
        }
        logger.info(result);
        return result;
    }
    
    public static String requestAsHttpPOST(String urlvalue, Map<String, String> paras , String enc) {
        HttpClient http = new HttpClient();
        PostMethod method = new PostMethod(urlvalue);
		method.getParams().setHttpElementCharset(enc);
		method.getParams().setContentCharset(enc);
		method.getParams().setCredentialCharset(enc);
        for (String key : paras.keySet()) {
            method.addParameter(key, paras.get(key));
            logger.info(key + " : " + paras.get(key));
        }
        String result = "";
        try {
            http.executeMethod(method);
            result = method.getResponseBodyAsString();

        } catch (IOException e) {
            result = "";
            e.printStackTrace();
        }
        logger.info(result);
        return result;
    }


    public static String requestAsHttpGET(String urlvalue) {
        String inputLine = "";
        try {
            URL url = new URL(urlvalue);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            urlConnection.setReadTimeout(100000);
            urlConnection.setConnectTimeout(100000);
            String line = in.readLine();
            while (line != null) {
                inputLine += line;
                line = in.readLine();
            }
        } catch (SSLHandshakeException d) {
            requestAsHttpGET(urlvalue);
            d.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        }
        logger.debug("\rHTTP:" + urlvalue + "\rRETURN:" + inputLine);
        return inputLine;
    }

    public static String requestAsHttpGETForException(String urlvalue) throws IOException {
        String inputLine = "";

        URL url;

        url = new URL(urlvalue);

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line = in.readLine();
        while (line != null) {
            inputLine += line;
            line = in.readLine();
        }

        logger.debug("\rHTTP:" + urlvalue + "\rRETURN:" + inputLine);
        return inputLine;
    }
    
    public static String getContent(Map<String, String> params, String privateKey, String charset) {
    	List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        String prestr = "";

        for (int i = 0; i < keys.size(); i++) {
            String key = (String) keys.get(i);
            String value = (String) params.get(key);
            if (!StringUtils.isEmpty(value)) {
                if (i == keys.size() - 1) {
                    prestr = prestr + key + "=" + value;
                } else {
                    prestr = prestr + key + "=" + value + "&";
                }
            }
        }
        return prestr + privateKey;
    }
    
    public static String getEncodingContent(Map<String, String> params, String charset) {
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);
        String prestr = "";

        for (int i = 0; i < keys.size(); i++) {
            String key = (String) keys.get(i);
            String value = (String) params.get(key);
            try {
            	if(value !=null && !"".equals(value)){
            		value = URLEncoder.encode(value,charset);
            	}
				
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
            if (!StringUtils.isEmpty(value)) {
                if (i == keys.size() - 1) {
                    prestr = prestr + key + "=" + value;
                } else {
                    prestr = prestr + key + "=" + value + "&";
                }
            }
        }
        return prestr;
    }
    
    /**
     * @author: zrb
     * 修改时间：2015年8月7日 - 上午11:25:25<br/>
     * 功能说明：发送http的json数据<br/>
     * @param url
     * @param json
     * @return 回调结果
     * @throws IOException 
     * @throws Exception
     */
    public static final String postHttpByJsonData(String url, String json) throws IOException{
		HttpClient client = new HttpClient();
		HttpConnectionManagerParams params = client.getHttpConnectionManager().getParams();
		params.setConnectionTimeout(5000);
		params.setSoTimeout(3000);
		params.setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		client.getHttpConnectionManager().setParams(params);
		PostMethod post = new PostMethod(url);
		StringRequestEntity strRequest = new StringRequestEntity(json, "application/json", "utf-8");
		post.setRequestEntity(strRequest);
		logger.info("Http请求["+url+"]发出请求...");
		int code = client.executeMethod(post);
		if(code==HttpStatus.SC_OK){
			String charset = post.getResponseCharSet().toLowerCase();
			String postResponse = post.getResponseBodyAsString();
			postResponse = new String (postResponse.getBytes(charset), "utf-8");
			post.releaseConnection();
			logger.info("请求响应正文是：" + postResponse);
			return postResponse;
		}
		post.releaseConnection();
		throw new IOException("请求状态码返回：" + code);
	}
    
    public static final String postHttpAsXml(String url, String body) throws IOException{
    	HttpClient client = new HttpClient();
		HttpConnectionManagerParams params = client.getHttpConnectionManager().getParams();
		params.setConnectionTimeout(5000);
		params.setSoTimeout(3000);
		params.setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		client.getHttpConnectionManager().setParams(params);
		PostMethod post = new PostMethod(url);
		StringRequestEntity strRequest = new StringRequestEntity(body, "text/xml", "utf-8");
		post.setRequestEntity(strRequest);
		logger.info("Http请求["+url+"]发出请求...");
		int code = client.executeMethod(post);
		if(code==HttpStatus.SC_OK){
			String charset = post.getResponseCharSet().toLowerCase();
			String postResponse = post.getResponseBodyAsString();
			postResponse = new String (postResponse.getBytes(charset), "utf-8");
			post.releaseConnection();
			logger.info("请求响应正文是：" + postResponse);
			return postResponse;
		}
		post.releaseConnection();
		throw new IOException("请求状态码返回：" + code);
    }
}
