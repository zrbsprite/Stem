package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.KidneyDiseaseHostoryMapper;
import com.penzias.entity.KidneyDiseaseHostory;
import com.penzias.entity.KidneyDiseaseHostoryExample;
import com.penzias.service.KidneyDiseaseHostoryService;

@Service("kidneyDiseaseHostoryService")
public class KidneyDiseaseHostoryServiceImpl extends BasicServiceImpl<KidneyDiseaseHostoryExample, KidneyDiseaseHostory> implements KidneyDiseaseHostoryService {

	@Resource
	private KidneyDiseaseHostoryMapper kidneyDiseaseHostoryMapper;
	
	@Override
	public BasicMapper<KidneyDiseaseHostoryExample, KidneyDiseaseHostory> getMapper(){

		return kidneyDiseaseHostoryMapper;
	}

}
