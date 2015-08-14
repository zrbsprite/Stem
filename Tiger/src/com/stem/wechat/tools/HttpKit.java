/**
 * 微信公众平台开发模式(JAVA) SDK
 * (c) 2012-2013 ____′↘夏悸 <wmails@126.cn>, MIT Licensed
 * http://www.jeasyuicn.com/wechat
 */
package com.stem.wechat.tools;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;

import com.alibaba.fastjson.JSON;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.Response;
import com.stem.wechat.WeChat;
import com.stem.wechat.bean.Attachment;
import com.stem.wechat.bean.UserInfo;

public class HttpKit {

	private static final String DEFAULT_CHARSET = "UTF-8";

	/**
	 * @return 返回类型:
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchProviderException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 * @description 功能描述: get 请求
	 */
	public static String get(String url,Map<String, String> params,Map<String, String> headers)
			throws IOException,ExecutionException,InterruptedException{

		AsyncHttpClient http = new AsyncHttpClient();
		AsyncHttpClient.BoundRequestBuilder builder = http.prepareGet(url);
		builder.setBodyEncoding(DEFAULT_CHARSET);
		if(params != null && !params.isEmpty()){
			Set<String> keys = params.keySet();
			for(String key:keys){
				builder.addQueryParam(key,params.get(key));
			}
		}

		if(headers != null && !headers.isEmpty()){
			Set<String> keys = headers.keySet();
			for(String key:keys){
				builder.addHeader(key,params.get(key));
			}
		}
		Future<Response> f = builder.execute();
		String body = f.get().getResponseBody(DEFAULT_CHARSET);
		http.close();
		return body;
	}

	/**
	 * @return 返回类型:
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchProviderException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 * @description 功能描述: get 请求
	 */
	public static String get(String url) throws KeyManagementException,NoSuchAlgorithmException,
			NoSuchProviderException,UnsupportedEncodingException,IOException,ExecutionException,
			InterruptedException{

		return get(url,null);
	}

	/**
	 * @return 返回类型:
	 * @throws IOException
	 * @throws NoSuchProviderException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 * @throws UnsupportedEncodingException
	 * @description 功能描述: get 请求
	 */
	public static String get(String url,Map<String, String> params) throws KeyManagementException,
			NoSuchAlgorithmException,NoSuchProviderException,UnsupportedEncodingException,
			IOException,ExecutionException,InterruptedException{

		return get(url,params,null);
	}

	/**
	 * @return 返回类型:
	 * @throws IOException
	 * @throws NoSuchProviderException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 * @description 功能描述: POST 请求
	 */
	public static String post(String url,Map<String, String> params) throws IOException,
			ExecutionException,InterruptedException{

		AsyncHttpClient http = new AsyncHttpClient();
		AsyncHttpClient.BoundRequestBuilder builder = http.preparePost(url);
		builder.setBodyEncoding(DEFAULT_CHARSET);
		if(params != null && !params.isEmpty()){
			Set<String> keys = params.keySet();
			for(String key:keys){
				builder.addQueryParam(key,params.get(key));
			}
		}
		Future<Response> f = builder.execute();
		String body = f.get().getResponseBody(DEFAULT_CHARSET);
		http.close();
		return body;
	}

	/**
	 * 下载资源
	 *
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static Attachment download(String url) throws ExecutionException,InterruptedException,
			IOException{

		Attachment att = new Attachment();
		AsyncHttpClient http = new AsyncHttpClient();
		AsyncHttpClient.BoundRequestBuilder builder = http.prepareGet(url);
		builder.setBodyEncoding(DEFAULT_CHARSET);
		Future<Response> f = builder.execute();
		if(f.get().getContentType().equalsIgnoreCase("text/plain")){
			att.setError(f.get().getResponseBody(DEFAULT_CHARSET));
		} else{
			BufferedInputStream bis = new BufferedInputStream(f.get().getResponseBodyAsStream());
			String ds = f.get().getHeader("Content-disposition");
			String fullName = ds.substring(ds.indexOf("filename=\"") + 10,ds.length() - 1);
			String relName = fullName.substring(0,fullName.lastIndexOf("."));
			String suffix = fullName.substring(relName.length() + 1);

			att.setFullName(fullName);
			att.setFileName(relName);
			att.setSuffix(suffix);
			att.setContentLength(f.get().getHeader("Content-Length"));
			att.setContentType(f.get().getContentType());
			att.setFileStream(bis);
		}
		http.close();
		return att;
	}

	public static String post(String url,String s) throws IOException,ExecutionException,
			InterruptedException{

		AsyncHttpClient http = new AsyncHttpClient();
		AsyncHttpClient.BoundRequestBuilder builder = http.preparePost(url);
		builder.setBodyEncoding(DEFAULT_CHARSET);
		builder.setBody(s);
		Future<Response> f = builder.execute();
		String body = f.get().getResponseBody(DEFAULT_CHARSET);
		http.close();
		return body;
	}

	public static String upload(String uri, File file) throws Exception{
		HttpClient client = new HttpClient();
		HttpConnectionManagerParams params = client.getHttpConnectionManager().getParams();
		params.setConnectionTimeout(5000);
		params.setSoTimeout(5000);
		client.getHttpConnectionManager().setParams(params);
		PostMethod post = new PostMethod(uri);
		try {
			Part[] parts = {new FilePart("media", file)};
			MultipartRequestEntity multipartEntity = new MultipartRequestEntity(parts, post.getParams());
			post.setRequestEntity(multipartEntity);
			int code = client.executeMethod(post);
			if(code==HttpStatus.SC_OK){
				String postResponse = post.getResponseBodyAsString();
				String charset = post.getResponseCharSet();
				return new String(postResponse.getBytes("UTF-8"), charset);
			}else{
				throw new Exception("http响应码是："+code);
			}
		}catch(Exception e){
			throw e;
		}
	}
	
	public static void main(String[] args) throws Exception{

		String accessToken = "ulhEL9F2CciJezmGj47C-d3hAJZwXiAANctVIwSHwBRK7Z1enIRWeZKZekk8jS5abIkCo2YmMSDlqUFKOKvSaw";
		String openId = "oeZTVt6XlCphRnCI-DlpdTyk27p4";
		UserInfo u = WeChat.user.getUserInfo(accessToken,openId);
		System.out.println(JSON.toJSONString(u));
	}
}