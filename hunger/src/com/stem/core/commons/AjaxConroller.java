package com.stem.core.commons;

import java.io.IOException;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AjaxConroller extends BaseController{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	protected final void writeJson(String json){
		response.setContentType("application/json;charset=UTF-8");
		write(json);
	}
	
	protected final void writeHtml(String str){
		response.setContentType("text/html;charset=UTF-8");
		write(str);
	}
	
	private void write(String str){
		PrintWriter pw;
		try {
			pw = response.getWriter();
			pw.write(str);
			pw.flush();
		} catch (IOException e) {
			logger.error("发生IO异常!");
		}
	}
}
