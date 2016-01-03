package com.stem.core;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.stem.entity.WxNewsResource;
import com.stem.entity.WxNewsResourceExample;
import com.stem.entity.WxReplyResource;
import com.stem.entity.WxReplyResourceExample;
import com.stem.service.WxNewsResourceService;
import com.stem.service.WxReplyResourceService;

@Component
public class MenuAndReplyBean implements InitializingBean{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private WxNewsResourceService wxNewsResourceService;
	
	@Resource
	private WxReplyResourceService wxReplyResourceService;
	
	@Override
	public void afterPropertiesSet() throws Exception{
		logger.info("System is starting to cache menu data...");
		List<WxNewsResource> wnrList  = this.wxNewsResourceService.list(new WxNewsResourceExample());
		for(WxNewsResource one : wnrList){
			AppContext.getContext().setSyncValue(one.getMenuKey(),one);
		}
		List<WxReplyResource> wrrList =  this.wxReplyResourceService.list(new WxReplyResourceExample());
		AppContext.getContext().setSyncValue("wrr_list", wrrList);
		
		logger.info("System cache menu data over...");
	}

}
