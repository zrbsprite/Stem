package com.penzias.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.penzias.core.commons.BaseController;
import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmDepartment;
import com.penzias.entity.SmDepartmentExample;
import com.penzias.entity.SmUser;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.SmDepartmentService;
import com.penzias.service.SmUserService;
import com.penzias.util.CookieUtil;

/**
 * 描述：机构管理<br>
 * 作者：ruibo <br>
 * 修改日期：2015年12月27日-下午3:43:47 <br>
 */
@SuppressWarnings({"unused","unchecked"})
@Controller
@RequestMapping("dept")
public class DepartmentController extends BaseController {

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
	public String add(Model model){
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
	public String edit(String dn, Model model){
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
	public String save(SmDepartment dept, Model model){
		if(!StringUtils.isEmpty(dept.getDepbm())){
			this.smDepartmentService.updateById(dept);
		}else{
			this.smDepartmentService.add(dept);
		}
		return "recirect:/dept/index.htm";
	}
}
