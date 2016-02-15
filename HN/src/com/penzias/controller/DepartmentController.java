package com.penzias.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.penzias.core.ServerImageDealImpl;
import com.penzias.core.commons.AjaxConroller;
import com.penzias.core.commons.PropertiesInitBean.PropertiesUtils;
import com.penzias.core.interfaces.IFileDeal;
import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmDepartment;
import com.penzias.entity.SmDepartmentExample;
import com.penzias.entity.SmUser;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.SmDepartmentService;
import com.penzias.service.SmUserService;
import com.penzias.util.ChineseChar2En;
import com.penzias.util.CookieUtil;

/**
 * 描述：机构管理<br>
 * 作者：ruibo <br>
 * 修改日期：2015年12月27日-下午3:43:47 <br>
 */
@SuppressWarnings({"unused","unchecked"})
@Controller
@RequestMapping("admin/dept")
public class DepartmentController extends AjaxConroller {

	@Resource
	private SmDepartmentService smDepartmentService;
	
	@Resource
	private IDictionaryItem iDctionaryItem;
	
	@Resource
	private SmUserService smUserService;
	
	//机构标记
	private final String DEPT_FLAG_INSTITUTION = "0";
	
	//科室标记
	private final String DEPT_FLAG_DEPARTMENT = "1";
	
	/**
	 * 方法名称: index<br/>
	 * 描述：机构管理首页<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月27日-下午3:45:17<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String index(String type, Integer currentPage, String deptName, String linkMan, Model model, HttpServletRequest request){
		if(null==currentPage){
			currentPage = 1;
		}
		SmDepartmentExample example = new SmDepartmentExample();
		com.penzias.entity.SmDepartmentExample.Criteria criteria = example.createCriteria();
		if(StringUtils.isEmpty(type)){
			type = DEPT_FLAG_INSTITUTION;
		}
		criteria.andDepflagEqualTo(type);
		String userName = CookieUtil.getCookieValueByName(request, cookieUserNameKey);
		SmUser user = this.smUserService.getById(userName);
		String userDeptCode = user.getDepbm();
		criteria.andDepbmEqualTo(userDeptCode);
		if(!StringUtils.isEmpty(linkMan)){
			criteria.andLinkmanLike("%"+ linkMan + "%");
			model.addAttribute("deptno", linkMan);
		}
		if(!StringUtils.isEmpty(deptName)){
			criteria.andDepnameLike("%"+deptName+"%");
			model.addAttribute("deptname", deptName);
		}
		PageHelper.startPage(currentPage,getPageSize().intValue());
		List<SmDepartment> list = this.smDepartmentService.list(example);
		Map<String, SmCodeitem> codeMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZC");
		Map<String, SmCodeitem> abMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("AB");
		for(SmDepartment dept : list){
			String dtype = dept.getInstitutiontype();
			if(!StringUtils.isEmpty(dtype)){
				dept.setInstitutiontype(codeMap.get(dtype).getDescription());
			}
			String area = dept.getArea();
			if(!StringUtils.isEmpty(area)){
				dept.setArea(abMap.get(area).getDescription());
			}
		}
		PageInfo<SmDepartment> pageinfo = new PageInfo<SmDepartment>(list);
		model.addAttribute("page", pageinfo);
		return "dept/dept_manage";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月28日 - 下午5:20:24<br/>
	 * 功能说明：跳转新增页面<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("add")
	public String add(Model model, HttpServletRequest request){
		String username = CookieUtil.getCookieValueByName(request, cookieUserNameKey);
		SmUser user = this.smUserService.getById(username);
		String deptCode = user.getDepbm();
		SmDepartmentExample example = new SmDepartmentExample();
		example.createCriteria().andDepbmEqualTo(deptCode);
		example.or(new SmDepartmentExample().createCriteria().andPptrLike(deptCode+"%"));
		List<SmDepartment> deptList = this.smDepartmentService.list(example);
		model.addAttribute("deptList", deptList);
		//area ab
		Map<String, SmCodeitem> codeMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("AB");
		List<SmCodeitem> areaList = new ArrayList<SmCodeitem>();
		codeMap.forEach((key, value)->{
			areaList.add(value);
		});
		model.addAttribute("areaList", areaList);
		return "dept/dept_add";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月28日 - 下午5:28:15<br/>
	 * 功能说明：跳转机构修改页面<br/>
	 * @param dn
	 * @param model
	 * @return
	 */
	@RequestMapping("edit")
	public String edit(String dn, Model model, HttpServletRequest request){
		String username = CookieUtil.getCookieValueByName(request, cookieUserNameKey);
		SmUser user = this.smUserService.getById(username);
		String deptCode = user.getDepbm();
		SmDepartmentExample example = new SmDepartmentExample();
		example.createCriteria().andDepbmEqualTo(deptCode);
		example.or(new SmDepartmentExample().createCriteria().andPptrLike(deptCode+"%"));
		List<SmDepartment> deptList = this.smDepartmentService.list(example);
		model.addAttribute("deptList", deptList);
		//area ab
		Map<String, SmCodeitem> codeMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("AB");
		List<SmCodeitem> areaList = new ArrayList<SmCodeitem>();
		codeMap.forEach((key, value)->{
			areaList.add(value);
		});
		model.addAttribute("areaList", areaList);
		
		if(!StringUtils.isEmpty(dn)){
			SmDepartment dept = this.smDepartmentService.getById(dn);
			if(null==dept){
				dept = new SmDepartment();
			}
			model.addAttribute("bean",dept);
		}else{
			model.addAttribute("bean", new SmDepartment());
		}
		return "dept/dept_add";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月28日 - 下午5:29:47<br/>
	 * 功能说明：删除机构信息<br/>
	 * @param dn
	 * @return
	 */
	@RequestMapping("del")
	public String delete(String dn){
		if(!StringUtils.isEmpty(dn)){
			this.smDepartmentService.deleteById(dn);
		}
		return "recirect:/dept/index.htm";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月28日 - 下午5:30:41<br/>
	 * 功能说明：保存机构信息<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("persist")
	public String save(SmDepartment dept, Model model, HttpServletRequest request){
		if("UN".equals(dept.getPptr())){
			dept.setDepflag("0");
		}else{
			dept.setDepflag("1");
		}
		if(!StringUtils.isEmpty(dept.getDepbm())){
			this.smDepartmentService.updateById(dept);
		}else{
			dept.setCptr("0");
			dept.setCreatedate(new Date());
			String username = CookieUtil.getCookieValueByName(request, cookieUserNameKey);
			dept.setUsername(username);
			if(StringUtils.isEmpty(dept.getLogo())){
				//默认图片
				String defaultLogo = PropertiesUtils.getConfigByKey("default_logo_image_path");
				dept.setLogo(defaultLogo);
			}
			//生成机构编码
			ChineseChar2En c2e = new ChineseChar2En();
			String parentDeptCode = dept.getPptr();
			String deptCode = parentDeptCode + "-" + c2e.getAllFirstLetter(dept.getDepname());
			deptCode += "-"+getRandomStr();
			dept.setDepbm(deptCode);
			
			this.smDepartmentService.add(dept);
			SmDepartment smDept = this.smDepartmentService.getById(parentDeptCode);
			smDept.setCptr("1");
			this.smDepartmentService.updateById(smDept);
		}
		return "recirect:/dept/index.htm";
	}
	
	/**
	 * <b>作者:</b> Bob<br/>
	 * <b>修改时间：</b>2016年1月14日 - 下午5:01:04<br/>
	 * <b>功能说明：</b>	打开文件上传页面<br/>
	 * @return
	 */
	@RequestMapping("openwin")
	public String openWindow(){
		return "dept/image_upload";
	}
	
	/**
	 * <b>作者:</b> Bob<br/>
	 * <b>修改时间：</b>2016年1月14日 - 下午5:01:21<br/>
	 * <b>功能说明：</b>执行图片上传<br/>
	 * @param image
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("upload")
	public void uploadLogo(MultipartFile image, HttpServletResponse response) throws IOException{
		String type = image.getContentType();
		logger.debug("文件上传类型是：" + type);
		String oname = image.getOriginalFilename();
		InputStream is = null;
		try {
			is = image.getInputStream();
		} catch (IOException e) {
			logger.warn("IO异常，无法完成上传操作...");
			writeHtml(response,"<script type='text/javascript'>window.parent.callback('');</script>");
			return;
		}
		IFileDeal deal = new ServerImageDealImpl();
		String imagePath = deal.store(is, oname);
		if(null==imagePath){
			imagePath = "";
		}
		writeHtml(response,"<script type='text/javascript'>window.parent.callback('"+imagePath+"');</script>");
	}
	
	private String getRandomStr(){
		return RandomStringUtils.random(4,"ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
	}
}
