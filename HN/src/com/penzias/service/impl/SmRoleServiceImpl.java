package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.SmRoleMapper;
import com.penzias.entity.SmRole;
import com.penzias.entity.SmRoleExample;
import com.penzias.service.SmRoleService;

@Service("smRoleService")
public class SmRoleServiceImpl extends BasicServiceImpl<SmRoleExample, SmRole> implements SmRoleService {

	@Resource
	private SmRoleMapper smRoleMapper;
	
	@Override
	public BasicMapper<SmRoleExample, SmRole> getMapper(){

		return smRoleMapper;
	}

}
