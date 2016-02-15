package com.penzias.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.penzias.core.commons.AjaxConroller;
import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmRole;
import com.penzias.entity.SmRoleExample;
import com.penzias.entity.SmRoleModular;
import com.penzias.entity.SmRoleModularExample;
import com.penzias.entity.SmUser;
import com.penzias.interfaces.IDictionaryItem;
import com.penzias.service.SmRoleModularService;
import com.penzias.service.SmRoleService;
import com.penzias.service.SmUserService;

/**
 * 描述：角色管理<br/>
 * 作者：Bob <br/>
 */
@SuppressWarnings("unchecked")
@RequestMapping("admin/role")
@Controller
public class RoleController extends AjaxConroller {
	
	@Resource
	private SmUserService smUserService;
	
	@Resource
	private SmRoleService smRoleService;
	
	@Resource
	private IDictionaryItem iDctionaryItem;
	
	@Resource
	private SmRoleModularService smRoleModularService;
	
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
		return "redirect:index.htm";
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
		return "redirect:index.htm";
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
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午3:37:51<br/>
	 * <b>功能说明：</b>为角色授权<br/>
	 * @param rid
	 * @param mids
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("auth")
	public void authrize(Integer rid, String mids, Model model, HttpServletResponse response) throws IOException{
		SmRoleModularExample rmEx = new SmRoleModularExample();
		rmEx.createCriteria().andRoleIdEqualTo(rid);
		List<SmRoleModular> rmList = this.smRoleModularService.list(rmEx);
		List<Integer> ids = new ArrayList<>();
		for(SmRoleModular rm : rmList){
			ids.add(rm.getId());
		}
		List<SmRoleModular> list = new ArrayList<SmRoleModular>();
		String[] midArray = mids.split(",");
		for(String midstr : midArray){
			SmRoleModular menu = new SmRoleModular();
			menu.setRoleId(rid);
			menu.setModularId(Integer.valueOf(midstr));
			list.add(menu);
		}
		this.smRoleModularService.addMore(list);
		if(ids.size()>0){
			rmEx.clear();
			rmEx.createCriteria().andRoleIdEqualTo(rid).andIdIn(ids);
			this.smRoleModularService.delete(rmEx);
		}
		this.writeJson(response, "{\"state\":200}");
	}
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午4:17:39<br/>
	 * <b>功能说明：</b>列出角色列表<br/>
	 * @param uid
	 * @param model
	 * @return
	 */
	@RequestMapping("roles")
	public String authrization(Integer currentPage, String roleName, String uid, Model model){
		SmUser sm = this.smUserService.getById(uid);
		String rid = sm.getRoleid();
		Integer roleid = Integer.parseInt(rid);
		SmRole role = this.smRoleService.getById(roleid);
		model.addAttribute("uid",uid);
		if(null!=role){
			model.addAttribute("role", role.getRolename());
		}
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
		PageInfo<SmRole> pageinfo = new PageInfo<SmRole>(list);
		model.addAttribute("page", pageinfo);
		return "system/role_list";
	}
}
