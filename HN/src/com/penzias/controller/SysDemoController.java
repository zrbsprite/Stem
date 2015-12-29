package com.penzias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>描述：</b>	系统demo<br/>
 * <b>作者：</b>Bob <br/>
 * <b>修改日期：</b>2015年12月29日 - 下午3:04:29<br/>
 */
@Controller
@RequestMapping("")
public class SysDemoController {

	/**
	 * @author: Bob
	 * 修改时间：2015年12月2日 - 上午10:11:37<br/>
	 * 功能说明：测试 demo<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("anno/demo")
	public String index(Model model) {
		return "demo/index";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月2日 - 上午10:11:49<br/>
	 * 功能说明：ie demo<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("anno/ie")
	public String ie(Model model) {
		return "demo/index_ie";
	}
}
