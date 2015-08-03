package com.stem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("spend")
public class SpendController {

	@RequestMapping("index")
	public String index(){
		return "fore/spend/list";
	}
}
