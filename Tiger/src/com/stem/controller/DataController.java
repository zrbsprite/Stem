package com.stem.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stem.core.commons.AjaxConroller;
import com.stem.core.interfaces.IDataPipeline;
import com.stem.entity.TiggerNaming;
import com.stem.entity.TiggerNamingExample;
import com.stem.service.TiggerNamingService;

@Controller
@RequestMapping("data")
public class DataController extends AjaxConroller {

	private IDataPipeline pipeline;
	
	private TiggerNamingService tiggerNamingService;

	/**
	 * @author: stem zhang 修改时间：2015年8月13日 - 下午4:42:28<br/>
	 *          功能说明：查询个人投资者的收益数据<br/>
	 * @return
	 */
	@RequestMapping("index")
	public String index(){
		String openid = request.getAttribute("openid").toString(); 
		TiggerNamingExample example = new TiggerNamingExample();
		example.createCriteria().andOpenidEqualTo(openid);
		List<TiggerNaming> list = this.tiggerNamingService.list(example);
		String userid = "";
		if(list.size()>0){
			TiggerNaming entity = list.get(0);
			userid = entity.getUserid();
		}
		// 调用接口查询收益数据
		Object obj = pipeline.fetch(userid);
		
		return "";
	}

	@Resource
	public void setPipeline(IDataPipeline pipeline){

		this.pipeline = pipeline;
	}

}
