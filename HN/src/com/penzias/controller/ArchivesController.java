package com.penzias.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.penzias.core.commons.BaseController;
import com.penzias.dictionary.DiseaseType;
import com.penzias.dictionary.MRSType;
import com.penzias.dictionary.OtherType;
import com.penzias.entity.ApoplexyConclusionInfo;
import com.penzias.entity.BloodFatHistory;
import com.penzias.entity.BloodFatHistoryExample;
import com.penzias.entity.BloodGlucoseExamInfo;
import com.penzias.entity.BrainBloodHistory;
import com.penzias.entity.BrainBloodHistoryExample;
import com.penzias.entity.DiabetesHistory;
import com.penzias.entity.DiabetesHistoryExample;
import com.penzias.entity.ElectrocardiogramExamInfo;
import com.penzias.entity.ElectrocardiogramExamInfoExample;
import com.penzias.entity.HeartDiseaseHistory;
import com.penzias.entity.HeartDiseaseHistoryExample;
import com.penzias.entity.HypertensionHistory;
import com.penzias.entity.HypertensionHistoryExample;
import com.penzias.entity.InstitutionCrowdBaseInfo;
import com.penzias.entity.InstitutionCrowdBaseInfoExample;
import com.penzias.entity.InstitutionCrowdFamilyInfo;
import com.penzias.entity.InstitutionCrowdFamilyInfoExample;
import com.penzias.entity.InstitutionCrowdLifestyleInfo;
import com.penzias.entity.InstitutionCrowdLifestyleInfoExample;
import com.penzias.entity.KidneyDiseaseHostory;
import com.penzias.entity.KidneyDiseaseHostoryExample;
import com.penzias.entity.OtherHistory;
import com.penzias.entity.OtherHistoryExample;
import com.penzias.entity.PhysiqueExamInfo;
import com.penzias.entity.PhysiqueExamInfoExample;
import com.penzias.entity.PulmonaryDiseaseHistory;
import com.penzias.entity.PulmonaryDiseaseHistoryExample;
import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmCodeitemKey;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.ApoplexyConclusionInfoService;
import com.penzias.service.BloodFatExamInfoService;
import com.penzias.service.BloodFatHistoryService;
import com.penzias.service.BloodGlucoseExamInfoService;
import com.penzias.service.BrainBloodHistoryService;
import com.penzias.service.DiabetesHistoryService;
import com.penzias.service.ElectrocardiogramExamInfoService;
import com.penzias.service.HeartDiseaseHistoryService;
import com.penzias.service.HistoryControlService;
import com.penzias.service.HistoryPharmacyService;
import com.penzias.service.HomocysteineExamInfoService;
import com.penzias.service.HypertensionHistoryService;
import com.penzias.service.InstitutionCrowdBaseInfoService;
import com.penzias.service.InstitutionCrowdFamilyInfoService;
import com.penzias.service.InstitutionCrowdLifestyleInfoService;
import com.penzias.service.KidneyDiseaseHostoryService;
import com.penzias.service.OtherHistoryService;
import com.penzias.service.PhysiqueExamInfoService;
import com.penzias.service.PulmonaryDiseaseHistoryService;
import com.penzias.vo.InnerCheckVO;
import com.penzias.vo.InstitutionCrowdFamilyInfoVO;
import com.penzias.vo.OtherHistoryVO;

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
	private BrainBloodHistoryService brainBloodHistoryService;
	
	@Resource
	private HeartDiseaseHistoryService heartDiseaseHistoryService;
	
	@Resource
	private HypertensionHistoryService hypertensionHistoryService;
	
	@Resource
	private BloodFatHistoryService bloodFatHistoryService;
	
	@Resource
	private DiabetesHistoryService diabetesHistoryService;
	
	@Resource
	private KidneyDiseaseHostoryService kidneyDiseaseHostoryService;
	
	@Resource
	private OtherHistoryService otherHistoryService;
	
	@Resource
	private PulmonaryDiseaseHistoryService pulmonaryDiseaseHistoryService;
	
	@Resource
	private HistoryControlService historyControlService;
	
	@Resource
	private PhysiqueExamInfoService physiqueExamInfoService;
	
	@Resource
	private ApoplexyConclusionInfoService apoplexyConclusionInfoService;
	
	@Resource
	private ElectrocardiogramExamInfoService electrocardiogramExamInfoService;
	
	@Resource
	private BloodGlucoseExamInfoService bloodGlucoseExamInfoService;
	
	@Resource
	private BloodFatExamInfoService bloodFatExamInfoService;
	
	@Resource
	private HomocysteineExamInfoService homocysteineExamInfoService;
	
	@Resource
	private HistoryPharmacyService historyPharmacyService;
	
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
			example.setOrderByClause(" DiseaseType asc");
			List<InstitutionCrowdFamilyInfo> list = this.InstitutionCrowdFamilyInfoService.list(example);
			for(InstitutionCrowdFamilyInfo info:list){
				String type = info.getDiseasetype();
				if(type.equals(DiseaseType.zr_brain.getValue())){
					model.addAttribute("zr_brain",info);
				}else if(type.equals(DiseaseType.zr_diabetes.getValue())){
					model.addAttribute("zr_diabetes",info);
				}else if(type.equals(DiseaseType.zr_dyslipidemia.getValue())){
					model.addAttribute("zr_dyslipidemia",info);
				}else if(type.equals(DiseaseType.zr_heart.getValue())){
					model.addAttribute("zr_heart",info);
				}else if(type.equals(DiseaseType.zr_highblood.getValue())){
					model.addAttribute("zr_highblood",info);
				}
			}
			model.addAttribute("cid",cid);
		}else{
			InstitutionCrowdFamilyInfo info = new InstitutionCrowdFamilyInfo();
			model.addAttribute("zr_brain",info);
			model.addAttribute("zr_diabetes",info);
			model.addAttribute("zr_dyslipidemia",info);
			model.addAttribute("zr_heart",info);
			model.addAttribute("zr_highblood",info);
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
		if(null!=cid){
			if(null!=institutionCrowdFamilyInfoVO.getArrays()[0].getFamilyid()){	
				//update data
				this.InstitutionCrowdFamilyInfoService.updateBatch(institutionCrowdFamilyInfoVO.getArrays());
			}else{
				//new data
				this.InstitutionCrowdFamilyInfoService.addBatch(institutionCrowdFamilyInfoVO.getArrays());
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
	public String controlInfo(Integer cid, Model model){
		if(null!=cid){
			BrainBloodHistoryExample example = new BrainBloodHistoryExample();
			example.createCriteria().andCrowdidEqualTo(cid);
			List<BrainBloodHistory> list = this.brainBloodHistoryService.list(example);
			if(list.size()>0){
				BrainBloodHistory brainBloodHistory = list.get(0);
				model.addAttribute("brainBloodHistory",brainBloodHistory);
			}
			
			HeartDiseaseHistoryExample hExample = new HeartDiseaseHistoryExample();
			hExample.createCriteria().andCrowdidEqualTo(cid);
			List<HeartDiseaseHistory> hList = this.heartDiseaseHistoryService.list(hExample);
			if(hList.size()>0){
				model.addAttribute("heartDiseaseHistory",hList.get(0));
			}
			
			HypertensionHistoryExample hypertensionHistoryExample = new HypertensionHistoryExample();
			hypertensionHistoryExample.createCriteria().andCrowdidEqualTo(cid);
			List<HypertensionHistory> hypertensionHistoryList = this.hypertensionHistoryService.list(hypertensionHistoryExample);
			if(hypertensionHistoryList.size()>0){
				model.addAttribute("hypertensionHistory",hypertensionHistoryList.get(0));
			}
			
			BloodFatHistoryExample bloodFatHistoryExample = new BloodFatHistoryExample();
			bloodFatHistoryExample.createCriteria().andCrowdidEqualTo(cid);
			List<BloodFatHistory> bloodFatHistoryList = this.bloodFatHistoryService.list(bloodFatHistoryExample);
			if(bloodFatHistoryList.size()>0){
				model.addAttribute("bloodFatHistory",bloodFatHistoryList.get(0));
			}
			
			DiabetesHistoryExample diabetesHistoryExample = new DiabetesHistoryExample();
			diabetesHistoryExample.createCriteria().andCrowdidEqualTo(cid);
			List<DiabetesHistory> diabetesHistoryList = this.diabetesHistoryService.list(diabetesHistoryExample);
			if(diabetesHistoryList.size()>0){
				model.addAttribute("diabetesHistory",diabetesHistoryList.get(0));
			}
			
			KidneyDiseaseHostoryExample kidneyDiseaseHostoryExample = new KidneyDiseaseHostoryExample();
			kidneyDiseaseHostoryExample.createCriteria().andCrowdidEqualTo(cid);
			List<KidneyDiseaseHostory> kidneyDiseaseHostoryList = this.kidneyDiseaseHostoryService.list(kidneyDiseaseHostoryExample);
			if(kidneyDiseaseHostoryList.size()>0){
				model.addAttribute("kidneyDiseaseHostory",kidneyDiseaseHostoryList.get(0));
			}
			
			PulmonaryDiseaseHistoryExample pulmonaryDiseaseHistoryExample = new PulmonaryDiseaseHistoryExample();
			pulmonaryDiseaseHistoryExample.createCriteria().andCrowdidEqualTo(cid);
			List<PulmonaryDiseaseHistory> pulmonaryDiseaseHistoryList = this.pulmonaryDiseaseHistoryService.list(pulmonaryDiseaseHistoryExample);
			if(pulmonaryDiseaseHistoryList.size()>0){
				model.addAttribute("pulmonaryDiseaseHistory",pulmonaryDiseaseHistoryList.get(0));
			}
			
			OtherHistoryExample otherHistoryExample = new OtherHistoryExample();
			otherHistoryExample.createCriteria().andCrowdidEqualTo(cid);
			List<OtherHistory> otherHistoryList = this.otherHistoryService.list(otherHistoryExample);
			if(otherHistoryList.size()>0){
				for(OtherHistory his:otherHistoryList){
					String type = his.getOthertype();
					if(type.equals(OtherType.yb_xiazhidongmai.getValue())){
						model.addAttribute(OtherType.yb_xiazhidongmai.name(), his);
					}else if(type.equals(OtherType.yb_yandixuguan.getValue())){
						model.addAttribute(OtherType.yb_yandixuguan.name(), his);
					}else if(type.equals(OtherType.yb_kouqiang.getValue())){
						model.addAttribute(OtherType.yb_kouqiang.name(), his);
					}else if(type.equals(OtherType.yb_kouqiang.getValue())){
						model.addAttribute(OtherType.yb_kouqiang.name(), his);
					}
				}
			}
			model.addAttribute("cid", cid);
		}
		return "archives/control_ae";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月15日 - 上午10:31:44<br/>
	 * 功能说明：保存既往病史<br/>
	 * @param cid
	 * @param brainBloodHistory
	 * @param model
	 * @return
	 */
	@RequestMapping("savecontrol")
	public String saveControl(Integer cid, 
			BrainBloodHistory brainBloodHistory, 
			HeartDiseaseHistory heartDiseaseHistory,
			HypertensionHistory hypertensionHistory,
			BloodFatHistory bloodFatHistory,
			DiabetesHistory diabetesHistory,
			KidneyDiseaseHostory kidneyDiseaseHostory,
			PulmonaryDiseaseHistory pulmonaryDiseaseHistory,
			OtherHistoryVO otherVO,
			Model model){
		
		if(null!=cid){
			//先处理新增
			brainBloodHistory.setMrsvalue(MRSType.getScore(brainBloodHistory.getMrsoption())+"");
			this.historyControlService.add(brainBloodHistory,heartDiseaseHistory,
					hypertensionHistory,bloodFatHistory,diabetesHistory,
					kidneyDiseaseHostory,pulmonaryDiseaseHistory,otherVO);
			
		}
		return "redirect:/archives/body.htm?cid="+cid;
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
	public String bodyCheck(Integer cid, Model model){
		if(null!=cid){
			PhysiqueExamInfoExample example = new PhysiqueExamInfoExample();
			example.createCriteria().andCrowdidEqualTo(cid);
			List<PhysiqueExamInfo> list = this.physiqueExamInfoService.list(example);
			if(list.size()>0){
				PhysiqueExamInfo physiqueExamInfo = list.get(0);
				model.addAttribute("physiqueExamInfo",physiqueExamInfo);
			}else{
				model.addAttribute("physiqueExamInfo",new PhysiqueExamInfo());
			}
			model.addAttribute("cid",cid);
		}else{
			model.addAttribute("physiqueExamInfo",new PhysiqueExamInfo());
		}
		return "archives/body_ae";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月16日 - 上午11:20:50<br/>
	 * 功能说明：保存提个检查<br/>
	 * @param cid
	 * @param physiqueExamInfo
	 * @param model
	 * @return
	 */
	public String saveBodyCheck(Integer cid, PhysiqueExamInfo physiqueExamInfo){
		if(null!=cid){
			if(null!=physiqueExamInfo.getPhysiqueexamid()){
				this.physiqueExamInfoService.updateById(physiqueExamInfo);
			}else{
				this.physiqueExamInfoService.add(physiqueExamInfo);
			}
		}
		return "redirect:/archives/heartinfo.htm?cid="+cid;
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
	public String heartInfo(Integer cid, Model model){
		ElectrocardiogramExamInfo electrocardiogramExamInfo = null;
		if(null!=cid){
			ElectrocardiogramExamInfoExample example = new ElectrocardiogramExamInfoExample();
			example.createCriteria().andCrowdidEqualTo(cid);
			List<ElectrocardiogramExamInfo> list = this.electrocardiogramExamInfoService.list(example);
			if(list.size()>0){
				electrocardiogramExamInfo = list.get(0);
			}else{
				electrocardiogramExamInfo = new ElectrocardiogramExamInfo();
			}
			model.addAttribute("cid",cid);
		}else{
			electrocardiogramExamInfo = new ElectrocardiogramExamInfo();
		}
		model.addAttribute("electrocardiogramExamInfo", electrocardiogramExamInfo);
		return "archives/heart_ae";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月16日 - 下午2:00:12<br/>
	 * 功能说明：保存心电图检查<br/>
	 * @return
	 */
	public String saveHeart(Integer cid,ElectrocardiogramExamInfo electrocardiogramExamInfo, Model model){
		if(null!=cid){
			if(null!=electrocardiogramExamInfo.getElectrocardiogramexanid()){
				this.electrocardiogramExamInfoService.updateById(electrocardiogramExamInfo);
			}else{
				this.electrocardiogramExamInfoService.add(electrocardiogramExamInfo);
			}
		}
		return "redirect:/archives/innercheck.htm?cid="+cid;
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
	public String innerCheck(Integer cid, Model model){
		if(null!=cid){
			model.addAttribute("cid",cid);
		}
		return "archives/inner_check_ae";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月16日 - 下午3:20:40<br/>
	 * 功能说明：保存实验室检查<br/>
	 * @return
	 */
	@RequestMapping("saveic")
	public String saveInnerCheck(Integer cid, InnerCheckVO entity, Model model){
		if(null!=cid){
			//此处只考虑新增
			for(BloodGlucoseExamInfo info : entity.getBloodGlucoseExamInfos()){
				this.bloodGlucoseExamInfoService.add(info);
			}
			this.bloodFatExamInfoService.add(entity.getBloodFatExamInfo());
			this.homocysteineExamInfoService.add(entity.getHomocysteineExamInfo());
		}
		return "redirect:/archives/bblood.htm?cid="+cid;
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
	public String bSuperBlood(Integer cid, Model model){
		if(null!=cid){
			
			model.addAttribute("cid",cid);
		}
		return "archives/blood_ae";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月16日 - 下午4:12:55<br/>
	 * 功能说明：保存颈部血管超声<br/>
	 * @param cid
	 * @param model
	 * @return
	 */
	public String saveBBlood(Integer cid, Model model){
		if(null!=cid){
			
		}
		return "redirect:/archives/brainlevel.htm?cid="+cid;
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
	public String brainLevel(Integer cid, Model model){
		ApoplexyConclusionInfo apoplexyConclusionInfo = new ApoplexyConclusionInfo();
		if(null!=cid){
			
			model.addAttribute("cid",cid);
		}else{
			//需要传入默认对象
			model.addAttribute("apoplexyConclusionInfo",apoplexyConclusionInfo);
		}
		return "archives/brain_level_ae";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月16日 - 下午4:43:39<br/>
	 * 功能说明：保存评级结果<br/>
	 * @param cid
	 * @param model
	 * @return
	 */
	@RequestMapping("saveres")
	public String saveResult(Integer cid, Model model){
		
		
		return "redirect:/archives.htm";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月15日 - 下午2:21:30<br/>
	 * 功能说明：处理时间字符串<br/>
	 * @param binder
	 */
	@InitBinder 
	public void initBinder(WebDataBinder binder) { 
	   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd" ); 
	   dateFormat.setLenient( false); 
	   binder.registerCustomEditor(Date. class, new CustomDateEditor(dateFormat, false )); 
	}

}
