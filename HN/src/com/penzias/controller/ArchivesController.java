package com.penzias.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmCodeitemKey;
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
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月3日 - 下午3:37:29<br/>
	 * 功能说明：人群筛查<br/>
	 * @param currentPage
	 * @param name
	 * @param phone
	 * @param model
	 * @return
	 */
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
		SmCodeitemKey itemKey = new SmCodeitemKey();
		itemKey.setCodeid("ZE");
		for(InstitutionCrowdBaseInfo info : list){
			itemKey.setCode(info.getStates());
			info.setStates(((SmCodeitem) this.iDctionaryItem.queryOne(itemKey)).getDescription());
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
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月3日 - 下午3:37:46<br/>
	 * 功能说明：人群检验<br/>
	 * @param currentPage
	 * @param name
	 * @param phone
	 * @param model
	 * @return
	 */
	@RequestMapping("check")
	public String check(Integer currentPage,String name,String phone, Model model){
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
		SmCodeitemKey itemKey = new SmCodeitemKey();
		itemKey.setCodeid("ZE");
		for(InstitutionCrowdBaseInfo info : list){
			itemKey.setCode(info.getStates());
			info.setStates(((SmCodeitem) this.iDctionaryItem.queryOne(itemKey)).getDescription());
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
		return "archives/check_list";
	}
	
	@RequestMapping("crows")
	public String crowsList(Integer currentPage,String name,String phone, Model model){
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
		Map<String, SmCodeitem> mapZF = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZF");
		Map<String, SmCodeitem> mapZE = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZE");
		for(InstitutionCrowdBaseInfo info : list){
			info.setStates(mapZE.get(info.getStates()).getDescription());
			String grade = info.getGrade();
			info.setGradeInfo(mapZF.get(grade).getDescription());
			if(!StringUtils.isEmpty(grade)){
				if("01".equals(grade)){
					info.setGradeColor(1);
				}else if("02".equals(grade)){
					info.setGradeColor(2);
				}else{
					info.setGradeColor(3);
				}
			}
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
		//管理分级
		List<SmCodeitem> manageLevel = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> map = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("YF");
		map.forEach((key, item) ->{
			manageLevel.add(item);
		});
		model.addAttribute("manageLevel", manageLevel);
		//风险等级
		List<SmCodeitem> zfLevel = new ArrayList<SmCodeitem>();
		mapZF.forEach((key, item) ->{
			zfLevel.add(item);
		});
		model.addAttribute("zfLevel", manageLevel);
		//病历状态
		List<SmCodeitem> zeLevel = new ArrayList<SmCodeitem>();
		mapZE.forEach((key, item) ->{
			zeLevel.add(item);
		});
		model.addAttribute("zeLevel", zeLevel);
		return "archives/crows_list";
	}
}
