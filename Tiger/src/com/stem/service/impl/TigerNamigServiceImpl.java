package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TigerNamingMapper;
import com.stem.entity.TigerNaming;
import com.stem.entity.TigerNamingExample;
import com.stem.service.TigerNamingService;

@Service("tigerNamingService")
public class TigerNamigServiceImpl implements TigerNamingService {

	private TigerNamingMapper tigerNamingMapper;
	
	@Override
	public List<TigerNaming> list(TigerNamingExample example){

		return this.tigerNamingMapper.selectByExample(example);
	}

	@Override
	public TigerNaming getByPK(Integer id){

		return this.tigerNamingMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TigerNamingExample example){

		return this.tigerNamingMapper.countByExample(example);
	}

	@Override
	public int update(TigerNaming model,TigerNamingExample example){

		return this.tigerNamingMapper.updateByExample(model,example);
	}

	@Override
	public int updateByPK(TigerNaming model){

		return this.updateByPK(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.tigerNamingMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TigerNamingExample example){

		return this.tigerNamingMapper.deleteByExample(example);
	}

	@Override
	public int add(TigerNaming model){

		return this.tigerNamingMapper.insert(model);
	}

	@Resource
	public void setTigerNamingMapper(TigerNamingMapper tigerNamingMapper){
	
		this.tigerNamingMapper = tigerNamingMapper;
	}
}
