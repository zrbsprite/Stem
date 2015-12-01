package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.SmUserMapper;
import com.penzias.entity.SmUser;
import com.penzias.entity.SmUserExample;
import com.penzias.service.SmUserService;

@Service("smUserService")
public class SmUserServiceImpl extends BasicServiceImpl<SmUserExample, SmUser> implements SmUserService {

	@Resource
	private SmUserMapper smUserMapper;
	
	@Override
	public BasicMapper<SmUserExample, SmUser> getMapper(){

		return smUserMapper;
	}

}
