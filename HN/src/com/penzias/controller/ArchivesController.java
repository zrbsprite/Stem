package com.penzias.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.penzias.core.commons.BaseController;
import com.penzias.entity.InstitutionCrowdBaseInfo;
import com.penzias.entity.InstitutionCrowdBaseInfoExample;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.interfaces.IDictionaryType;
import com.penzias.service.InstitutionCrowdBaseInfoService;

@Controller
@RequestMapping("archives")
public class ArchivesController extends BaseController{

	//机构人群基本信息service
	@Resource
	private InstitutionCrowdBaseInfoService institutionCrowdBaseInfoService;
	
	@Resource
	private IDictionaryType iDctionaryType;
	
	@Resource
	private IDictionaryItem iDctionaryItem;
	
	@RequestMapping("")
	public String index(Integer currentPage,String name,String phone, Model model){
		if(null==currentPage){
			currentPage = 1;
		}
		Integer pageSize = getPageSize();
		InstitutionCrowdBaseInfoExample example = new InstitutionCrowdBaseInfoExample();
		com.penzias.entity.InstitutionCrowdBaseInfoExample.Criteria criteria = example.createCriteria();
		if(!StringUtils.isEmpty(name)){
			criteria.andFullnameLike("%"+ name +"%");
			model.addAttribute("name", name);
		}
		if(!StringUtils.isEmpty(phone)){
			criteria.andMobileLike("%"+ phone +"%");
			model.addAttribute("phone", phone);
		}
		example.setOrderByClause(" FullName desc");
		PageHelper.startPage(currentPage,pageSize);
		Page<InstitutionCrowdBaseInfo> page = (Page<InstitutionCrowdBaseInfo>) this.institutionCrowdBaseInfoService.list(example);
		List<InstitutionCrowdBaseInfo> list = page.getResult();
		for(InstitutionCrowdBaseInfo info : list){
			info.setStates((String) this.iDctionaryItem.queryOne("ZE_"+info.getStates()));
		}
		model.addAttribute("page", page);
		return "archives/list";
	}
}
