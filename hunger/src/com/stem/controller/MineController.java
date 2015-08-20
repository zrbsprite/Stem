package com.stem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mine")
public class MineController {

	@RequestMapping("index")
	public String index(){
//		return "fore/mine/account";
		return "fore/myself/product_list";
	}
}
