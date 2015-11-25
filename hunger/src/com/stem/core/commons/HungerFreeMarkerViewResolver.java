package com.stem.core.commons;

import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

public class HungerFreeMarkerViewResolver extends FreeMarkerViewResolver {
	
	public HungerFreeMarkerViewResolver(){
		super();
		//可以配置所有在模板中可以直接使用的参数
		//getAttributesMap().put("staticFilePrefixUrl", StaticFileSysUtils.FILE_PERFIX);
	}
}
