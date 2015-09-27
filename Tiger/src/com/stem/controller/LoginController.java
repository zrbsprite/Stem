package com.stem.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerAccessToken;
import com.stem.entity.TigerNaming;
import com.stem.entity.TigerUserinfo;
import com.stem.entity.TigerUserinfoExample;
import com.stem.entity.WxUserinfo;
import com.stem.entity.WxUserinfoExample;
import com.stem.service.TigerAccessTokenService;
import com.stem.service.TigerNamingService;
import com.stem.service.TigerUserinfoService;
import com.stem.service.WxUserinfoService;
import com.stem.util.HttpUtils;
import com.stem.wechat.TigerUtils;
import com.stem.wechat.bean.UserInfo;
import com.stem.wechat.oauth.WechatUserUtils;

@Controller
@RequestMapping("wechat")
public class LoginController extends AjaxConroller{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TigerUserinfoService tigerUserinfoService;
	
	@Resource
	private TigerNamingService tigerNamingService;
	
	@Resource
	private TigerAccessTokenService tigerAccessTokenService;
	
	@Resource
	private WxUserinfoService wxUserinfoService;
	
	@RequestMapping("index")
	public String index(Model model){
		model.addAttribute("wxurl", getServerLocalePath());
		return "fore/login";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("bind")
	public String login(@ModelAttribute TigerUserinfo entity, String code, Model model){
		model.addAttribute("wxurl", getServerLocalePath());
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
			Map<String, ?> map = JSON.toJavaObject(object, Map.class);
			Object obj = map.get("openid");
			String openid = ""; 
			if(obj!=null){
				openid = (String)obj;
			}
			
			//获取微信用户的基本信息
			if(!StringUtils.isEmpty(openid)){
				UserInfo user = null;
				try{
					TigerAccessToken accessTokenBean = TigerUtils.getAccessTokenBean(tigerAccessTokenService);
					String accessToken = accessTokenBean.getAccesstoken(); 
					user = WechatUserUtils.getUserInfo(accessToken, openid);
				} catch(Exception e){
					logger.error("获取微信用户的基本信息失败："+e.getMessage());
					e.printStackTrace();
				}
				if(user!=null){
					WxUserinfo wxUserinfo = new WxUserinfo();
					try{
						BeanUtils.copyProperties(wxUserinfo, user);
						WxUserinfoExample wxUserinfoExample = new WxUserinfoExample();
						wxUserinfoExample.createCriteria().andOpenidEqualTo(user.getOpenid());
						List<WxUserinfo> infoList = this.wxUserinfoService.list(wxUserinfoExample);
						if(infoList.size()<=0){
							this.wxUserinfoService.add(wxUserinfo);
						}else{
							this.wxUserinfoService.update(wxUserinfo, wxUserinfoExample);
						}
					}
					catch(IllegalAccessException e){
						e.printStackTrace();
					}
					catch(InvocationTargetException e){
						e.printStackTrace();
					}
				}
			}
			
			TigerNaming naming = new TigerNaming();
			naming.setOpenid(openid);
			naming.setOptTime(new Date());
			naming.setUserid(entity.getIdcard());
			this.tigerNamingService.add(naming);
		}else{
			//没有用户信息
			model.addAttribute("msg","没用此用户");
			viewName = "fore/error";
		}
		return viewName;
	}
}