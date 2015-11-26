package com.penzias.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.penzias.core.interfaces.IStorage;

@Controller
@RequestMapping("")
public class ValidationCodeController {
	
	private DefaultKaptcha captchaProducer;
	
	private IStorage<String> store;

	@RequestMapping("verifycode")
	public void createValidationCode(HttpServletRequest request, HttpServletResponse response) {
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control","no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		response.setHeader("Pragma", "no-cache");
		response.setContentType("image/jpeg");
		String capText = this.captchaProducer.createText();
		store.store(capText);
		BufferedImage bi = this.captchaProducer.createImage(capText);
		try {
			ImageIO.write(bi, "jpg", response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public DefaultKaptcha getCaptchaProducer() {
		return captchaProducer;
	}

	@Resource
	public void setCaptchaProducer(DefaultKaptcha captchaProducer) {
		this.captchaProducer = captchaProducer;
	}

	public IStorage<String> getStore() {
		return store;
	}

	@Resource
	public void setStore(IStorage<String> store) {
		this.store = store;
	}
}