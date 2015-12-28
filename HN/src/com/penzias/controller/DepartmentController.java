package com.penzias.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.penzias.core.commons.BaseController;
import com.penzias.entity.SmDepartment;
import com.penzias.entity.SmDepartmentExample;
import com.penzias.service.SmDepartmentService;

/**
 * 描述：机构管理<br>
 * 作者：ruibo <br>
 * 修改日期：2015年12月27日-下午3:43:47 <br>
 */
@Controller
@RequestMapping("dept")
public class DepartmentController extends BaseController {

	@Resource
	private SmDepartmentService smDepartmentService;
	
	/**
	 * 方法名称: index<br/>
	 * 描述：机构管理首页<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2015年12月27日-下午3:45:17<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String index(Integer currentPage, String deptname, String deptno, Model model){
		if(null==currentPage){
			currentPage = 1;
		}
		SmDepartmentExample example = new SmDepartmentExample();
		com.penzias.entity.SmDepartmentExample.Criteria criteria = example.createCriteria();
		if(!StringUtils.isEmpty(deptno)){
			criteria.andDepbmEqualTo(deptno);
			model.addAttribute("deptno", deptno);
		}
		if(!StringUtils.isEmpty(deptname)){
			criteria.andDepnameLike("%"+deptname+"%");
			model.addAttribute("deptname", deptname);
		}
		PageHelper.startPage(currentPage,getPageSize().intValue());
		List<SmDepartment> list = this.smDepartmentService.list(example);
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
