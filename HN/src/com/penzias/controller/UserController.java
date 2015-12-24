package com.penzias.controller;

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
import com.penzias.entity.SmUser;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.SmRoleService;
import com.penzias.service.SmUserService;
import com.penzias.service.UserPersonalInfoService;

/**
 * 描述：用户管理<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月18日 - 下午4:19:50<br/>
 * E-mail: sireezhang@163.com<br/>
 */
@SuppressWarnings("unchecked")
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
	 * 修改时间：2015年12月18日 - 下午5:35:25<br/>
	 * 功能说明：新增用户信息<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("newone")
	public String addUserInfo(Model model){
		
		return "redirect:/um/list.htm";
	}
}