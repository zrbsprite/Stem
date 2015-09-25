package com.stem.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stem.wechat.WeChat;

/**
 * 描述：刷新accessToken<br/>
 * 作者：stem zhang <br/>
 * 修改日期：2015年9月2日 - 下午4:09:41<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class AccessTokenTask {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public void run(){
		try{
			String accessToken = WeChat.getAccessToken();
//			AppContext.getContext().setSyncValue(AppContext.ACCESS_TOKEN_KEY,accessToken);
			logger.info("更新AccessToken成功，值被更新为["+accessToken+"]");
		} catch (Exception e){
			e.printStackTrace();
			logger.warn("获取AccessToken异常:"+e.getMessage());
		}
	}
	
}
