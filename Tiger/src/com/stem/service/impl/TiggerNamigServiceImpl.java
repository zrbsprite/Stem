package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TiggerNamingMapper;
import com.stem.entity.TiggerNaming;
import com.stem.entity.TiggerNamingExample;
import com.stem.service.TiggerNamingService;

@Service("tiggerNamingService")
public class TiggerNamigServiceImpl implements TiggerNamingService {

	private TiggerNamingMapper tiggerNamingMapper;
	
	@Override
	public List<TiggerNaming> list(TiggerNamingExample example){

		return this.tiggerNamingMapper.selectByExample(example);
	}

	@Override
	public TiggerNaming getByPK(Integer id){

		return this.tiggerNamingMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TiggerNamingExample example){

		return this.tiggerNamingMapper.countByExample(example);
	}

	@Override
	public int update(TiggerNaming model,TiggerNamingExample example){

		return this.tiggerNamingMapper.updateByExample(model,example);
	}

	@Override
	public int updateByPK(TiggerNaming model){

		return this.updateByPK(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.tiggerNamingMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TiggerNamingExample example){

		return this.tiggerNamingMapper.deleteByExample(example);
	}

	@Override
	public int add(TiggerNaming model){

		return this.tiggerNamingMapper.insert(model);
	}

	@Resource
	public void setTiggerNamingMapper(TiggerNamingMapper tiggerNamingMapper){
	
		this.tiggerNamingMapper = tiggerNamingMapper;
	}
}
