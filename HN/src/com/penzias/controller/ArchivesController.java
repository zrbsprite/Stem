package com.penzias.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.penzias.core.commons.BaseController;
import com.penzias.entity.InstitutionCrowdBaseInfo;
import com.penzias.entity.InstitutionCrowdBaseInfoExample;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.InstitutionCrowdBaseInfoService;

@Controller
@RequestMapping("archives")
public class ArchivesController extends BaseController{

	//机构人群基本信息service
	@Resource
	private InstitutionCrowdBaseInfoService institutionCrowdBaseInfoService;
	
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
		List<InstitutionCrowdBaseInfo> list = this.institutionCrowdBaseInfoService.list(example);
		long nowNo = System.currentTimeMillis();
		for(InstitutionCrowdBaseInfo info : list){
			info.setStates((String) this.iDctionaryItem.queryOne("ZE_"+info.getStates()));
			Date birth = info.getBirthdate();
			if(null!=birth){
				long birthNo =  birth.getTime();
				long bt = nowNo - birthNo;
				int age = (int) (bt / (1000*60*60*24*365));
				info.setAge(age);
			}
		}
		PageInfo<InstitutionCrowdBaseInfo> pageinfo = new PageInfo<InstitutionCrowdBaseInfo>(list);
		model.addAttribute("page", pageinfo);
		return "archives/list";
	}
}
