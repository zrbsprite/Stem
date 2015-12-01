package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.BloodFatHistoryMapper;
import com.penzias.entity.BloodFatHistory;
import com.penzias.entity.BloodFatHistoryExample;
import com.penzias.service.BloodFatHistoryService;

@Service("bloodFatHistoryService")
public class BloodFatHistoryServiceImpl extends BasicServiceImpl<BloodFatHistoryExample, BloodFatHistory> implements BloodFatHistoryService {

	@Resource
	private BloodFatHistoryMapper bloodFatHistoryMapper;
	
	@Override
	public BasicMapper<BloodFatHistoryExample, BloodFatHistory> getMapper(){

		return bloodFatHistoryMapper;
	}

}
