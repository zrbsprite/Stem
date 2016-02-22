package com.penzias.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.penzias.core.commons.BaseController;
import com.penzias.entity.SmCodecollect;
import com.penzias.entity.SmCodecollectExample;
import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmCodeitemExample;
import com.penzias.entity.SmCodeitemKey;
import com.penzias.service.SmCodecollectService;
import com.penzias.service.SmCodeitemService;

/**
 * 描述：数据字典<br>
 * 作者：ZRB <br>
 * 修改日期：2016年2月22日上午11:04:32 <br>
 * E-mail: <br>
 */
@RequestMapping("sys/dic")
@Controller
public class SystemDictionaryController extends BaseController{

	@Resource
	private SmCodeitemService smCodeitemService;
	
	@Resource
	private SmCodecollectService smCodecollectService;
	
	@RequestMapping("item/index")
	public String itemIndex(Integer currentPage, String code, String description, Model model){
		if(null==currentPage){
			currentPage = 1;
		}
		SmCodeitemExample example = new SmCodeitemExample();
		com.penzias.entity.SmCodeitemExample.Criteria cri = example.createCriteria();
		if(!StringUtils.isEmpty(code)){
			cri.andCodeEqualTo(code.toUpperCase());
		}
		if(!StringUtils.isEmpty(description)){
			cri.andDescriptionLike("%"+description+"%");
		}
		PageHelper.startPage(currentPage,getPageSize().intValue());
		List<SmCodeitem> list = this.smCodeitemService.list(example);
		PageInfo<SmCodeitem> pageinfo = new PageInfo<SmCodeitem>(list);
		model.addAttribute("page", pageinfo);
		return "dictionary/item_manage";
	}
	
	@RequestMapping("item/m/{codeid}/{code}")
	public String itemAdd(@PathVariable("code") String code, @PathVariable("codeid") String codeid, Integer t, Model model){
		if(!StringUtils.isEmpty(code) && !StringUtils.isEmpty(codeid) && null!=t){
			//edit
			SmCodeitemKey key = new SmCodeitemKey();
			key.setCode(code);
			key.setCodeid(codeid);
			SmCodeitem item = this.smCodeitemService.getById(key);
			model.addAttribute("bean", item);
			model.addAttribute("t",1);
		}
		return "dictionary/item_add_edit";
	}
	
	@RequestMapping("item/s")
	public String itemSave(SmCodeitem item, Integer t){
		SmCodeitemKey key = new SmCodeitemKey();
		key.setCode(item.getCode());
		key.setCodeid(item.getCodeid());
		SmCodeitem bean = this.smCodeitemService.getById(key);
		if(null!=bean && null!=t){
			this.smCodeitemService.updateById(item);
		}else{
			this.smCodeitemService.add(item);
		}
		return "redirect:item/index.htm";
	}
	
	@RequestMapping("item/del/{codeid}/{code}")
	public String delItem(@PathVariable("codeid") String codeid, @PathVariable("code") String code, Model model){
		if(!StringUtils.isEmpty(code) && !StringUtils.isEmpty(codeid)){
			SmCodeitemKey key = new SmCodeitemKey();
			key.setCode(code);
			key.setCodeid(codeid);
			this.smCodeitemService.deleteById(key);
		}
		return "redirect:item/index.htm";
	}
	
	@RequestMapping("type/index")
	public String typeIndex(Integer currentPage, String codeid, String description, Model model){
		if(null==currentPage){
			currentPage = 1;
		}
		SmCodecollectExample example = new SmCodecollectExample();
		com.penzias.entity.SmCodecollectExample.Criteria cri = example.createCriteria();
		if(!StringUtils.isEmpty(codeid)){
			cri.andCodeidEqualTo(codeid.toUpperCase());	
		}
		if(!StringUtils.isEmpty(description)){
			cri.andDescriptionLike("%"+description+"%");
		}
		PageHelper.startPage(currentPage,getPageSize().intValue());
		List<SmCodecollect> list = this.smCodecollectService.list(example);
		PageInfo<SmCodecollect> pageinfo = new PageInfo<SmCodecollect>(list);
		model.addAttribute("page", pageinfo);
		return "dictionary/type_manage";
	}
	
	@RequestMapping("type/m/{codeid}")
	public String typeAdd(@PathVariable("codeid") String codeid, Integer t, Model model){
		if(!StringUtils.isEmpty(codeid) && null!=t){
			//edit
			SmCodecollect item = this.smCodecollectService.getById(codeid);
			model.addAttribute("bean", item);
		}
		return "dictionary/type_add_edit";
	}
	
	@RequestMapping("type/s")
	public String typeSave(SmCodecollect item, Integer t){
		if(!StringUtils.isEmpty(item.getCodeid()) && null!=t){
			this.smCodecollectService.updateById(item);
		}else{
			this.smCodecollectService.add(item);
		}
		return "redirect:type/index.htm";
	}
	
	@RequestMapping("type/del/{codeid}")
	public String delType(@PathVariable("codeid") String codeid, Model model){
		if(!StringUtils.isEmpty(codeid)){
			this.smCodecollectService.deleteById(codeid);
		}
		return "redirect:type/index.htm";
	}
}
