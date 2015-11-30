package com.penzias.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.penzias.core.commons.PropertiesInitBean;
import com.penzias.core.commons.PropertiesInitBean.PropertiesUtils;

/**
 * 描述：对super用户进行权限管理<br/>
 * 作者：data-zrb <br/>
 * 修改日期：2015年10月13日 - 下午3:29:21<br/>
 */
public class DemoFilter implements Filter {

	private String ignoreUrls = null;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		String config = filterConfig.getInitParameter("ignoreUrls");
		if(null!=config && !"".equals(config)){
			ignoreUrls = config;
		}
	}

	@Override
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
			throws IOException,ServletException{
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		if(null!=this.ignoreUrls){
			String uri = httpRequest.getServletPath();
			String[] array = this.ignoreUrls.split(",");
			for(String str : array){
				if(str.equals(uri)){
					chain.doFilter(request, response);
					return;
				}
			}
		}
		HttpSession session = httpRequest.getSession();
		String sessionKey = PropertiesUtils.getConfigByKey("");
		Object superUser = session.getAttribute(sessionKey);
		if(superUser!=null){
			chain.doFilter(request, response);
		}else{
			request.getRequestDispatcher("/fore/index").forward(request, response);
		}
	}

	@Override
	public void destroy(){}
}
