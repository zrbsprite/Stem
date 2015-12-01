package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.HeartDiseaseHistoryMapper;
import com.penzias.entity.HeartDiseaseHistory;
import com.penzias.entity.HeartDiseaseHistoryExample;
import com.penzias.service.HeartDiseaseHistoryService;

@Service("heartDiseaseHistoryService")
public class HeartDiseaseHistoryServiceImpl extends BasicServiceImpl<HeartDiseaseHistoryExample, HeartDiseaseHistory> implements HeartDiseaseHistoryService {

	@Resource
	private HeartDiseaseHistoryMapper heartDiseaseHistoryMapper;
	
	@Override
	public BasicMapper<HeartDiseaseHistoryExample, HeartDiseaseHistory> getMapper(){

		return heartDiseaseHistoryMapper;
	}

}
