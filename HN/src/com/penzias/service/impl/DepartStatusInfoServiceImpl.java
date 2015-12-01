package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.DepartStatusInfoMapper;
import com.penzias.entity.DepartStatusInfo;
import com.penzias.entity.DepartStatusInfoExample;
import com.penzias.service.DepartStatusInfoService;

@Service("departStatusInfoService")
public class DepartStatusInfoServiceImpl extends BasicServiceImpl<DepartStatusInfoExample, DepartStatusInfo> implements DepartStatusInfoService {

	@Resource
	private DepartStatusInfoMapper departStatusInfoMapper;
	
	@Override
	public BasicMapper<DepartStatusInfoExample, DepartStatusInfo> getMapper(){

		return departStatusInfoMapper;
	}

}
