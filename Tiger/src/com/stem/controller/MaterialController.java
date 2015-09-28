package com.stem.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.ByteArrayPartSource;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerAccessToken;
import com.stem.service.TigerAccessTokenService;
import com.stem.util.JsonUtil;
import com.stem.wechat.TigerUtils;

/**
 * 描述：素材管理Controller<br/>
 * 作者：stem zhang <br/>
 * 修改日期：2015年9月28日 - 上午11:16:10<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
@Controller
@RequestMapping("wechat")
public class MaterialController extends AjaxConroller {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TigerAccessTokenService tigerAccessTokenService;
	
	@RequestMapping("mtadd")
	public String uploadImage(){
		String root = getContentRealPath();
		File dic = new File(root + "/static/product");
		File[] files = dic.listFiles();
		for(File file : files){
			try{
				FileInputStream fis = new FileInputStream(file);
				uploadImageMaterial(fis, file.getName());
			} catch (FileNotFoundException e){
				e.printStackTrace();
			}
		}
		return "fore/success";
	}
	
	//执行上传图片素材操作
	private void uploadImageMaterial(InputStream is, String fileName){
		doUpload(is, fileName, "iamge");
	}
	
	//执行上传操作
	private void doUpload(InputStream is, String fileName, String type){
		String uri = PropertiesUtils.getConfigByKey("material_add_upload");
		HttpClient client = new HttpClient();
		HttpConnectionManagerParams params = client.getHttpConnectionManager().getParams();
		params.setConnectionTimeout(5000);
		params.setSoTimeout(5000);
		client.getHttpConnectionManager().setParams(params);
		PostMethod post = new PostMethod(uri);
		try {
			byte[] array = IOUtils.toByteArray(is);
			ByteArrayPartSource ps = new ByteArrayPartSource(fileName, array);
			//获取AccessToken
			TigerAccessToken accessToken = TigerUtils.getAccessTokenBean(tigerAccessTokenService);
			String token = accessToken.getAccesstoken();
			Part[] parts = {new FilePart("media", ps), new StringPart("access_token", token), new StringPart("type", type)};
			MultipartRequestEntity multipartEntity = new MultipartRequestEntity(parts, post.getParams());
			post.setRequestEntity(multipartEntity);
			int code = client.executeMethod(post);
			logger.info("微信上传素材请求状态码是：" + code);
			if(code==HttpStatus.SC_OK){
				String postResponse = post.getResponseBodyAsString();
				logger.info("微信上传素材信息是：" + postResponse);
				Map<String, String> map = (Map<String, String>) JsonUtil.str2map(postResponse, new TypeReference<Map<String, String>>(){});
				String errcode = map.get("errcode"); 
				if(!StringUtils.isEmpty(errcode)){
					logger.warn("微信素材上传异常，errcode is -->" + errcode);
					return;
				}
				String mediaId = map.get("media_id");
				logger.info("media_id是:" + mediaId);
			}else{
				logger.warn("微信素材上传异常，返回响应码是【"+code+"】");
			}
		} catch (HttpException e) {
			logger.error("微信Http上传素材请求失败"+e.getMessage());
		} catch (IOException e) {
			logger.error("微信Http上传素材请求IO失败"+e.getMessage());
		} catch (Exception e){
			e.printStackTrace();
			logger.error("微信Http上传素材请求失败"+e.getMessage());
		}
	}
}
