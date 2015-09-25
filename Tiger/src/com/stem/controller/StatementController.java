package com.stem.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerAccessToken;
import com.stem.service.TigerAccessTokenService;
import com.stem.wechat.TigerUtils;
import com.stem.wechat.WeChat;
import com.stem.wechat.oauth.Menu;
import com.stem.wechat.oauth.Oauth;
import com.stem.wechat.tools.SHA1;

@Controller
@RequestMapping("wechat")
public class StatementController extends AjaxConroller{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TigerAccessTokenService tigerAccessTokenService;
	
	@RequestMapping("msg")
	public void index(PrintWriter writer) throws IOException{
		//validate wechat msg
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		String token = PropertiesUtils.getConfigByKey("token");
		
		//验证URL有效性
		if(!StringUtils.isEmpty(nonce)&&!StringUtils.isEmpty(echostr)){
			List<String> list = new ArrayList<String>();
			list.add(timestamp);
			list.add(nonce);
			list.add(token);
			Collections.sort(list);
			StringBuffer str = new StringBuffer();
			for(String temp : list){
				str.append(temp);
			}
			String result = SHA1.encode(str.toString());
			if(!result.equals(signature)){
				writer.write("");
				return ;
			}
			writer.write(echostr);
		}else{
			String path = getServerLocalePath();
			InputStream stream = request.getInputStream();
			String responseInputString = IOUtils.toString(stream);
			logger.info("微信接口传来报文："+responseInputString);
			String xml = WeChat.processing(responseInputString, path);
			if(!StringUtils.isEmpty(xml)){
				writer.write(xml);
			}else{
				logger.error("响应xml异常为空！");
				writer.write("");
			}
		}
	}
	
	/**
	 * 
	 * 方法名称: index<br/>
	 * 描述：跳转列表页面<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年9月13日-上午8:30:57<br/>
	 * @return
	 */
	@RequestMapping("pro")
	public String index(String code){
		Oauth auth = new Oauth();
		try{
			String json = auth.getToken(code);
			logger.info("获取openid调用接口响应是："+json);
			Map<String, String> map = JSON.parseObject(json,Map.class);
			String openid = map.get("openid");
			request.getSession().setAttribute("openid",openid);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "fore/list";
	}
	
	@RequestMapping("menu")
	public String menu(){
		logger.info("重新生成菜单开始");
		try{
			String path = getClass().getClassLoader().getResource("/").getPath();
			String realPath = path + "configuration/menu.json";
			FileInputStream fis = new FileInputStream(realPath);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			StringBuffer json = new StringBuffer();
			String line;
			while(null!=(line=br.readLine())){
				line = line.trim();
				line = line.replace("${APPID}", PropertiesUtils.getConfigByKey("AppId"));
				line = line.replace("${AppSecret}", PropertiesUtils.getConfigByKey("AppSecret"));
				line = line.replace("${serverPath}", getServerLocalePath());
				json.append(line);
			}
			Menu menu = new Menu();
			
			TigerAccessToken accessTokenBean = TigerUtils.getAccessTokenBean(tigerAccessTokenService);
			String accessToken = accessTokenBean.getAccesstoken(); 
			boolean isSuccess = menu.createMenu(accessToken, json.toString());
			if(!isSuccess){
				logger.error("创建微信菜单失败！");
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e){
			e.printStackTrace();
			logger.error("菜单创建异常\n" + e.getMessage());
		}
		logger.info("重新生成菜单结束！");
		return "fore/ok";
	}
}
