package com.penzias.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmDepartment;
import com.penzias.entity.SmDepartmentExample;
import com.penzias.entity.SmRole;
import com.penzias.entity.SmRoleExample;
import com.penzias.entity.SmUser;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.SmDepartmentService;
import com.penzias.service.SmRoleService;
import com.penzias.service.SmUserService;
import com.penzias.service.UserPersonalInfoService;

/**
 * 描述：用户管理<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月18日 - 下午4:19:50<br/>
 * E-mail: sireezhang@163.com<br/>
 */
@SuppressWarnings({"unused","unchecked"})
@RequestMapping("um")
@Controller
public class UserController extends BaseController {

	@Resource
	private SmUserService smUserService;
	
	@Resource
	private SmRoleService smRoleService;
	
	@Resource
	private UserPersonalInfoService userPersonalInfoService;
	
	@Resource
	private IDictionaryItem iDctionaryItem;
	
	@Resource
	private SmDepartmentService smDepartmentService;
	
	private final String USER_STATUS_ABLE = "1";
	
	private final String USER_STATUS_DISABLE = "0";
	
	private final String DEPT_FLAG_BIG = "0";
	
	private final String DEPT_FLAG_SMALL = "1";
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月24日 - 上午11:09:09<br/>
	 * 功能说明：查询用户信息<br/>
	 * @param currentPage
	 * @param userName
	 * @param name
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String index(Integer currentPage,String userName, String name, Model model){
		if(null==currentPage){
			currentPage = 1;
		}
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StringUtils.isEmpty(userName)){
			params.put("userName",userName);
		}
		if(!StringUtils.isEmpty(name)){
			params.put("name",name);
		}
		PageHelper.startPage(currentPage,getPageSize().intValue());
		List<SmUser> list = this.smUserService.listSysUserInfo(params);
		//用户类型
		Map<String, SmCodeitem> codeMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZA");
		for(SmUser user : list){
			user.setUsertype(codeMap.get(user.getUsertype()).getDescription());
		}
		PageInfo<SmUser> pageinfo = new PageInfo<SmUser>(list);
		model.addAttribute("page", pageinfo);
		model.addAttribute("userName", userName);
		model.addAttribute("name", name);
		return "system/user_manage";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月18日 - 下午5:29:43<br/>
	 * 功能说明：分页列出用户信息-包括详细信息<br/>
	 * @param currentPage
	 * @param userName
	 * @param name
	 * @param model
	 * @return
	 */
	@Deprecated
	@RequestMapping("list")
	public String listUsers(Integer currentPage,String userName, String name, Model model){
		if(null==currentPage){
			currentPage = 1;
		}
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StringUtils.isEmpty(userName)){
			params.put("userName",userName);
		}
		if(!StringUtils.isEmpty(name)){
			params.put("name",name);
		}
		PageHelper.startPage(currentPage,getPageSize().intValue());
		List<SmUser> list = this.smUserService.listUserInfo(params);
		PageInfo<SmUser> pageinfo = new PageInfo<SmUser>(list);
		model.addAttribute("page", pageinfo);
		return "system/user_manage";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月25日 - 上午10:51:25<br/>
	 * 功能说明：添加新增用户页面<br/>
	 * @return
	 */
	@RequestMapping("add")
	public String toAddPage(Model model){
		List<SmCodeitem> list = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> codeMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZA");
		codeMap.forEach((key, item) ->{
			list.add(item);
		});
		model.addAttribute("typeList", list);
		model.addAttribute("entity",new SmUser());
		
		//科室deptflag
		SmDepartmentExample deptExample = new SmDepartmentExample();
		deptExample.createCriteria().andDepflagEqualTo(DEPT_FLAG_SMALL);
		List<SmDepartment> deptList = this.smDepartmentService.list(deptExample);
		model.addAttribute("deptList",deptList);
		//角色信息
		List<SmRole> roleList = this.smRoleService.list(new SmRoleExample());
		model.addAttribute("roleList",roleList);
		return "system/user_add";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月25日 - 上午11:08:18<br/>
	 * 功能说明：跳转修改用户页面<br/>
	 * @return
	 */
	@RequestMapping("edit")
	public String toEditPage(String un, Model model){
		SmUser sm = null;
		if(!StringUtils.isEmpty(un)){
			sm = this.smUserService.getById(un);
		}else{
			sm = new SmUser();
		}
		List<SmCodeitem> list = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> codeMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZA");
		codeMap.forEach((key, item) ->{
			list.add(item);
		});
		model.addAttribute("typeList", list);
		model.addAttribute("entity", sm);
		//科室deptflag
		SmDepartmentExample deptExample = new SmDepartmentExample();
		deptExample.createCriteria().andDepflagEqualTo(DEPT_FLAG_SMALL);
		List<SmDepartment> deptList = this.smDepartmentService.list(deptExample);
		model.addAttribute("deptList",deptList);
		//角色信息
		List<SmRole> roleList = this.smRoleService.list(new SmRoleExample());
		model.addAttribute("roleList",roleList);
		return "system/user_add";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月18日 - 下午5:35:25<br/>
	 * 功能说明：新增用户信息<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("persist")
	public String addUserInfo(SmUser user){
		if(StringUtils.isEmpty(user.getUsername())){
			user.setCreatedate(new Date());
			this.smUserService.add(user);
		}else{
			this.smUserService.updateById(user);
		}
		return "redirect:/um/list.htm";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月25日 - 上午11:09:46<br/>
	 * 功能说明：删除用户信息，非物理删除，只是逻辑删除<br/>
	 * @param un
	 * @return
	 */
	@RequestMapping("del")
	public String deleteOne(String un){
		if(!StringUtils.isEmpty(un)){
			SmUser sm = this.smUserService.getById(un);
			sm.setStates(USER_STATUS_DISABLE);
			this.smUserService.updateById(sm);
		}
		return "redirect:/um/del.htm";
	}
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午4:08:26<br/>
	 * <b>功能说明：</b>为用户授权角色<br/>
	 * @return
	 */
	@RequestMapping("auth")
	public String authrize(Integer id, Integer roleid){
		SmUser sm = this.smUserService.getById(id);
		sm.setRoleid(roleid+"");
		this.smUserService.updateById(sm);
		return "redirect:/um/index.htm";
	}
}
