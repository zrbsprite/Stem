package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.ProductActivityMapper;
import com.stem.entity.ProductActivity;
import com.stem.entity.ProductActivityExample;
import com.stem.service.EatActivityService;

@Service("eatActivityService")
public class EatActivityServiceImpl implements EatActivityService {

	private ProductActivityMapper productActivityMapper;

	@Override
	public List<ProductActivity> list(ProductActivityExample example){
		return this.productActivityMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public ProductActivity getByPK(Integer id){

		return this.productActivityMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(ProductActivityExample example){

		return this.productActivityMapper.countByExample(example);
	}

	@Override
	public int update(ProductActivity model,ProductActivityExample example){

		return this.productActivityMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(ProductActivity model){

		return this.productActivityMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.productActivityMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(ProductActivityExample example){

		return this.productActivityMapper.deleteByExample(example);
	}

	@Override
	public int add(ProductActivity model){

		return this.productActivityMapper.insertSelective(model);
	}

	public ProductActivityMapper getProductActivityMapper(){

		return productActivityMapper;
	}

	@Resource
	public void setProductActivityMapper(ProductActivityMapper productActivityMapper){

		this.productActivityMapper = productActivityMapper;
	}
}
