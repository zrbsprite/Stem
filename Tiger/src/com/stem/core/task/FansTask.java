package com.stem.core.task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.core.commons.SpringContextUtil;
import com.stem.entity.TigerAccessToken;
import com.stem.entity.WxUserinfo;
import com.stem.service.TigerAccessTokenService;
import com.stem.service.WxUserinfoService;
import com.stem.util.HttpUtils;
import com.stem.util.JsonUtil;
import com.stem.wechat.TigerUtils;

public class FansTask extends Observable{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private int threadSum = 0;
	
	@Resource
	private WxUserinfoService wxUserinfoService;
	
	public void run(){
		logger.info("更新粉丝用户信息开始……");
		//添加观察者
		addObserver(new FansTaskObserver());
		threadSum = 0;
		//拉取粉丝关注列表
		String fansListUrl = PropertiesUtils.getConfigByKey("fans_get_info_list");
		//批量获取用户信息
		String batchFansUrl = PropertiesUtils.getConfigByKey("fans_batch_get_info_detail");
		TigerAccessTokenService tokenService = SpringContextUtil.getBean("tigerAccessTokenService");
		TigerAccessToken token = null;
		String nextOpenid = "0";
		while(nextOpenid!=null && !"".equals(nextOpenid)){
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
			if(!"0".equals(nextOpenid)){
				params.put("next_openid",nextOpenid);
			}
			String jsonResult = HttpUtils.requestAsHttpPOST(fansListUrl, params);
			Map<String, Object> mapJson = (Map<String, Object>) JsonUtil.str2map(jsonResult, new TypeReference<Map<String, Object>>(){});
			nextOpenid = (String) mapJson.get("next_openid");
			int total = (int) mapJson.get("total");
			logger.info("本次拉取微信粉丝用户共:" + total + "条");
			//如果少于10000那么不用在查询了
			if(total<10000){
				nextOpenid = null;
			}
			//如果没有查询到数据，再次查询
			if(total<=0){
				continue;
			}
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
								sb.append("{\"openid\": \""+str+"\"},");
							}
							if(sb.toString().endsWith(",")){
								sb.deleteCharAt(sb.lastIndexOf(","));
							}
							sb.append("]}");
							
							//执行批量查询
							try{
								String result = HttpUtils.postHttpByJsonData(String.format(batchFansUrl, accessToken), sb.toString());
								Map<String, Object> resultMap = (Map<String, Object>) JsonUtil.str2map(result, new TypeReference<Map<String, Object>>() {});
								List<?> userList = (List<?>) resultMap.get("user_info_list");
								List<WxUserinfo> wxUserinfoList = new ArrayList<WxUserinfo>();
								for(Object obj : userList){
									Map<String, Object> objMap = (Map<String, Object>) obj;
									String isSub = objMap.get("subscribe").toString();
									if("0".equals(isSub)){
										continue;
									}
									WxUserinfo wxUserinfo = new WxUserinfo();
									wxUserinfo.setSubscribeTime(objMap.get("subscribe_time").toString());
									wxUserinfo.setSubscribe(isSub);
									wxUserinfo.setOpenid(objMap.get("openid").toString());
									wxUserinfo.setNickname(filterEmoji(objMap.get("nickname").toString()));
									wxUserinfo.setSex(objMap.get("sex").toString());
									wxUserinfo.setCity(objMap.get("city").toString());
									wxUserinfo.setCountry(objMap.get("country").toString());
									wxUserinfo.setProvince(objMap.get("province").toString());
									wxUserinfo.setLanguage(objMap.get("language").toString());
									wxUserinfo.setHeadimgurl(objMap.get("headimgurl").toString());
									Object remark = objMap.get("remark");
									if(null!=remark)
										wxUserinfo.setRemark(remark.toString());
									Object groupid = objMap.get("groupid");
									if(null!=groupid)
										wxUserinfo.setGroupid(groupid.toString());
									wxUserinfoList.add(wxUserinfo);
								}
								wxUserinfoService.doBatchAdd(wxUserinfoList);
								userList = null;
								resultMap = null;
								wxUserinfoList = null;
							} catch (IOException e){
								e.printStackTrace();
							}
							start = end;
							inList = null;
						}
						logger.info("线程"+Thread.currentThread().getId()+"执行完成……");
						//一个线程完成
						sendNotice(threadCount);
					}
				}.start();
				startIndex += needDealCount;
			}
		}
	}
	
	public void sendNotice(int threadCount){
		threadSum ++;
		if(threadCount==threadSum){
			threadSum = 0;
			this.setChanged();
			this.notifyObservers();
		}
	}
	
	private void synTables(){
		this.wxUserinfoService.doSynTables();
		//清空临时表
		this.wxUserinfoService.doTruncateTempTable();
	}
	
	private class FansTaskObserver implements Observer{
		@Override
		public void update(Observable o, Object arg){
			FansTask task = (FansTask)o;
			task.synTables();
		}
	} 
	
	/**
     * 将emoji表情替换成*
     * @param source
     * @return 过滤后的字符串
     */
    private String filterEmoji(String source) {
        if(StringUtils.isNotBlank(source)){
            return source.replaceAll("[\\ud800\\udc00-\\udbff\\udfff\\ud800-\\udfff]", "*");
        }else{
            return source;
        }
    }
}
