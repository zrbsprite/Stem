package com.stem.controller;

import java.io.PrintWriter;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.stem.core.commons.AjaxConroller;
import com.stem.core.constant.CookieConstant;
import com.stem.core.constant.ErrorConstant;
import com.stem.entity.User;
import com.stem.service.UserService;
import com.stem.util.CookieUtil;
import com.stem.util.Md5Encrypt;
import com.stem.vo.UserLoginVO;

@Controller
@RequestMapping("")
public class LoginController extends AjaxConroller{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Value("#{propertiesReader[cookie_username_key]}")
	private String cookieUserNameKey;

	private UserService userService;

	@RequestMapping("/index")
	public String index() {
		return "fore/home";
	}

	@RequestMapping("/login")
	public void doLogin(@ModelAttribute UserLoginVO user, Model model, PrintWriter pw) {
		if(null==user){
			user = new UserLoginVO();
		}
		User entity = this.userService.selectByUserName(user.getUserName());
		JSONObject resultObject = new JSONObject();
		if(null==entity){
			resultObject.put("errcode", ErrorConstant.USER_PWD_ERROR);
			resultObject.put("errmsg", getMessage("user.noexist"));
			writeJson(resultObject.toJSONString());
			return;
		}
		String encryptedPwd = Md5Encrypt.getMD5ofStr(user.getPassword());
		if(!encryptedPwd.equalsIgnoreCase(entity.getPassword())){
			resultObject.put("errcode", ErrorConstant.USER_PWD_ERROR);
			resultObject.put("errmsg", getMessage("user.login.up.error"));
			writeJson(resultObject.toJSONString());
			return;
		}
		//登录成功
		CookieUtil.addCookie(response, CookieConstant.COOKIE_USERNAME_KEY, user.getUserName());
		
		logger.debug("用户【"+user.getUserName()+"】登录成功...");
		
		resultObject.put("errcode", ErrorConstant.OPERATION_SUCCESS);
		resultObject.put("errmsg", getMessage("user.login.success"));
		writeJson(resultObject.toJSONString());
	}

	@RequestMapping("/welcome")
	public String content(Model model) {
		return "redirect:pro/index.htm";
	}

	@RequestMapping("test")
	public String test(){
		return "fore/index";
	}
	
	@RequestMapping("anno/temp")
	public String temp(){
		return "fore/temp";
	}
	
	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}