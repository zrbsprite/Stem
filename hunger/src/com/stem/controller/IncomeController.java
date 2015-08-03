package com.stem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stem.core.commons.BaseController;

@Controller
@RequestMapping("income")
public class IncomeController extends BaseController{

	@RequestMapping("index")
	public String index(){
		return "fore/income/list";
	}
}
