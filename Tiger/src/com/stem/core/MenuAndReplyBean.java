package com.stem.core;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.stem.entity.WxImageReply;
import com.stem.entity.WxImageReplyExample;
import com.stem.entity.WxNewsResource;
import com.stem.entity.WxNewsResourceExample;
import com.stem.entity.WxReplyResource;
import com.stem.entity.WxReplyResourceExample;
import com.stem.entity.WxTextReply;
import com.stem.entity.WxTextReplyExample;
import com.stem.service.WxImageReplyService;
import com.stem.service.WxNewsResourceService;
import com.stem.service.WxReplyResourceService;
import com.stem.service.WxTextReplyService;

@Component
public class MenuAndReplyBean implements InitializingBean{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private WxNewsResourceService wxNewsResourceService;
	
	@Resource
	private WxReplyResourceService wxReplyResourceService;
	
	@Resource
	private WxTextReplyService wxTextReplyService;
	
	@Resource
	private WxImageReplyService wxImageReplyService;
	
	@Override
	public void afterPropertiesSet() throws Exception{
		logger.info("System is starting to cache menu data...");
		List<WxNewsResource> wnrList  = this.wxNewsResourceService.list(new WxNewsResourceExample());
		for(WxNewsResource one : wnrList){
			AppContext.getContext().setSyncValue(one.getMenuKey(),one);
		}
		List<WxReplyResource> wrrList =  this.wxReplyResourceService.list(new WxReplyResourceExample());
		AppContext.getContext().setSyncValue("wrr_list", wrrList);
		
		WxTextReplyExample textExample = new WxTextReplyExample();
		textExample.createCriteria().andTextStatusEqualTo(1);
		List<WxTextReply> textList = this.wxTextReplyService.list(textExample);
		AppContext.getContext().setSyncValue("text_list", textList);
		WxImageReplyExample imageExample = new WxImageReplyExample();
		imageExample.createCriteria().andImageStatusEqualTo(1);
		List<WxImageReply> imageList = this.wxImageReplyService.list(imageExample);
		AppContext.getContext().setSyncValue("image_list", imageList);
		
		logger.info("System cache menu data over...");
	}

}
