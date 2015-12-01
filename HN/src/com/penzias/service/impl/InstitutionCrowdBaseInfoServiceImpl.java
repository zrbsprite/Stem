package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.InstitutionCrowdBaseInfoMapper;
import com.penzias.entity.InstitutionCrowdBaseInfo;
import com.penzias.entity.InstitutionCrowdBaseInfoExample;
import com.penzias.service.InstitutionCrowdBaseInfoService;

@Service("institutionCrowdBaseInfoService")
public class InstitutionCrowdBaseInfoServiceImpl extends BasicServiceImpl<InstitutionCrowdBaseInfoExample, InstitutionCrowdBaseInfo> implements InstitutionCrowdBaseInfoService {

	@Resource
	private InstitutionCrowdBaseInfoMapper institutionCrowdBaseInfoMapper;
	
	@Override
	public BasicMapper<InstitutionCrowdBaseInfoExample, InstitutionCrowdBaseInfo> getMapper(){

		return institutionCrowdBaseInfoMapper;
	}

}
