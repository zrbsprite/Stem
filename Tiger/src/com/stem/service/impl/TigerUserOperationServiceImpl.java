package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TigerUserOperationMapper;
import com.stem.entity.TigerUserOperation;
import com.stem.entity.TigerUserOperationExample;
import com.stem.service.TigerUserOperationService;

@Service("tigerUserOperationService")
public class TigerUserOperationServiceImpl implements TigerUserOperationService {

	private TigerUserOperationMapper tigerUserOperationMapper;
	
	@Override
	public List<TigerUserOperation> list(TigerUserOperationExample example){

		return this.tigerUserOperationMapper.selectByExample(example);
	}

	@Override
	public TigerUserOperation getByPK(Integer id){

		return this.tigerUserOperationMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TigerUserOperationExample example){

		return this.tigerUserOperationMapper.countByExample(example);
	}

	@Override
	public int update(TigerUserOperation model,TigerUserOperationExample example){

		return this.tigerUserOperationMapper.updateByExample(model,example);
	}

	@Override
	public int updateByPK(TigerUserOperation model){

		return this.updateByPK(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.tigerUserOperationMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TigerUserOperationExample example){

		return this.tigerUserOperationMapper.deleteByExample(example);
	}

	@Override
	public int add(TigerUserOperation model){

		return this.tigerUserOperationMapper.insert(model);
	}

	@Resource
	public void setTigerUserOperationMapper(TigerUserOperationMapper TigerUserOperationMapper){
	
		this.tigerUserOperationMapper = TigerUserOperationMapper;
	}
}
