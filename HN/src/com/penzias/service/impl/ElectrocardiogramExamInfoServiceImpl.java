package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.ElectrocardiogramExamInfoMapper;
import com.penzias.entity.ElectrocardiogramExamInfo;
import com.penzias.entity.ElectrocardiogramExamInfoExample;
import com.penzias.service.ElectrocardiogramExamInfoService;

@Service("electrocardiogramExamInfoService")
public class ElectrocardiogramExamInfoServiceImpl extends BasicServiceImpl<ElectrocardiogramExamInfoExample, ElectrocardiogramExamInfo> implements ElectrocardiogramExamInfoService {

	@Resource
	private ElectrocardiogramExamInfoMapper electrocardiogramExamInfoMapper;
	
	@Override
	public BasicMapper<ElectrocardiogramExamInfoExample, ElectrocardiogramExamInfo> getMapper(){

		return electrocardiogramExamInfoMapper;
	}

}
