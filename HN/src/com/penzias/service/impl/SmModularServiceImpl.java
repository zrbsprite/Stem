package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.SmModularMapper;
import com.penzias.entity.SmModular;
import com.penzias.entity.SmModularExample;
import com.penzias.service.SmModularService;

@Service("smModularService")
public class SmModularServiceImpl extends BasicServiceImpl<SmModularExample, SmModular> implements SmModularService {

	@Resource
	private SmModularMapper smModularMapper;
	
	@Override
	public BasicMapper<SmModularExample, SmModular> getMapper(){

		return smModularMapper;
	}

}
