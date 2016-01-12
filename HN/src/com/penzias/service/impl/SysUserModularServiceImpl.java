package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.SysUserModularMapper;
import com.penzias.entity.SysUserModular;
import com.penzias.entity.SysUserModularExample;
import com.penzias.service.SysUserModularService;

@Service("sysUserModularService")
public class SysUserModularServiceImpl extends BasicServiceImpl<SysUserModularExample, SysUserModular> implements SysUserModularService {

	@Resource
	private SysUserModularMapper sysUserModularMapper;
	
	@Override
	public BasicMapper<SysUserModularExample, SysUserModular> getMapper(){

		return sysUserModularMapper;
	}

}
