package com.stem.core.interceptor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserRequestInterceptor extends HandlerInterceptorAdapter {

	private List<String> filtUrlList = new LinkedList<String>();
	
	private String msgUrl;
	
	public void init(){
		String path = getClass().getClassLoader().getResource("/").getPath();
		String realPath = path + "configuration/interceptor";
		try {
			FileInputStream fis = new FileInputStream(realPath);
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			BufferedReader br = new BufferedReader(isr); 
			String line;
			while(null!=(line=br.readLine())){
				filtUrlList.add(line);
				if(line.indexOf("[deal]")!=-1){
					msgUrl = line;
				}
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		String uri = request.getServletPath();
		
		super.afterCompletion(request, response, handler, ex);
	}
}
