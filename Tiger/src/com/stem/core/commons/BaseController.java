package com.stem.core.commons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
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
	
	/**
	 * 获取ip
	 * @param request
	 * @return
	 */
	public String getIp(HttpServletRequest request) {
		if (request == null)
			return "";
		String ip = request.getHeader("X-Requested-For");
		if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("X-Forwarded-For");
		}
		if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	/**
	 * @author: stem zhang
	 * 修改时间：2015年9月22日 - 下午4:47:40<br/>
	 * 功能说明：获取contextPath 全地址<br/>
	 * @return
	 */
	protected String getServerLocalePath(){
		String schame = request.getScheme();
		String serverName = request.getServerName();
		int port = request.getServerPort();
		String contextPath = request.getContextPath();
		String sPort = "";
		if(port!=80){
			sPort = ":" + port;
		}
		return schame + "://" + serverName + sPort + "/" + contextPath;
	}
}
