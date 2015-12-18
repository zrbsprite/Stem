package com.penzias.controller;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.penzias.core.ImageDealImpl;

@Controller
@RequestMapping("anno")
public class SystemController {

	@RequestMapping("/error")
	public String error(){
		return "";
	}
	
	@RequestMapping("/nologin")
	public String noLogin(){
		return "door/login";
	}
	
	@RequestMapping("/img")
	public void sendImage(String path, HttpServletResponse response){
		ImageDealImpl deal = new ImageDealImpl();
		byte[] data = deal.fetch(path);
		try {
			OutputStream os = response.getOutputStream();
			IOUtils.write(data, os);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/404")
	public String error404(){
		return "anno/404";
	}
	
	@RequestMapping("/500")
	public String error500(){
		return "anno/500";
	}
}
