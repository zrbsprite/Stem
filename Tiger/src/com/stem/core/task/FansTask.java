package com.stem.core.task;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.core.commons.SpringContextUtil;
import com.stem.entity.TigerAccessToken;
import com.stem.entity.WxUserinfo;
import com.stem.entity.WxUserinfoExample;
import com.stem.service.TigerAccessTokenService;
import com.stem.service.WxUserinfoService;
import com.stem.util.HttpUtils;
import com.stem.util.JsonUtil;
import com.stem.wechat.TigerUtils;
import com.stem.wechat.bean.UserInfo;

public class FansTask {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private WxUserinfoService wxUserinfoService;
	
	public void run(){
		logger.info("更新粉丝用户信息开始……");
		//拉取粉丝关注列表
		String fansListUrl = PropertiesUtils.getConfigByKey("fans_get_info_list");
		//批量获取用户信息
		String batchFansUrl = PropertiesUtils.getConfigByKey("fans_batch_get_info_detail");
		TigerAccessTokenService tokenService = SpringContextUtil.getBean("tigerAccessTokenService");
		TigerAccessToken token = null;
		String nextOpenid = "";
		while(nextOpenid!=null){
			try{
				token = TigerUtils.getAccessTokenBean(tokenService);
			} catch (Exception e){
				e.printStackTrace();
				logger.error("获取AccessToken异常:" + e.getMessage()+"结束更新粉丝信息!");
				return;
			}
			String accessToken = token.getAccesstoken();
			Map<String, String> params = new HashMap<String, String>();
			params.put("access_token", accessToken);
			if(!"".equals(nextOpenid)){
				params.put("next_openid",nextOpenid);
			}
			String jsonResult = HttpUtils.requestAsHttpPOST(fansListUrl, params);
			Map<String, Object> mapJson = (Map<String, Object>) JsonUtil.str2map(jsonResult, new TypeReference<Map<String, Object>>(){});
			nextOpenid = (String) mapJson.get("next_openid");
			int total = (int) mapJson.get("total");
			logger.info("本次拉取微信粉丝用户共:" + total + "条");
			Map<String, Object> data = (Map<String, Object>) mapJson.get("data");
			List<String> openidList = (List<String>) data.get("openid");
			//开启线程去获取用户详细信息
			int threadCount = Runtime.getRuntime().availableProcessors();
			int threadDealCount = total/threadCount;
			int wait = total%threadCount;
			int startIndex = 0;
 			for(int i=1;i<=threadCount; i++){
 				int needDealCount = threadDealCount;
				if(i==1){
					needDealCount += wait;
				}
				List<String> subList = openidList.subList(startIndex, startIndex+needDealCount);
				new Thread(){
					@Override
					public void run(){
						logger.info("线程"+Thread.currentThread().getId()+"启动……");
						int sList = subList.size();
						int sTime = (sList-1)/100 + 1;
						int start = 0; 
						for(int index=0;index<sTime; index++){
							int end = start+100;
							if(index==sTime-1){
								end = sList;
							}
							List<String> inList = subList.subList(start, end);
							StringBuffer sb = new StringBuffer("{\"user_list\": [");
							for(String str : inList){
								sb.append("{\"openid\": \""+str+"\"}");
							}
							sb.append("]}");
							
							//执行批量查询
							try{
								String result = HttpUtils.postHttpByJsonData(batchFansUrl, sb.toString());
								Map<String, Object> resultMap = (Map<String, Object>) JsonUtil.str2map(result, new TypeReference<Map<String, Object>>() {});
								List<?> userList = (List<?>) resultMap.get("user_info_list");
								for(Object obj : userList){
									UserInfo user = (UserInfo) obj;
									WxUserinfo wxUserinfo = new WxUserinfo();
									BeanUtils.copyProperties(wxUserinfo, user);
									wxUserinfo.setSubscribeTime(user.getSubscribe_time()+"");
									WxUserinfoExample wxUserinfoExample = new WxUserinfoExample();
									wxUserinfoExample.createCriteria().andOpenidEqualTo(user.getOpenid());
									List<WxUserinfo> infoList = wxUserinfoService.list(wxUserinfoExample);
									if(infoList.size()<=0){
										wxUserinfoService.add(wxUserinfo);
									}else{
										wxUserinfoService.update(wxUserinfo, wxUserinfoExample);
									}
								}
							} catch (IOException | IllegalAccessException | InvocationTargetException e){
								e.printStackTrace();
							}
						}
						logger.info("线程"+Thread.currentThread().getId()+"执行完成……");
					}
				}.start();
				startIndex += needDealCount;
			}
		}
	}
}
