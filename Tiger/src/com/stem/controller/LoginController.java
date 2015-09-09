package com.stem.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerNaming;
import com.stem.entity.TigerUserinfo;
import com.stem.entity.TigerUserinfoExample;
import com.stem.service.TigerNamingService;
import com.stem.service.TigerUserinfoService;
import com.stem.util.HttpUtils;

@Controller
@RequestMapping("wechat")
public class LoginController extends AjaxConroller{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TigerUserinfoService tigerUserinfoService;
	
	@Resource
	private TigerNamingService tigerNamingService;
	
	@RequestMapping("index")
	public String index(){
		return "fore/login";
	}
	
	@RequestMapping("bind")
	public String login(@ModelAttribute TigerUserinfo entity, String code, Model model){
		
		String viewName = "fore/success";
		
		TigerUserinfoExample example = new TigerUserinfoExample();
		example.createCriteria().andIdcardEqualTo(entity.getIdcard()).andPhoneEqualTo(entity.getPhone()).andRealNameEqualTo(entity.getRealName());
		List<TigerUserinfo> list= this.tigerUserinfoService.list(example);
		if(list.size()>0){
			String accessTokenUrl = PropertiesUtils.getConfigByKey("mp_access_token_url");
			String appid = PropertiesUtils.getConfigByKey("AppId");
			String secret = PropertiesUtils.getConfigByKey("AppSecret");
			accessTokenUrl = String.format(accessTokenUrl, appid, secret, code);
			String result;
			try{
				result = HttpUtils.postHttpByJsonData(accessTokenUrl,"");
			} catch (IOException e){
				e.printStackTrace();
				result = "";
			}
			JSONObject object = JSON.parseObject(result);
			Map map = JSON.toJavaObject(object, Map.class);
			Object obj = map.get("openid");
			String openid = ""; 
			if(obj!=null){
				openid = (String)obj;
			}
			TigerNaming naming = new TigerNaming();
			naming.setOpenid(openid);
			naming.setOptTime(new Date());
			naming.setUserid(entity.getIdcard());
			this.tigerNamingService.add(naming);
		}else{
			//没有用户信息
			model.addAttribute("msg","没用此用户");
		}
		return viewName;
	}
}