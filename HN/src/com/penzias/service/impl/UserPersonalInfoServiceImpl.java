package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.UserPersonalInfoMapper;
import com.penzias.entity.UserPersonalInfo;
import com.penzias.entity.UserPersonalInfoExample;
import com.penzias.service.UserPersonalInfoService;

@Service("userPersonalInfoService")
public class UserPersonalInfoServiceImpl extends BasicServiceImpl<UserPersonalInfoExample, UserPersonalInfo> implements UserPersonalInfoService {

	@Resource
	private UserPersonalInfoMapper userPersonalInfoMapper;
	
	@Override
	public BasicMapper<UserPersonalInfoExample, UserPersonalInfo> getMapper(){

		return userPersonalInfoMapper;
	}

}
