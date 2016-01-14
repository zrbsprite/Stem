package com.penzias.core.commons;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.penzias.core.commons.PropertiesInitBean.PropertiesUtils;

/**
 * <b>描述：</b>	内存初始化公共参数<br/>
 * <b>作者：</b>zrb<br/>
 * <b>修改日期：</b>2016年1月7日 - 下午2:27:00<br/>
 *
 */
public class ContextInitListener implements ServletContextListener {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void contextInitialized(ServletContextEvent sce){
		String configFilePath = PropertiesUtils.getConfigByKey("file_upload_serverpath");
		String realPath = sce.getServletContext().getRealPath(configFilePath);
		logger.debug("本地上传目录真实地址是："+ realPath);
		PrivateCacheContext.setData("upload_real_path",realPath);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce){
		logger.debug("内存初始化公共参数Listener销毁……");
	}

	/**
	 * <b>描述：</b>内存初始化参数容器<br/>
	 * <b>作者：</b>zrb <br/>
	 * <b>修改日期：</b>2016年1月7日 - 下午3:19:15<br/>
	 *
	 */
	public static class PrivateCacheContext{
		private static Map<String, Object> cacheData = new HashMap<>();
		
		public static Object getData(String key){
			return cacheData.get(key);
		}
		
		public static void setData(String key, Object val){
			cacheData.put(key,val);
		}
	}	
}
