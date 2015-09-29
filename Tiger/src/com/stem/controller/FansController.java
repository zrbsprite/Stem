package com.stem.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.task.FansTask;
import com.stem.entity.WxUserinfo;
import com.stem.entity.WxUserinfoExample;
import com.stem.service.WxUserinfoService;
import com.stem.util.Page;

@Controller
@RequestMapping("admin")
public class FansController extends AjaxConroller {

	@Resource
	private WxUserinfoService wxUserinfoService;
	
	@Resource
	private FansTask fansTask;
	
	/**
	 * @author: stem zhang
	 * 修改时间：2015年9月29日 - 下午2:49:58<br/>
	 * 功能说明：同步粉丝信息<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("syn")
	public String synchronizeFans(Model model){
		fansTask.run();
		model.addAttribute("msg", "同步命令已经发出！");
		return "fore/ok";
	}
	
	@RequestMapping("synajax")
	public void synchronizeFansByAjax(Model model, PrintWriter writer){
		fansTask.run();
		writeJson("{\"success\":true}");
	}
	
	@RequestMapping("fanslist")
	public String fansList(Integer currentPage, String keyword, Model model){
		if(null==currentPage){
			currentPage = 1;
		}
		WxUserinfoExample example = new WxUserinfoExample();
		if(!StringUtils.isEmpty(keyword)){
			example.createCriteria().andNicknameLike("%"+ keyword.trim() + "%");
		}
		int count = this.wxUserinfoService.getTotal(example);
		PageHelper.startPage(currentPage, Page.ROWS);
		List<WxUserinfo> list = this.wxUserinfoService.list(example);
		Page<WxUserinfo> page = new Page<>(count, currentPage);
		page.setRecordList(list);
		model.addAttribute("page", page);
		return "fore/fans";
	}
}