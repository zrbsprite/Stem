package com.stem.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;

import com.mchange.lang.ByteUtils;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.core.interfaces.IFileDeal;

/**
 * 
 * @author ruibo
 * e.g: 584449774D5456634D4464634D6A59784E444D334F4467784D4449324E7A41774C545575616E426E
 */
public class ImageDealImpl implements IFileDeal {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public String store(InputStream stream, String fileName) {
		String basePath = PropertiesUtils.getConfigByKey("file_upload_basepath");
		String sp = File.separator;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy"+ sp + "MM" + sp +"dd");
		String path = sp + sf.format(new Date()) + sp + System.currentTimeMillis() + "-" + RandomUtils.nextInt(6) + StringUtils.getFilenameExtension(fileName);
		File destination = new File(basePath + sp + "image" + path);
		try {
			FileUtils.copyInputStreamToFile(stream, destination);
		} catch (IOException e) {
			logger.error("文件["+path+"]上传异常："+e.getMessage());
			return null;
		}finally{
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		byte[] tempByte;
		try {
			tempByte = Base64Utils.encode(path.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			tempByte = new byte[0];
		}
		return ByteUtils.toHexAscii(tempByte);
	}

	@SuppressWarnings("unchecked")
	@Override
	public byte[] fetch(String path) {
		String basePath = PropertiesUtils.getConfigByKey("file_upload_basepath");
		byte[] aPath = ByteUtils.fromHexAscii(path);
		byte[] bPath = Base64Utils.decode(aPath);
		try {
			path = new String(bPath, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		File file = new File(basePath + File.separator +"image" + path);
		FileInputStream fis = null;
		byte[] result = null;
		try {
			fis = new FileInputStream(file);
			result = new byte[fis.available()];
			fis.read(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=fis){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
