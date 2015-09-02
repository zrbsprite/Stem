package com.stem.core;

import java.util.Hashtable;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class AppContext {

	/**
	 * 保持上下文资源 线程安全的
	 */
	private static Map<String, Object> contextMap = new Hashtable<String, Object>();

	private static AppContext context = new AppContext();
	
	public static AppContext getContext(){
		return context;
	}

	/**
	 * AccessToken的键值
	 */
	public static final String ACCESS_TOKEN_KEY = "access_token";
	
	/**
	 * 设置键值对
	 * 
	 * @param key
	 * @param value
	 * @throws Exception
	 */
	public synchronized void setSyncValue(String key,String value) throws Exception{

		if(StringUtils.isEmpty(key)){
			throw new Exception("未指定键");
		}

		if(StringUtils.isEmpty(value)){
			throw new Exception("未指定值");
		}
		contextMap.put(key,value);
	}

	/**
	 * 获取相应资源
	 * 
	 * @param key
	 * @return
	 */
	public Object getValue(String key){

		if(!StringUtils.isEmpty(key)){
			return contextMap.get(key);
		}
		return null;
	}

	/**
	 * 设置值
	 * 
	 * @param key
	 * @param val
	 */
	public void setValue(String key,Object val){

		contextMap.put(key,val);
	}

	public void remove(String key){

		if(!StringUtils.isEmpty(key)){
			if(contextMap.containsKey(key)){
				contextMap.remove(key);
			}
		}
	}
}
