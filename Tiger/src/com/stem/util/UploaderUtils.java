package com.stem.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;

import com.mchange.lang.ByteUtils;

public class UploaderUtils {

	private static Logger logger = LoggerFactory.getLogger(UploaderUtils.class);
	
	public static String upload(String typeFolder, InputStream fileStream, String fileName, HttpServletRequest request) throws IOException{
		String uploadPath = "";
		String configPath = "";
		uploadPath = request.getSession().getServletContext().getRealPath("/"); 
		SimpleDateFormat sf = new SimpleDateFormat("yyyy"+File.separator+"MM"+File.separator+"dd");
		String nowStr = sf.format(new Date());
		String oname = fileName;
		String ext = StringUtils.getFilenameExtension(oname);
		String appendPath = configPath + File.separator + typeFolder + File.separator + nowStr + File.separator + System.currentTimeMillis()
				+ new Random().nextInt(6) + "." +ext;
		String realPath = uploadPath + appendPath;
		File filePath = new File(realPath);	
		try {
			logger.debug("文件["+filePath.getAbsolutePath()+"]开始上传");
			FileUtils.copyInputStreamToFile(fileStream, filePath);
		} catch (IOException e) {
			logger.error("文件["+filePath.getAbsolutePath()+"]上传异常："+e.getMessage());
			throw e;
		}
		logger.debug("文件相对路径是:" + appendPath);
		int port = request.getServerPort();
		String basePath = request.getScheme()+"://"+request.getServerName();
		if(port!=80){
			basePath=basePath+":"+port;
		}
		basePath += request.getContextPath()+"/";
		logger.debug("文件["+filePath.getAbsolutePath()+"]上传结束.....");
		return appendPath;
	}
	
	public static String encodeFilePath(String path){
		try {
			byte[] fpath = Base64Utils.encode(path.getBytes("UTF-8"));
			path = ByteUtils.toHexAscii(fpath);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	public static String decodeFilePath(String key){
		byte[] eStr = ByteUtils.fromHexAscii(key);
		byte[] bStr = Base64Utils.decode(eStr);
		String endStr = key;
		try {
			endStr = new String(bStr, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return endStr;
	}
}
