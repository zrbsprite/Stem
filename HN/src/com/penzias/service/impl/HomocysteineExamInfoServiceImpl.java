package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.HomocysteineExamInfoMapper;
import com.penzias.entity.HomocysteineExamInfo;
import com.penzias.entity.HomocysteineExamInfoExample;
import com.penzias.service.HomocysteineExamInfoService;

@Service("homocysteineExamInfoService")
public class HomocysteineExamInfoServiceImpl extends BasicServiceImpl<HomocysteineExamInfoExample, HomocysteineExamInfo> implements HomocysteineExamInfoService {

	@Resource
	private HomocysteineExamInfoMapper homocysteineExamInfoMapper;
	
	@Override
	public BasicMapper<HomocysteineExamInfoExample, HomocysteineExamInfo> getMapper(){

		return homocysteineExamInfoMapper;
	}

}
