package com.stem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stem.core.commons.AjaxConroller;

@Controller
@RequestMapping("data")
public class DataController extends AjaxConroller {
	
	/**
	 * @author: stem zhang
	 * 修改时间：2015年8月13日 - 下午4:42:28<br/>
	 * 功能说明：查询个人投资者的收益数据<br/>
	 * @return
	 */
	@RequestMapping("index")
	public String index(){
		
		//调用接口查询收益数据
		
		return "";
	}
}
