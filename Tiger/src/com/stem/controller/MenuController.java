package com.stem.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerAccessToken;
import com.stem.service.TigerAccessTokenService;
import com.stem.wechat.TigerUtils;
import com.stem.wechat.oauth.Menu;

@Controller
@RequestMapping("admin")
public class MenuController extends AjaxConroller {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TigerAccessTokenService tigerAccessTokenService;
	
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
