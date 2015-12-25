package com.penzias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.penzias.core.commons.BaseController;

/**
 * 描述：功能管理<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月25日 - 下午1:43:46<br/>
 */
@Controller
@RequestMapping("fun")
public class FunctionController extends BaseController {

	@RequestMapping("index")
	public String index(Model model){
		
		return "system/function_manage";
	}
}
