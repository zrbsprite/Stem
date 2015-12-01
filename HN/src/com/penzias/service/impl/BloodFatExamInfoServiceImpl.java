package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.BloodFatExamInfoMapper;
import com.penzias.entity.BloodFatExamInfo;
import com.penzias.entity.BloodFatExamInfoExample;
import com.penzias.service.BloodFatExamInfoService;

@Service("bloodFatExamInfoService")
public class BloodFatExamInfoServiceImpl extends BasicServiceImpl<BloodFatExamInfoExample, BloodFatExamInfo> implements BloodFatExamInfoService {

	@Resource
	private BloodFatExamInfoMapper bloodFatExamInfoMapper;
	
	@Override
	public BasicMapper<BloodFatExamInfoExample, BloodFatExamInfo> getMapper(){

		return bloodFatExamInfoMapper;
	}

}
