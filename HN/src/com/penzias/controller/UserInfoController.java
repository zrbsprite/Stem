package com.penzias.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.penzias.core.commons.AjaxConroller;
import com.penzias.entity.SmUser;
import com.penzias.entity.UserPersonalInfo;
import com.penzias.service.SmUserService;
import com.penzias.service.UserPersonalInfoService;
import com.penzias.util.CookieUtil;

/**
 * <b>描述：</b>用户操作控制器	<br/>
 * <b>作者：</b>zrb <br/>
 * <b>修改日期：</b>2016年1月15日 - 下午5:01:25<br/>
 *
 */
@Controller
@RequestMapping("user")
public class UserInfoController extends AjaxConroller{

	@Resource
	private SmUserService smUserService;
	
	@Resource
	private UserPersonalInfoService userPersonalInfoService;
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午5:11:11<br/>
	 * <b>功能说明：</b>跳转添加个人信息页面<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("add")
	public String addUserInfoPage(Model model, HttpServletRequest request){
		String username = CookieUtil.getCookieValueByName(request, cookieUserNameKey);
		UserPersonalInfo info = this.userPersonalInfoService.getById(username);
		if(null!=info){
			model.addAttribute("bean",info);
		}else{
			model.addAttribute("bean",new UserPersonalInfo());
		}
		return "user/user_info";
	}
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午5:11:28<br/>
	 * <b>功能说明：</b>保存用户个人信息<br/>
	 * @param bean
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("saveinfo")
	public String saveUserInfo(UserPersonalInfo bean, Model model, HttpServletRequest request){
		String username = bean.getUsername();
		if(!StringUtils.isEmpty(username)){
			this.userPersonalInfoService.updateById(bean);
		}else{
			this.userPersonalInfoService.add(bean);
		}
		return "redirect:/user/add.htm";
	}
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午5:24:31<br/>
	 * <b>功能说明：</b>跳转修改密码页面<br/>
	 * @param model
	 * @return
	 */
	@RequestMapping("torepwd")
	public String modifyPasswordPage(Integer err, Model model, HttpServletRequest request){
		if(null!=err){
			if(1==err){
				model.addAttribute("error",getMessage(request, "user.resetpassword.err"));
			}
		}
		return "user/reset_password";
	}
	
	/**
	 * 方法名称: validatePassword<br/>
	 * 描述：校验原密码<br/>
	 * 作者: ruibo<br/>
	 * 修改日期：2016年1月17日-上午10:34:12<br/>
	 * @throws IOException 
	 */
	@RequestMapping("vp")
	public void validatePassword(String pwd, HttpServletRequest request, HttpServletResponse response) throws IOException{
		String username = CookieUtil.getCookieValueByName(request, cookieUserNameKey);
		SmUser user = this.smUserService.getById(username);
		String encryptedPassword = DigestUtils.md5Hex(pwd);
		JSONObject obj = new JSONObject();
		if(!encryptedPassword.equals(user.getPassword())){
			obj.put("msg","原密码错误！");
			obj.put("state",400);
			writeJson(response, obj.toJSONString());
		}else{
			obj.put("state",200);
			writeJson(response, obj.toJSONString());
		}
	}
	
	/**
	 * <b>作者:</b> zrb<br/>
	 * <b>修改时间：</b>2016年1月15日 - 下午5:24:51<br/>
	 * <b>功能说明：</b>修改密码页面<br/>
	 * @param oldPassword
	 * @param pwd
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("repwd")
	public String modifyPassword(String oldPassword, String pwd, Model model, HttpServletRequest request){
		String username = CookieUtil.getCookieValueByName(request, cookieUserNameKey);
		SmUser user = this.smUserService.getById(username);
		String encryptedPassword = DigestUtils.md5Hex(oldPassword);
		if(encryptedPassword.equals(user.getPassword())){
			String encryptedPwd = DigestUtils.md5Hex(pwd);
			user.setPassword(encryptedPwd);
			this.smUserService.updateById(user);
			//提示需要重新登录，然后重新登录
			return "redirect:/logout.htm?err=2";
		}else{
			//原密码错误
			return "redirect:/user/torepwd.htm?err=1";
		}
	}
}
