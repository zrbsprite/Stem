package com.penzias.core.commons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.support.RequestContext;

import com.penzias.core.commons.PropertiesInitBean.PropertiesUtils;

public abstract class BaseController {

	protected HttpServletRequest request;
	
	protected HttpServletResponse response;
	
	private RequestContext context;
	
	@ModelAttribute
	private void bind(HttpServletRequest request, HttpServletResponse response){
		this.request = request;
		this.response = response;
		this.context = new RequestContext(request);
	}
	
	protected final String getMessage(String key){
		return context.getMessage(key);
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月2日 - 下午4:53:50<br/>
	 * 功能说明：获取每页容量<br/>
	 * @return
	 */
	protected final Integer getPageSize(){
		String pageSize = PropertiesUtils.getConfigByKey("page_per_size");
		return Integer.valueOf(pageSize);
	}
}