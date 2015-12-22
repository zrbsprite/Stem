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
 * 修改日期：2015年12月22日 - 下午2:10:17<br/>
 */
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
			criteria.andRolenameLike("%" + roleName + "%");
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
	
}
