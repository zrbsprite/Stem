package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.SmCodeitemMapper;
import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmCodeitemExample;
import com.penzias.service.SmCodeitemService;

@Service("smCodeitemService")
public class SmCodeitemServiceImpl extends BasicServiceImpl<SmCodeitemExample, SmCodeitem> implements SmCodeitemService {

	@Resource
	private SmCodeitemMapper smCodeitemMapper;
	
	@Override
	public BasicMapper<SmCodeitemExample, SmCodeitem> getMapper(){

		return smCodeitemMapper;
	}

}
