package com.stem.util;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public abstract class TemplateUtil {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Value("#{propertiesReader[fetch_access_token_url]}")
	private String accessTokenUrl;
	
	@Value("#{propertiesReader[fetch_user_info_list_url]}")
	private String userInfoListUrl;

	protected String getReplacedStr(String src, Map<String, String> params){
		Configuration configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
		StringTemplateLoader loader = new StringTemplateLoader();
		loader.putTemplate("urlTemplate", src);
		configuration.setTemplateLoader(loader);
		StringWriter sw = new StringWriter();
		try {
			Template template = configuration.getTemplate("urlTemplate", "UTF-8");
			template.process(params, sw);
			return sw.toString();
		} catch (IOException e) {
			logger.error("读取模板["+src+"]失败！");
		} catch (TemplateException e) {
			logger.error("渲染模板["+src+"]错误！");
		}finally{
			try {
				sw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
