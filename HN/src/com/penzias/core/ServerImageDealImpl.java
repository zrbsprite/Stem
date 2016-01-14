package com.penzias.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.penzias.core.commons.ContextInitListener.PrivateCacheContext;
import com.penzias.core.interfaces.IFileDeal;

/**
 * @author ruibo
 * @description: 图片保存在server下面<br/>
 */
@SuppressWarnings("unchecked")
public class ServerImageDealImpl implements IFileDeal {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public String store(InputStream stream, String fileName) {
		String realPath = (String) PrivateCacheContext.getData("upload_real_path");
		String basePath = realPath;
		String sp = File.separator;
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		String path = sp + sf.format(new Date()) + sp + System.currentTimeMillis() + "-" + RandomUtils.nextInt(6) + "." + StringUtils.getFilenameExtension(fileName);
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
		return path;
	}

	@Override
	public byte[] fetch(String path) {
		String realPath = (String) PrivateCacheContext.getData("upload_real_path");
		String basePath = realPath;
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
