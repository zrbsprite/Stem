package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.HypertensionHistoryMapper;
import com.penzias.entity.HypertensionHistory;
import com.penzias.entity.HypertensionHistoryExample;
import com.penzias.service.HypertensionHistoryService;

@Service("hypertensionHistoryService")
public class HypertensionHistoryServiceImpl extends BasicServiceImpl<HypertensionHistoryExample, HypertensionHistory> implements HypertensionHistoryService {

	@Resource
	private HypertensionHistoryMapper hypertensionHistoryMapper;
	
	@Override
	public BasicMapper<HypertensionHistoryExample, HypertensionHistory> getMapper(){

		return hypertensionHistoryMapper;
	}

}
