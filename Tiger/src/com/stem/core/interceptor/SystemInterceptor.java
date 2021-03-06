package com.stem.core.interceptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SystemInterceptor extends HandlerInterceptorAdapter {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private List<String> noFilters = new ArrayList<String>();
	
	//正则表达式匹配
	private String whiteListRule = "";
	
	{
		String[] whiteList = new String[] { "login.htm", "index.htm", "logout.htm" };
		List<String> temp = Arrays.asList(whiteList);
		this.noFilters.addAll(temp);
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		if(uri.equals(contextPath) || uri.equals(contextPath+"/")){
			return true;
		}
		
		uri = uri.substring((contextPath+"/").length());
		for (String s : noFilters) {
			try {
				if (uri.equals(s)) {
					return true;
				}
			} catch (Exception e1) {
				logger.error("地址过滤异常【"+e1.getMessage()+"】,规则是" + s +"，地址是：" + uri);
				return false;
			}
		}
		
		try {
			if(!StringUtils.isEmpty(this.whiteListRule)){
				Matcher matcher = Pattern.compile(whiteListRule).matcher(uri);
				if(matcher.matches()){
					return true;
				}
			}
		} catch (Exception e) {
			logger.error("非法的地址过滤正则表达式【" + this.whiteListRule +"】，规则未启用...");
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
		if(modelAndView!=null){
			if(!modelAndView.getModelMap().containsKey("basepath")){
				modelAndView.addObject("basepath", request.getContextPath());
			}
		}else{
			if(request.getAttribute("basepath")==null){
				request.setAttribute("basepath", request.getContextPath());
			}
		}
		super.postHandle(request, response, handler, modelAndView);
	}

	public List<String> getNoFilters() {
		return noFilters;
	}

	public void setNoFilters(List<String> noFilters) {
		if(noFilters!=null){
			this.noFilters.addAll(noFilters);
		}
	}

	public void setWhiteListRule(String whiteListRule) {
		if(null!=whiteListRule){
			whiteListRule = whiteListRule.trim();
		}
		this.whiteListRule = whiteListRule;
	}
}