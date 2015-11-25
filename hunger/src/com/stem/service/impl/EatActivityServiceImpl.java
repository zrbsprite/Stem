package com.stem.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.core.BasicServiceImpl;
import com.stem.core.interfaces.BasicMapper;
import com.stem.dao.ProductActivityMapper;
import com.stem.entity.ProductActivity;
import com.stem.entity.ProductActivityExample;
import com.stem.service.EatActivityService;

@Service("eatActivityService")
public class EatActivityServiceImpl extends BasicServiceImpl<ProductActivityExample, ProductActivity> implements EatActivityService {

	@Resource
	private ProductActivityMapper productActivityMapper;

	@Override
	public BasicMapper<ProductActivityExample, ProductActivity> getMapper(){
		return this.productActivityMapper;
	}

}
