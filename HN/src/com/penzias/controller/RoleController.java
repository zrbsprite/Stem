package com.penzias.controller;

import java.util.ArrayList;
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
import com.penzias.entity.SmRole;
import com.penzias.entity.SmRoleExample;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.SmRoleService;

/**
 * 描述：角色管理<br/>
 * 作者：Bob <br/>
 */
@SuppressWarnings("unchecked")
@RequestMapping("role")
@Controller
public class RoleController extends BaseController {
	
	@Resource
	private SmRoleService smRoleService;
	
	@Resource
	private IDictionaryItem iDctionaryItem;
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月22日 - 下午2:11:58<br/>
	 * 功能说明：角色管理首页<br/>
	 * @return
	 */
	@RequestMapping("index")
	public String index(Integer currentPage, String roleName, Model model){
		if(null==currentPage){
			currentPage = 1;
		}
		SmRoleExample example = new SmRoleExample();
		com.penzias.entity.SmRoleExample.Criteria criteria = example.createCriteria();
		if(!StringUtils.isEmpty(roleName)){
			criteria.andRolenameLike("%" + roleName.trim() + "%");
		}
		PageHelper.startPage(currentPage,getPageSize().intValue());
		List<SmRole> list = this.smRoleService.list(example);
		Map<String, SmCodeitem> codeMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZB");
		for(SmRole role : list){
			role.setPowerlevel(codeMap.get(role.getPowerlevel()).getDescription());
		}
		PageInfo<SmRole> pageinfo = new PageInfo<SmRole>(list);
		model.addAttribute("page", pageinfo);
		return "system/role_manage";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月23日 - 下午2:00:32<br/>
	 * 功能说明：删除指定角色<br/>
	 * @param k
	 * @param model
	 * @return
	 */
	@RequestMapping("del")
	public String deleteOne(Integer k){
		if(null!=k){
			this.smRoleService.deleteById(k);
		}
		return "redirect:/role/index.htm";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月23日 - 下午2:02:04<br/>
	 * 功能说明：跳转修改页面<br/>
	 * @param k
	 * @param model
	 * @return
	 */
	@RequestMapping("edit")
	public String edit(Integer k, Model model){
		List<SmCodeitem> list = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> codeMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZB");
		codeMap.forEach((key, item) ->{
			list.add(item);
		});
		model.addAttribute("authList", list);
		if(null!=k){
			SmRole role = this.smRoleService.getById(k);
			if(null==role){
				role = new SmRole();
			}
			model.addAttribute("entity",role);
		}
		return "system/role_add";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月23日 - 下午2:02:20<br/>
	 * 功能说明：更新<br/>
	 * @param k
	 * @param model
	 * @return
	 */
	@RequestMapping("persist")
	public String save(SmRole entity, Model model){
		if(null!=entity.getRoleid()){
			this.smRoleService.updateById(entity);
		}else{
			this.smRoleService.add(entity);
		}
		return "redirect:/role/index.htm";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月23日 - 下午2:16:03<br/>
	 * 功能说明：跳转新增页面<br/>
	 * @param entity
	 * @param model
	 * @return
	 */
	@RequestMapping("add")
	public String add(Model model){
		List<SmCodeitem> list = new ArrayList<SmCodeitem>();
		Map<String, SmCodeitem> codeMap = (Map<String, SmCodeitem>) this.iDctionaryItem.queryGroup("ZB");
		codeMap.forEach((key, item) ->{
			list.add(item);
		});
		model.addAttribute("authList", list);
		return "system/role_add";
	}
}
