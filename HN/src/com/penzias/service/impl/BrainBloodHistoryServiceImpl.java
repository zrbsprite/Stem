package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.BrainBloodHistoryMapper;
import com.penzias.entity.BrainBloodHistory;
import com.penzias.entity.BrainBloodHistoryExample;
import com.penzias.service.BrainBloodHistoryService;

@Service("brainBloodHistoryService")
public class BrainBloodHistoryServiceImpl extends BasicServiceImpl<BrainBloodHistoryExample, BrainBloodHistory> implements BrainBloodHistoryService {

	@Resource
	private BrainBloodHistoryMapper brainBloodHistoryMapper;
	
	@Override
	public BasicMapper<BrainBloodHistoryExample, BrainBloodHistory> getMapper(){

		return brainBloodHistoryMapper;
	}

}
