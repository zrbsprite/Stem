package com.stem.core.interceptor;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.stem.core.commons.PropertiesInitBean.PropertiesUtils;
import com.stem.entity.TigerUserOpt;
import com.stem.service.TigerUserOptService;
import com.stem.util.HttpUtils;

/**
 * 描述：拦截客户行为<br/>
 * 作者：stem zhang <br/>
 * 修改日期：2015年8月13日 - 下午4:45:01<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class OptInterceptor extends HandlerInterceptorAdapter {

	private TigerUserOptService tigerUserOptService;
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler)
			throws Exception{
		//拦截state
		String state = request.getParameter("state");
		String code = request.getParameter("code");
		if(!StringUtils.isEmpty(state) && !StringUtils.isEmpty(code)){
			//请求openid
			String accessTokenUrl = PropertiesUtils.getConfigByKey("mp_web_access_token_url");
			String appid = PropertiesUtils.getConfigByKey("AppId");
			String secret = PropertiesUtils.getConfigByKey("AppSecret");
			accessTokenUrl = String.format(accessTokenUrl,appid, secret, code);
			String result = HttpUtils.postHttpByJsonData(accessTokenUrl,"");
			JSONObject object = JSON.parseObject(result);
			Map map = JSON.toJavaObject(object, Map.class);
			Object obj = map.get("openid");
			String openid = ""; 
			if(obj!=null){
				openid = (String)obj;
			}
			request.setAttribute("openid",openid);
			TigerUserOpt model = new TigerUserOpt();
			model.setOpenid(openid);
			model.setOptCode(state);
			model.setOptTime(new Date());
			this.tigerUserOptService.add(model);
		}
		return true;
	}
	
	@Resource
	public void setTigerUserOptService(TigerUserOptService tigerUserOptService){
	
		this.tigerUserOptService = tigerUserOptService;
	}
}
