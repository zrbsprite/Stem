package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.ApoplexyConclusionInfoMapper;
import com.penzias.entity.ApoplexyConclusionInfo;
import com.penzias.entity.ApoplexyConclusionInfoExample;
import com.penzias.service.ApoplexyConclusionInfoService;

@Service("apoplexyConclusionInfoService")
public class ApoplexyConclusionInfoServiceImpl extends BasicServiceImpl<ApoplexyConclusionInfoExample, ApoplexyConclusionInfo> implements ApoplexyConclusionInfoService {

	@Resource
	private ApoplexyConclusionInfoMapper apoplexyConclusionInfoMapper;
	
	@Override
	public BasicMapper<ApoplexyConclusionInfoExample, ApoplexyConclusionInfo> getMapper(){

		return apoplexyConclusionInfoMapper;
	}

}
