package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.InstitutionCrowdLifestyleInfoMapper;
import com.penzias.entity.InstitutionCrowdLifestyleInfo;
import com.penzias.entity.InstitutionCrowdLifestyleInfoExample;
import com.penzias.service.InstitutionCrowdLifestyleInfoService;

@Service("institutionCrowdLifestyleInfoService")
public class InstitutionCrowdLifestyleInfoServiceImpl extends BasicServiceImpl<InstitutionCrowdLifestyleInfoExample, InstitutionCrowdLifestyleInfo> implements InstitutionCrowdLifestyleInfoService {

	@Resource
	private InstitutionCrowdLifestyleInfoMapper institutionCrowdLifestyleInfoMapper;
	
	@Override
	public BasicMapper<InstitutionCrowdLifestyleInfoExample, InstitutionCrowdLifestyleInfo> getMapper(){

		return institutionCrowdLifestyleInfoMapper;
	}

}
