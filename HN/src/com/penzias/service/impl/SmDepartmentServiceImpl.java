package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.SmDepartmentMapper;
import com.penzias.entity.SmDepartment;
import com.penzias.entity.SmDepartmentExample;
import com.penzias.service.SmDepartmentService;

@Service("smDepartmentService")
public class SmDepartmentServiceImpl extends BasicServiceImpl<SmDepartmentExample, SmDepartment> implements SmDepartmentService {

	@Resource
	private SmDepartmentMapper smDepartmentMapper;
	
	@Override
	public BasicMapper<SmDepartmentExample, SmDepartment> getMapper(){

		return smDepartmentMapper;
	}

}
