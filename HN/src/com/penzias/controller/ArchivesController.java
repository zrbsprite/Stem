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
	public String crowsList(Integer currentPage,String name,String phone, String manage, String zf,String ze, Model model){
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
		if(!StringUtils.isEmpty(manage)){
			if("01".equals(manage)){
				criteria.andGradeEqualTo("01");
			}else if("02".equals(manage)){
				criteria.andGradeEqualTo("02");
			}else{
				List<String> gradeList = new ArrayList<String>();
				gradeList.add("03");
				gradeList.add("04");
				gradeList.add("05");
				criteria.andGradeIn(gradeList);
			}
			model.addAttribute("manage", manage);
		}
		if(!StringUtils.isEmpty(zf)){
			criteria.andGradeEqualTo(zf);
			model.addAttribute("zf", zf);
		}
		if(!StringUtils.isEmpty(ze)){
			criteria.andStatesEqualTo(ze);
			model.addAttribute("ze", ze);
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
		model.addAttribute("zfLevel", zfLevel);
		//病历状态
		List<SmCodeitem> zeLevel = new ArrayList<SmCodeitem>();
		mapZE.forEach((key, item) ->{
			zeLevel.add(item);
		});
		model.addAttribute("zeLevel", zeLevel);
		return "archives/crows_list";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月4日 - 上午11:27:57<br/>
	 * 功能说明：跳转人群新增页面<br/>
	 * @param model
	 * @return
	 */
	//@RequestMapping("add")
	@Deprecated
	public String crowsAdd(Model model){
		
		return "archives/crows_add";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月8日 - 上午10:09:27<br/>
	 * 功能说明：基本信息页面<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("baseinfo")
	public String stepOne(Model model){
		
		return "archives/baseinfo_ae";
	}
	
	/**
	 * 方法名称: lifeStryle<br/>
	 * 描述：生活方式<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月6日-下午5:07:17<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("lifestyle")
	public String lifeStryle(Model model){
		
		return "archives/lifestyle_ae";
	}
	
	/**
	 * 
	 * 方法名称: familyInfo<br/>
	 * 描述：家族史<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月6日-下午5:07:40<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("family")
	public String familyInfo(Model model){
		
		return "archives/familyhistory_ae";
	}
	
	/**
	 * 
	 * 方法名称: controlInfo<br/>
	 * 描述：既往病史及控制情况<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月6日-下午5:07:55<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("control")
	public String controlInfo(Model model){
		
		return "archives/control_ae";
	}
	
	/**
	 * 
	 * 方法名称: bodyCheck<br/>
	 * 描述：体格检查<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月6日-下午5:08:24<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("body")
	public String bodyCheck(Model model){
		
		return "archives/body_ae";
	}
	
	/**
	 * 方法名称: brainLevel<br/>
	 * 描述：脑卒中风险评级<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月6日-下午5:08:41<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("brainlevel")
	public String brainLevel(Model model){
		
		return "archives/brain_level_ae";
	}
	
	/**
	 * 方法名称: heartInfo<br/>
	 * 描述：心电图<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月6日-下午5:09:00<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("heartinfo")
	public String heartInfo(Model model){
		
		return "archives/heart_ae";
	}
	
	/**
	 * 
	 * 方法名称: innerCheck<br/>
	 * 描述：实验室检查<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月6日-下午5:09:13<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("innercheck")
	public String innerCheck(Model model){
		
		return "archives/inner_check_ae";
	}
	
	/**
	 * 方法名称: bSuperBlood<br/>
	 * 描述：颈部血管超声<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月6日-下午5:09:29<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("bblood")
	public String bSuperBlood(Model model){
		
		return "archives/blood_ae";
	}
}
