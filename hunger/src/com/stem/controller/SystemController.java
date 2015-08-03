package com.stem.controller;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stem.core.ImageDealImpl;

@Controller
@RequestMapping("anno")
public class SystemController {

	@RequestMapping("/error")
	public String error(){
		return "";
	}
	
	@RequestMapping("/nologin")
	public String noLogin(){
		return "fore/home";
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
}
