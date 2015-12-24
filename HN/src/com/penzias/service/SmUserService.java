package com.penzias.service;

import java.util.List;
import java.util.Map;

import com.penzias.core.interfaces.BasicService;
import com.penzias.entity.SmUser;
import com.penzias.entity.SmUserExample;

public interface SmUserService extends BasicService<SmUserExample, SmUser> {

	public List<SmUser> listUserInfo(Map<String, Object> params);
	
	public List<SmUser> listSysUserInfo(Map<String, Object> params);
}