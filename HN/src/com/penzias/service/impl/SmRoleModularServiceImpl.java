package com.penzias.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.SmRoleModularMapper;
import com.penzias.entity.SmRoleModular;
import com.penzias.entity.SmRoleModularExample;
import com.penzias.service.SmRoleModularService;

@Service("smRoleModularService")
public class SmRoleModularServiceImpl extends BasicServiceImpl<SmRoleModularExample, SmRoleModular> implements SmRoleModularService {

	@Resource
	private SmRoleModularMapper smRoleModularMapper;
	
	@Override
	public BasicMapper<SmRoleModularExample, SmRoleModular> getMapper(){

		return smRoleModularMapper;
	}

	@Override
	public Integer addMore(List<SmRoleModular> list){
		return this.smRoleModularMapper.insertBatch(list);
	}

}
