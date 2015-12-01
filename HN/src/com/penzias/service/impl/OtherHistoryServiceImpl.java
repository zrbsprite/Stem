package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.OtherHistoryMapper;
import com.penzias.entity.OtherHistory;
import com.penzias.entity.OtherHistoryExample;
import com.penzias.service.OtherHistoryService;

@Service("otherHistoryService")
public class OtherHistoryServiceImpl extends BasicServiceImpl<OtherHistoryExample, OtherHistory> implements OtherHistoryService {

	@Resource
	private OtherHistoryMapper otherHistoryMapper;
	
	@Override
	public BasicMapper<OtherHistoryExample, OtherHistory> getMapper(){

		return otherHistoryMapper;
	}

}
