package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TigerUserOptMapper;
import com.stem.entity.TigerUserOpt;
import com.stem.entity.TigerUserOptExample;
import com.stem.service.TigerUserOptService;

@Service("tigerUserOptService")
public class TigerUserOptServiceImpl implements TigerUserOptService {

	private TigerUserOptMapper TigerUserOptMapper;
	
	@Override
	public List<TigerUserOpt> list(TigerUserOptExample example){

		return this.TigerUserOptMapper.selectByExample(example);
	}

	@Override
	public TigerUserOpt getByPK(Integer id){

		return this.TigerUserOptMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TigerUserOptExample example){

		return this.TigerUserOptMapper.countByExample(example);
	}

	@Override
	public int update(TigerUserOpt model,TigerUserOptExample example){

		return this.TigerUserOptMapper.updateByExample(model,example);
	}

	@Override
	public int updateByPK(TigerUserOpt model){

		return this.updateByPK(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.TigerUserOptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TigerUserOptExample example){

		return this.TigerUserOptMapper.deleteByExample(example);
	}

	@Override
	public int add(TigerUserOpt model){

		return this.TigerUserOptMapper.insert(model);
	}

	@Resource
	public void setTigerUserOptMapper(TigerUserOptMapper TigerUserOptMapper){
	
		this.TigerUserOptMapper = TigerUserOptMapper;
	}
}
