package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.BloodGlucoseExamInfoMapper;
import com.penzias.entity.BloodGlucoseExamInfo;
import com.penzias.entity.BloodGlucoseExamInfoExample;
import com.penzias.service.BloodGlucoseExamInfoService;

@Service("bloodGlucoseExamInfoService")
public class BloodGlucoseExamInfoServiceImpl extends BasicServiceImpl<BloodGlucoseExamInfoExample, BloodGlucoseExamInfo> implements BloodGlucoseExamInfoService {

	@Resource
	private BloodGlucoseExamInfoMapper bloodGlucoseExamInfoMapper;
	
	@Override
	public BasicMapper<BloodGlucoseExamInfoExample, BloodGlucoseExamInfo> getMapper(){

		return bloodGlucoseExamInfoMapper;
	}

}
