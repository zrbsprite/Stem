package com.penzias.dao;

import com.penzias.core.interfaces.BasicMapper;
import com.penzias.entity.InstitutionCrowdFamilyInfo;
import com.penzias.entity.InstitutionCrowdFamilyInfoExample;

public interface InstitutionCrowdFamilyInfoMapper extends BasicMapper<InstitutionCrowdFamilyInfoExample, InstitutionCrowdFamilyInfo>{
	
	public int batchInsert(InstitutionCrowdFamilyInfo[] arrays);
}