package com.stem.core.commons;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseController {

	private HttpServletRequest request;
	
	private HttpServletResponse response;
	
	public HttpServletRequest getRequest() {
		return request;
	}

	@Resource
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	@Resource
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
}
