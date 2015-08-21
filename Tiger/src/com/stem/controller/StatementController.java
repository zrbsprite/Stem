package com.stem.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.wechat.WeChat;
import com.stem.wechat.tools.SHA1;

@Controller
@RequestMapping("data")
public class StatementController extends AjaxConroller{
	
	@RequestMapping("")
	public String index(PrintWriter writer) throws IOException{
		//validate wechat msg
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		String token = PropertiesUtils.getConfigByKey("token");
		
		if(!StringUtils.isEmpty(nonce)&&!StringUtils.isEmpty(echostr)){
			List<String> list = new ArrayList<String>();
			list.add(timestamp);
			list.add(nonce);
			list.add(token);
			Collections.sort(list);
			StringBuffer str = new StringBuffer();
			for(String temp : list){
				str.append(temp);
			}
			String result = SHA1.encode(str.toString());
			if(!result.equals(signature)){
				return "";
			}
			writer.write(echostr);
			return null;
		}else{
			InputStream stream = request.getInputStream();
			String responseInputString = IOUtils.toString(stream);
			String xml = WeChat.processing(responseInputString);
			if(!StringUtils.isEmpty(xml)){
				writer.write(xml);
			}
			return null;
		}
	}
}
