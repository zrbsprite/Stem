package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TigerOptMapper;
import com.stem.entity.TigerOpt;
import com.stem.entity.TigerOptExample;
import com.stem.service.TigerOptService;

@Service("tigerOptService")
public class TigerOptServiceImpl implements TigerOptService {

	private TigerOptMapper TigerOptMapper;
	
	@Override
	public List<TigerOpt> list(TigerOptExample example){

		return this.TigerOptMapper.selectByExample(example);
	}

	@Override
	public TigerOpt getByPK(Integer id){

		return this.TigerOptMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TigerOptExample example){

		return this.TigerOptMapper.countByExample(example);
	}

	@Override
	public int update(TigerOpt model,TigerOptExample example){

		return this.TigerOptMapper.updateByExample(model,example);
	}

	@Override
	public int updateByPK(TigerOpt model){

		return this.updateByPK(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.TigerOptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TigerOptExample example){

		return this.TigerOptMapper.deleteByExample(example);
	}

	@Override
	public int add(TigerOpt model){

		return this.TigerOptMapper.insert(model);
	}

	@Resource
	public void setTigerOptMapper(TigerOptMapper TigerOptMapper){
	
		this.TigerOptMapper = TigerOptMapper;
	}
}
