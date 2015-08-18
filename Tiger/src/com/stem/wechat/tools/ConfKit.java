package com.stem.wechat.tools;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 配置文件
 * @author L.cm
 * email: 596392912@qq.com
 * site:  http://www.dreamlu.net
 *
 */
public class ConfKit {

	private static Properties props = new Properties();

	static {
		try {
			//play框架下要用这种方式加载
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("/wechat.properties"));
			//props.load(ConfKit.class.getResourceAsStream("/wechat.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String get(String key) {
		return props.getProperty(key);
	}

    public static void setProps(Properties p){
        props = p;
    }
}
