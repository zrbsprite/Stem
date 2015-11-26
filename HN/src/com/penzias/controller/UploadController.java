package com.penzias.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.penzias.core.ImageDealImpl;
import com.penzias.core.commons.AjaxConroller;

/**
 * @author JSprite
 * 功能：UploadController	
 */
@Controller
@RequestMapping("io")
public class UploadController extends AjaxConroller{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("upload")
	public void upload(MultipartFile picture, PrintWriter pw){
		String type = picture.getContentType();
		logger.debug("文件上传类型是：" + type);
		String oname = picture.getOriginalFilename();
		InputStream is = null;
		try {
			is = picture.getInputStream();
		} catch (IOException e) {
			logger.warn("IO异常，无法完成上传操作...");
			return;
		}
		ImageDealImpl deal = new ImageDealImpl();
		deal.store(is, oname);
	}
}
