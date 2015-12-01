package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.DiabetesHistoryMapper;
import com.penzias.entity.DiabetesHistory;
import com.penzias.entity.DiabetesHistoryExample;
import com.penzias.service.DiabetesHistoryService;

@Service("diabetesHistoryService")
public class DiabetesHistoryServiceImpl extends BasicServiceImpl<DiabetesHistoryExample, DiabetesHistory> implements DiabetesHistoryService {

	@Resource
	private DiabetesHistoryMapper diabetesHistoryMapper;
	
	@Override
	public BasicMapper<DiabetesHistoryExample, DiabetesHistory> getMapper(){

		return diabetesHistoryMapper;
	}

}
