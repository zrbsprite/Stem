package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.PulmonaryDiseaseHistoryMapper;
import com.penzias.entity.PulmonaryDiseaseHistory;
import com.penzias.entity.PulmonaryDiseaseHistoryExample;
import com.penzias.service.PulmonaryDiseaseHistoryService;

@Service("pulmonaryDiseaseHistoryService")
public class PulmonaryDiseaseHistoryServiceImpl extends BasicServiceImpl<PulmonaryDiseaseHistoryExample, PulmonaryDiseaseHistory> implements PulmonaryDiseaseHistoryService {

	@Resource
	private PulmonaryDiseaseHistoryMapper pulmonaryDiseaseHistoryMapper;
	
	@Override
	public BasicMapper<PulmonaryDiseaseHistoryExample, PulmonaryDiseaseHistory> getMapper(){

		return pulmonaryDiseaseHistoryMapper;
	}

}
