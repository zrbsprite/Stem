package com.penzias.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.penzias.core.commons.AjaxConroller;
import com.penzias.entity.SmModular;
import com.penzias.entity.SmModularExample;
import com.penzias.entity.SmRoleModular;
import com.penzias.entity.SmRoleModularExample;
import com.penzias.service.SmModularService;
import com.penzias.service.SmRoleModularService;

/**
 * <b>描述：</b>	模块儿管理<br/>
 * <b>作者：</b>zrb <br/>
 * <b>修改日期：</b>2016年1月15日 - 上午11:02:07<br/>
 */
@SuppressWarnings("unused")
@Controller
@RequestMapping("modular")
public class SysModularController extends AjaxConroller{

	@Resource
	private SmModularService smModularService;
	
	@Resource
	private SmRoleModularService smRoleModularService;
	
	//显示
	private final String MENU_STATUS_STOP="0";
	//不显示
	private final String MENU_STATUS_USING="1";
	
	@RequestMapping("index")
	public String index(Integer currentPage, String name, Model model){
		if(null==currentPage){
			currentPage = 1;
		}
		SmModularExample example = new SmModularExample();
		com.penzias.entity.SmModularExample.Criteria criteria = example.createCriteria();
		if(!StringUtils.isEmpty(name)){
			criteria.andModularNameLike("%" + name.trim() + "%");
		}
		PageHelper.startPage(currentPage,getPageSize().intValue());
		List<SmModular> list = this.smModularService.list(example);
		PageInfo<SmModular> pageinfo = new PageInfo<SmModular>(list);
		model.addAttribute("page", pageinfo);
		return "system/function_manage";
	}
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午1:49:42<br/>
	 * <b>功能说明：</b>新增或修改<br/>
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("m/{id}")
	public String add(@PathVariable Integer id, Model model){
		//获取所有父菜单，默认只有两级菜单
		SmModularExample example = new SmModularExample();
		example.createCriteria().andParentIdEqualTo(0);
		List<SmModular> parentList = this.smModularService.list(example);
		model.addAttribute("parentList",parentList);
		if(null!=id && id>0){
			SmModular modular = this.smModularService.getById(id);
			model.addAttribute("bean",modular);
		}else{
			model.addAttribute("bean",new SmModular());
		}
		return "system/function_add";
	}
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午1:54:21<br/>
	 * <b>功能说明：</b>保存<br/>
	 * @return
	 */
	@RequestMapping("persist")
	public String save(SmModular bean){
		if(null!=bean.getId()){
			this.smModularService.updateById(bean);
		}else{
			this.smModularService.add(bean);
		}
		return "redirect:/modular/index.htm";
	}
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午2:25:33<br/>
	 * <b>功能说明：</b>删除<br/>
	 * @param id
	 * @return
	 */
	@RequestMapping("del")
	public String delete(@ModelAttribute("k") Integer id){
		if(null!=id){
			this.smModularService.deleteById(id);
		}
		return "redirect:/modular/index.htm";
	}
	
	@RequestMapping("data")
	public String getTreeData(Integer rid, Model model){
		SmRoleModularExample rmExample = new SmRoleModularExample();
		rmExample.createCriteria().andRoleIdEqualTo(rid);
		List<SmRoleModular> rmList = this.smRoleModularService.list(rmExample);
		Map<Integer, Integer> rmMap = new HashMap<Integer, Integer>();
		for(SmRoleModular modular : rmList){
			rmMap.put(modular.getId(),modular.getId());
		}
		SmModularExample example = new SmModularExample();
		example.createCriteria().andModularShowNotEqualTo(MENU_STATUS_STOP);
		List<SmModular> list = this.smModularService.list(example);
		for(SmModular menu : list){
			menu.setOpen(true);
			if(rmMap.containsKey(menu.getId())){
				menu.setChecked(true);
			}
		}
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		String nodeList = gson.toJson(list);
		model.addAttribute("nodes", nodeList);
		model.addAttribute("roleid", rid);
		return "system/modular_tree";
	}
}
