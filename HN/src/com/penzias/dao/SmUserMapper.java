package com.penzias.dao;

import java.util.List;
import java.util.Map;

import com.penzias.core.interfaces.BasicMapper;
import com.penzias.entity.SmUser;
import com.penzias.entity.SmUserExample;

public interface SmUserMapper extends BasicMapper<SmUserExample, SmUser>{
	
	public List<SmUser> selectUserInfoByExample(Map<String, Object> params);
}