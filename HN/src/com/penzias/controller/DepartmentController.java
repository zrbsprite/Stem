package com.penzias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.penzias.core.commons.BaseController;

/**
 * 描述：机构管理<br>
 * 作者：ruibo <br>
 * 修改日期：2015年12月27日-下午3:43:47 <br>
 */
@Controller
@RequestMapping("dept")
public class DepartmentController extends BaseController {

	/**
	 * 方法名称: index<br/>
	 * 描述：机构管理首页<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月27日-下午3:45:17<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String index(Model model){
		
		return "dept/dept_manage";
	}
}
