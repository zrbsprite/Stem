package com.stem.core;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.math.RandomUtils;

import com.stem.core.interfaces.ICodeGenerator;

public class SimpleCodeGenerator implements ICodeGenerator {

	private SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
	@Override
	public String generat(String type, int key) {
		StringBuffer code = new StringBuffer();
		code.append(sf.format(new Date()));
		code.append(type);
		code.append(key);
		code.append(RandomUtils.nextInt(10));
		return code.toString(); 
	}

}
