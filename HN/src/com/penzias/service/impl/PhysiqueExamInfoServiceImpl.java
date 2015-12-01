package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.PhysiqueExamInfoMapper;
import com.penzias.entity.PhysiqueExamInfo;
import com.penzias.entity.PhysiqueExamInfoExample;
import com.penzias.service.PhysiqueExamInfoService;

@Service("physiqueExamInfoService")
public class PhysiqueExamInfoServiceImpl extends BasicServiceImpl<PhysiqueExamInfoExample, PhysiqueExamInfo> implements PhysiqueExamInfoService {

	@Resource
	private PhysiqueExamInfoMapper physiqueExamInfoMapper;
	
	@Override
	public BasicMapper<PhysiqueExamInfoExample, PhysiqueExamInfo> getMapper(){

		return physiqueExamInfoMapper;
	}

}
