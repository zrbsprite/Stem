package com.penzias.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.penzias.core.commons.AjaxConroller;
import com.penzias.core.constant.CookieConstant;
import com.penzias.core.constant.ErrorConstant;
import com.penzias.entity.SmUser;
import com.penzias.entity.SmUserExample;
import com.penzias.service.SmUserService;
import com.penzias.util.CookieUtil;
import com.penzias.util.DesEncrypt;
import com.penzias.vo.UserLoginVO;

@Controller
@RequestMapping("")
public class LoginController extends AjaxConroller{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	//用户处理
	@Resource
	private SmUserService smUserService;
	
	@Value("#{propertiesReader[cookie_username_key]}")
	private String cookieUserNameKey;
	
	@Value("#{propertiesReader[cookie_password_key]}")
	private String cookiePasswordKey;

	/**
	 * @author: Bob
	 * 修改时间：2015年12月2日 - 上午10:10:58<br/>
	 * 功能说明：登录页面<br/>
	 * @return
	 */
	@RequestMapping("/login")
	public String index() {
		return "door/login";
	}

	/**
	 * @author: Bob
	 * 修改时间：2015年12月2日 - 上午10:11:08<br/>
	 * 功能说明：用户校验<br/>
	 * @param user
	 * @param model
	 * @param pw
	 */
	@RequestMapping("/sign")
	public void doLogin(@ModelAttribute UserLoginVO user, Model model, PrintWriter pw) {
		JSONObject json = new JSONObject();
		if(null!=user){
			SmUserExample example = new SmUserExample();
			String encrypedPassword = DigestUtils.md5Hex(user.getPassword());
			example.createCriteria().andUsernameEqualTo(user.getUserName()).andPasswordEqualTo(encrypedPassword);
			List<SmUser> list = this.smUserService.list(example);
			if(list.size()>0){
				//校验成功
				DesEncrypt encrypt = new DesEncrypt();
				String encrypedUsername =  encrypt.getEncString(user.getUserName());
				CookieUtil.addCookie(response, CookieConstant.COOKIE_USERNAME_KEY, encrypedUsername);
				logger.debug("用户【"+user.getUserName()+"】登录成功...");
				json.put("status", ErrorConstant.OPERATION_SUCCESS);
				json.put("msg", getMessage("user.login.success"));
			}else{
				//用户名或密码错误
				json.put("status", ErrorConstant.USER_PWD_ERROR);
				json.put("msg", getMessage("user.login.up.error"));
			}
			writeJson(json.toJSONString());
		}else{
			//用户名或密码为空，非法用户
			json.put("status",400);
			json.put("msg", getMessage("user.notallow"));
			writeJson(json.toJSONString());
		}
	}

	/**
	 * @author: Bob
	 * 修改时间：2015年12月2日 - 上午10:38:02<br/>
	 * 功能说明：退出登录<br/>
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(){
		CookieUtil.removeCookie(response, CookieConstant.COOKIE_USERNAME_KEY);
		return "door/login";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月2日 - 上午10:11:22<br/>
	 * 功能说明：欢迎页面<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("/welcome")
	public String content(Model model) {
		return "redirect:pro/index.htm";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月2日 - 上午10:11:37<br/>
	 * 功能说明：测试 demo<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("anno/demo")
	public String index(Model model) {
		return "demo/index";
	}
	
	/**
	 * @author: Bob
	 * 修改时间：2015年12月2日 - 上午10:11:49<br/>
	 * 功能说明：ie demo<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("anno/ie")
	public String ie(Model model) {
		return "demo/index_ie";
	}
}