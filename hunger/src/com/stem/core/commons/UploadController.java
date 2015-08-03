package com.stem.core.commons;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author JSprite
 * 功能：UploadController	
 */
@Controller
@RequestMapping("pic")
public class UploadController extends AjaxConroller{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("upload")
	public void upload(MultipartFile picture, HttpServletResponse response, HttpServletRequest request){
		String[] fileTypeStr = { "image/gif","image/x-png","image/pjpeg","image/jpeg","image/bmp","image/png"};
		String type = picture.getContentType();
		logger.debug("文件上传类型是：" + type);
		for(String str : fileTypeStr){
			if(type.indexOf(str)!=-1){
				String uploadPath = request.getSession().getServletContext().getRealPath("/");
				SimpleDateFormat sf = new SimpleDateFormat("yyyy"+File.separator+"MM"+File.separator+"dd");
				String nowStr = sf.format(new Date());
				String oname = picture.getOriginalFilename();
				String ext = oname.substring(oname.indexOf("."));
				String appendPath = "/upload" + File.separator + "image" + File.separator + nowStr + File.separator + System.currentTimeMillis()
						+ new Random().nextInt(6) + ext;
				String realPath = uploadPath + appendPath;
				File filePath = new File(realPath);	
				try {
					logger.debug("文件["+filePath.getAbsolutePath()+"]开始上传");
					FileUtils.copyInputStreamToFile(picture.getInputStream(), filePath);
				} catch (IOException e) {
					logger.error("文件["+filePath+"]上传异常："+e.getMessage());
				}
				logger.debug("文件相对路径是:" + appendPath);
				String webUrl = appendPath.replace("\\", "/");
				writeHtml(response, "<script type='text/javascript'>window.parent.closeWin('"+webUrl+"')</script>");
				logger.debug("文件["+filePath+"]上传结束.....");
				break;
			}
		}
	}
}
