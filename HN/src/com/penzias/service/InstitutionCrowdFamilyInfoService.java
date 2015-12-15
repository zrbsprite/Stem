package com.penzias.service;

import com.penzias.core.interfaces.BasicService;
import com.penzias.entity.InstitutionCrowdFamilyInfo;
import com.penzias.entity.InstitutionCrowdFamilyInfoExample;

public interface InstitutionCrowdFamilyInfoService extends BasicService<InstitutionCrowdFamilyInfoExample, InstitutionCrowdFamilyInfo> {
	
	public int addBatch(InstitutionCrowdFamilyInfo[] arrays);
	
	public int updateBatch(InstitutionCrowdFamilyInfo[] arrays);
}