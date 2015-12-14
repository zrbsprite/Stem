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
import com.penzias.entity.InstitutionCrowdFamilyInfo;
import com.penzias.entity.InstitutionCrowdFamilyInfoExample;
import com.penzias.entity.InstitutionCrowdLifestyleInfo;
import com.penzias.entity.InstitutionCrowdLifestyleInfoExample;
import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmCodeitemKey;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.InstitutionCrowdBaseInfoService;
import com.penzias.service.InstitutionCrowdFamilyInfoService;
import com.penzias.service.InstitutionCrowdLifestyleInfoService;
import com.penzias.vo.InstitutionCrowdFamilyInfoVO;

@Controller
@RequestMapping("archives")
public class ArchivesController extends BaseController{

	//机构人群基本信息service
	@Resource
	private InstitutionCrowdBaseInfoService institutionCrowdBaseInfoService;
	
	@Resource
	private InstitutionCrowdLifestyleInfoService InstitutionCrowdLifestyleInfoService;
	
	@Resource
	private InstitutionCrowdFamilyInfoService InstitutionCrowdFamilyInfoService;
	
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
	public String baseInfo(Model model){
		//民族词典
		List<SmCodeitem> nationList = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> nationMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZH");
		nationMap.forEach((key, item) ->{
			nationList.add(item);
		});
		model.addAttribute("nationList", nationList);
		//教育程度
		List<SmCodeitem> educationList = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> educationMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZI");
		educationMap.forEach((key, item) ->{
			educationList.add(item);
		});
		model.addAttribute("educationList", educationList);
		//职业
		List<SmCodeitem> occupationList = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> occupationMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZJ");
		occupationMap.forEach((key, item) ->{
			occupationList.add(item);
		});
		model.addAttribute("occupationList", occupationList);
		//收入
		List<SmCodeitem> incomeList = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> incomeMap = (Map<String, SmCodeitem>)  this.iDctionaryItem.queryGroup("ZK");
		incomeMap.forEach((key, item) ->{
			incomeList.add(item);
		});
		model.addAttribute("incomeList", incomeList);
		//主要医疗付费方式
		List<SmCodeitem> payList = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> payMap = (Map<String, SmCodeitem>)this.iDctionaryItem.queryGroup("ZL");
		payMap.forEach((key, item) ->{
			payList.add(item);
		});
		model.addAttribute("payList", payList);
		//与本人关系
		List<SmCodeitem> shipList = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> shipMap = (Map<String, SmCodeitem>)  this.iDctionaryItem.queryGroup("ZM");
		shipMap.forEach((key, item) ->{
			shipList.add(item);
		});
		model.addAttribute("shipList", shipList);
		
		return "archives/baseinfo_ae";
	}
	
	/**
	 * 方法名称: saveBaseInfo<br/>
	 * 描述：保存基本信息<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月12日-下午2:31:43<br/>
	 * @param baseinfo
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("saveBaseinfo")
	public String saveBaseInfo(InstitutionCrowdBaseInfo baseinfo, Model model){
		//性别
		if(StringUtils.isEmpty(baseinfo.getSex())){
			baseinfo.setSex("2");
		}
		//处理其他关系
		if(!"05".equals(baseinfo.getRelationship())){
			baseinfo.setFlag(null);
		}
		//处理年龄
		Integer age = baseinfo.getAge();
		long nowTime = System.currentTimeMillis();
		long ageTime = age.longValue() * 365 * 24 * 60 * 60 * 1000;
		long birthTime = nowTime - ageTime;
		Date brith = new Date(birthTime);
		baseinfo.setBirthdate(brith);
		
		if(null!=baseinfo.getCrowdid()){
			this.institutionCrowdBaseInfoService.updateById(baseinfo);
		}else{
			this.institutionCrowdBaseInfoService.add(baseinfo);
		}
		return "redirect:/archives/lifestyle.htm?cid="+baseinfo.getCrowdid().intValue();
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
	public String lifeStryle(Integer cid, Model model){
		if(null!=cid){
			InstitutionCrowdLifestyleInfoExample example = new InstitutionCrowdLifestyleInfoExample();
			example.createCriteria().andCrowdidEqualTo(cid);
			List<InstitutionCrowdLifestyleInfo> list = this.InstitutionCrowdLifestyleInfoService.list(example);
			if(list.size()>0){
				model.addAttribute("lifestyle",list.get(0));
			}
			model.addAttribute("cid",cid);
		}
		return "archives/lifestyle_ae";
	}
	
	/**
	 * 方法名称: saveLisfeStyle<br/>
	 * 描述：保存生活方式<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月12日-下午3:47:41<br/>
	 * @param lifestyle
	 * @param model
	 * @return
	 */
	@RequestMapping("savels")
	public String saveLisfeStyle(InstitutionCrowdLifestyleInfo lifestyle, Model model){
		//不抽烟
		if("01".equals(lifestyle.getIsSmokeFlag())){
			if("0102".equals(lifestyle.getIsSecondSmokenFlag())){
				lifestyle.setIsSmokeFlag(lifestyle.getIsSecondSmokenFlag());
				lifestyle.setSmokeyear(lifestyle.getSecondSmokenYear());
			}
		}else{
			if(!StringUtils.isEmpty(lifestyle.getDontSmokeYear())){
				lifestyle.setIsSmokeFlag("0202");
				lifestyle.setSmokeyear(lifestyle.getSmokenYear());
			}else{
				lifestyle.setIsSmokeFlag("0201");
				lifestyle.setSmokeyear(lifestyle.getSmokingYear());
			}
		}
		
		//饮酒
		if("01".equals(lifestyle.getWine())){
			lifestyle.setWineyear(null);
		}else if("02".equals(lifestyle.getWine())){
			lifestyle.setWineyear(lifestyle.getLittleDrinkMountYear());
		}else if("03".equals(lifestyle.getWine())){
			lifestyle.setWineyear(lifestyle.getLotDrinkMountYear());
		}
		
		//sport
		if("01".equals(lifestyle.getSports())){
			lifestyle.setSportsyear(lifestyle.getHasSportYear());
		}else if("02".equals(lifestyle.getSports())){
			lifestyle.setSportsyear(lifestyle.getHasNoSportYear());
		}
		
		if(null!=lifestyle.getCrowdid()){
			this.InstitutionCrowdLifestyleInfoService.updateById(lifestyle);
		}else{
			this.InstitutionCrowdLifestyleInfoService.add(lifestyle);
		}
		return "redirect:/archives/family.htm?cid="+lifestyle.getCrowdid();
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
	public String familyInfo(Integer cid, Model model){
		if(null!=cid){
			InstitutionCrowdFamilyInfoExample example = new InstitutionCrowdFamilyInfoExample();
			example.createCriteria().andCrowdidEqualTo(cid);
			List<InstitutionCrowdFamilyInfo> list = this.InstitutionCrowdFamilyInfoService.list(example);
			if(list.size()>0){
				model.addAttribute("institutionCrowdFamilyInfos",list);
			}
			model.addAttribute("cid",cid);
		}
		return "archives/familyhistory_ae";
	}
	
	/**
	 * 方法名称: saveFamilyInfo<br/>
	 * 描述：家族史<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月12日-下午9:01:18<br/>
	 * @param institutionCrowdFamilyInfo
	 * @param model
	 * @return
	 */
	public String saveFamilyInfo(Integer cid, InstitutionCrowdFamilyInfoVO institutionCrowdFamilyInfoVO, Model model){
		for(InstitutionCrowdFamilyInfo institutionCrowdFamilyInfo : institutionCrowdFamilyInfoVO.getArrays()){
			if(null!=institutionCrowdFamilyInfo.getCrowdid()){
				this.InstitutionCrowdFamilyInfoService.updateById(institutionCrowdFamilyInfo);
			}else{
				this.InstitutionCrowdFamilyInfoService.add(institutionCrowdFamilyInfo);
			}
		}
		return "redirect:/archives/control.htm?cid="+cid;
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
	public String controlInfo(Integer id, Model model){
		if(null!=id){
			model.addAttribute("crowdid",id);
		}
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
