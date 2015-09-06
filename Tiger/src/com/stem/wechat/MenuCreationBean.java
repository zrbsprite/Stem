package com.stem.wechat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.stem.core.AppContext;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.wechat.oauth.Menu;

public class MenuCreationBean implements InitializingBean{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void afterPropertiesSet() throws Exception{
		String isCreateMenu = PropertiesUtils.getConfigByKey("re_create_menu");
		boolean flag = Boolean.parseBoolean(isCreateMenu);
		if(flag){
			logger.info("重新生成菜单开始");
			String path = getClass().getClassLoader().getResource("/").getPath();
			String realPath = path + "configuration/menu.json";
			FileInputStream fis = new FileInputStream(realPath);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			StringBuffer json = new StringBuffer();
			String line;
			while(null!=(line=br.readLine())){
				json.append(line.trim());
			}
			Menu menu = new Menu();
			String accessToken = (String) AppContext.getContext().getValue(AppContext.ACCESS_TOKEN_KEY);
			boolean isSuccess = menu.createMenu(accessToken, json.toString());
			if(!isSuccess){
				logger.error("创建微信菜单失败！");
			}
			br.close();
			isr.close();
			fis.close();
			logger.info("重新生成菜单结束！");
		}
	}

}
