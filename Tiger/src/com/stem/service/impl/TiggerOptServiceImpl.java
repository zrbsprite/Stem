package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TiggerOptMapper;
import com.stem.entity.TiggerOpt;
import com.stem.entity.TiggerOptExample;
import com.stem.service.TiggerOptService;

@Service("tiggerOptService")
public class TiggerOptServiceImpl implements TiggerOptService {

	private TiggerOptMapper TiggerOptMapper;
	
	@Override
	public List<TiggerOpt> list(TiggerOptExample example){

		return this.TiggerOptMapper.selectByExample(example);
	}

	@Override
	public TiggerOpt getByPK(Integer id){

		return this.TiggerOptMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TiggerOptExample example){

		return this.TiggerOptMapper.countByExample(example);
	}

	@Override
	public int update(TiggerOpt model,TiggerOptExample example){

		return this.TiggerOptMapper.updateByExample(model,example);
	}

	@Override
	public int updateByPK(TiggerOpt model){

		return this.updateByPK(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.TiggerOptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TiggerOptExample example){

		return this.TiggerOptMapper.deleteByExample(example);
	}

	@Override
	public int add(TiggerOpt model){

		return this.TiggerOptMapper.insert(model);
	}

	@Resource
	public void setTiggerOptMapper(TiggerOptMapper TiggerOptMapper){
	
		this.TiggerOptMapper = TiggerOptMapper;
	}
}
