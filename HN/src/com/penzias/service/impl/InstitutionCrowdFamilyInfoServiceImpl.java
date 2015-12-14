package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.InstitutionCrowdFamilyInfoMapper;
import com.penzias.entity.InstitutionCrowdFamilyInfo;
import com.penzias.entity.InstitutionCrowdFamilyInfoExample;
import com.penzias.service.InstitutionCrowdFamilyInfoService;

@Service("institutionCrowdFamilyInfoService")
public class InstitutionCrowdFamilyInfoServiceImpl extends BasicServiceImpl<InstitutionCrowdFamilyInfoExample, InstitutionCrowdFamilyInfo> implements InstitutionCrowdFamilyInfoService {

	@Resource
	private InstitutionCrowdFamilyInfoMapper institutionCrowdFamilyInfoMapper;
	
	@Override
	public BasicMapper<InstitutionCrowdFamilyInfoExample, InstitutionCrowdFamilyInfo> getMapper(){

		return institutionCrowdFamilyInfoMapper;
	}

	@Override
	public int addBatch(InstitutionCrowdFamilyInfo[] arrays){

		return this.institutionCrowdFamilyInfoMapper.batchInsert(arrays);
	}

}
