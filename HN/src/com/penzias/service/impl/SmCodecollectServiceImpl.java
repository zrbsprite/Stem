package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.SmCodecollectMapper;
import com.penzias.entity.SmCodecollect;
import com.penzias.entity.SmCodecollectExample;
import com.penzias.service.SmCodecollectService;

@Service("smCodecollectService")
public class SmCodecollectServiceImpl extends BasicServiceImpl<SmCodecollectExample, SmCodecollect> implements SmCodecollectService {

	@Resource
	private SmCodecollectMapper smCodecollectMapper;
	
	@Override
	public BasicMapper<SmCodecollectExample, SmCodecollect> getMapper(){

		return smCodecollectMapper;
	}

}
