package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TiggerUserOptMapper;
import com.stem.entity.TiggerUserOpt;
import com.stem.entity.TiggerUserOptExample;
import com.stem.service.TiggerUserOptService;

@Service("tiggerUserOptService")
public class TiggerUserOptServiceImpl implements TiggerUserOptService {

	private TiggerUserOptMapper TiggerUserOptMapper;
	
	@Override
	public List<TiggerUserOpt> list(TiggerUserOptExample example){

		return this.TiggerUserOptMapper.selectByExample(example);
	}

	@Override
	public TiggerUserOpt getByPK(Integer id){

		return this.TiggerUserOptMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TiggerUserOptExample example){

		return this.TiggerUserOptMapper.countByExample(example);
	}

	@Override
	public int update(TiggerUserOpt model,TiggerUserOptExample example){

		return this.TiggerUserOptMapper.updateByExample(model,example);
	}

	@Override
	public int updateByPK(TiggerUserOpt model){

		return this.updateByPK(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.TiggerUserOptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TiggerUserOptExample example){

		return this.TiggerUserOptMapper.deleteByExample(example);
	}

	@Override
	public int add(TiggerUserOpt model){

		return this.TiggerUserOptMapper.insert(model);
	}

	@Resource
	public void setTiggerUserOptMapper(TiggerUserOptMapper TiggerUserOptMapper){
	
		this.TiggerUserOptMapper = TiggerUserOptMapper;
	}
}
