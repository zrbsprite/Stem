package com.stem.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContext;

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
	public void doLogin(@ModelAttribute UserLoginVO user, Model model, HttpServletRequest request, HttpServletResponse response) {
		if(null==user){
			user = new UserLoginVO();
		}
		User entity = this.userService.selectByUserName(user.getUserName());
		JSONObject resultObject = new JSONObject();
		RequestContext context = new RequestContext(request);
		if(null==entity){
			resultObject.put("errcode", ErrorConstant.USER_PWD_ERROR);
			resultObject.put("errmsg", context.getMessage("user.noexist"));
			writeJson(response, resultObject.toJSONString());
			return;
		}
		String encryptedPwd = Md5Encrypt.getMD5ofStr(user.getPassword());
		if(!encryptedPwd.equalsIgnoreCase(entity.getPassword())){
			resultObject.put("errcode", ErrorConstant.USER_PWD_ERROR);
			resultObject.put("errmsg", context.getMessage("user.login.up.error"));
			writeJson(response, resultObject.toJSONString());
			return;
		}
		//登录成功
		CookieUtil.addCookie(response, CookieConstant.COOKIE_USERNAME_KEY, user.getUserName());
		
		logger.debug("用户【"+user.getUserName()+"】登录成功...");
		
		resultObject.put("errcode", ErrorConstant.OPERATION_SUCCESS);
		resultObject.put("errmsg", context.getMessage("user.login.success"));
		writeJson(response, resultObject.toJSONString());
	}

	@RequestMapping("/welcome")
	public String content(HttpServletRequest request, Model model) {
		return "redirect:pro/index.htm";
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}