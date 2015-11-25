package com.stem.core.commons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.support.RequestContext;

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
}