package com.stem.wechat;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stem.core.constant.TigerConstants;
import com.stem.entity.TigerAccessToken;
import com.stem.service.TigerAccessTokenService;

public class TigerUtils {

	private static Logger logger = LoggerFactory.getLogger(TigerUtils.class);

	public static TigerAccessToken getAccessTokenBean(TigerAccessTokenService tigerAccessTokenService) throws Exception{
		TigerAccessToken accessTokenBean = tigerAccessTokenService.getOne(TigerConstants.ACCESS_TOKEN_ID);
		if(null==accessTokenBean){
			Map<String, Object> accessTokenMap = WeChat.getAccessTokenBean();
			accessTokenBean = new TigerAccessToken();
			if(null!=accessTokenMap){
				accessTokenBean.setId(TigerConstants.ACCESS_TOKEN_ID);
				Object errcode = accessTokenMap.get("errcode");
				if(null!=errcode){
					logger.error("获取AccessToken失败：" + accessTokenMap.get("errmsg").toString());
				}else{
					accessTokenBean.setAccesstoken(accessTokenMap.get("access_token").toString());
					accessTokenBean.setExpiresin(Integer.valueOf(accessTokenMap.get("expires_in").toString()));
					accessTokenBean.setCreated(System.currentTimeMillis());
					tigerAccessTokenService.add(accessTokenBean);
				}
			}
		}else{
			long creatTime = accessTokenBean.getCreated();
			long expires = accessTokenBean.getExpiresin();
			long now = System.currentTimeMillis();
			if((now - creatTime - 5000)>expires*1000){
				Map<String, Object> accessTokenMap = WeChat.getAccessTokenBean();
				if(null!=accessTokenMap){
					Object errcode = accessTokenMap.get("errcode");
					if(null!=errcode){
						logger.error("获取AccessToken失败：" + accessTokenMap.get("errmsg").toString());
					}else{
						accessTokenBean.setAccesstoken(accessTokenMap.get("access_token").toString());
						accessTokenBean.setExpiresin(Integer.valueOf(accessTokenMap.get("expires_in").toString()));
						accessTokenBean.setCreated(now);
						tigerAccessTokenService.updateByPK(accessTokenBean);
					}
				}
			}
		}
		return accessTokenBean;
	}
}