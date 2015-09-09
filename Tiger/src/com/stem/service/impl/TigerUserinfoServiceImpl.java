package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TigerUserinfoMapper;
import com.stem.entity.TigerUserinfo;
import com.stem.entity.TigerUserinfoExample;
import com.stem.service.TigerUserinfoService;

@Service("tigerUserinfoService")
public class TigerUserinfoServiceImpl implements TigerUserinfoService {

	@Resource
	private TigerUserinfoMapper tigerUserinfoMapper;

	@Override
	public List<TigerUserinfo> list(TigerUserinfoExample example){
		return this.tigerUserinfoMapper.selectByExample(example);
	}

	@Override
	public TigerUserinfo getByPK(Integer id){

		return this.tigerUserinfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TigerUserinfoExample example){
		return this.tigerUserinfoMapper.countByExample(example);
	}

	@Override
	public int update(TigerUserinfo model,TigerUserinfoExample example){

		return this.tigerUserinfoMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(TigerUserinfo model){
		return this.tigerUserinfoMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.tigerUserinfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TigerUserinfoExample example){

		return this.tigerUserinfoMapper.deleteByExample(example);
	}

	@Override
	public int add(TigerUserinfo model){

		return this.tigerUserinfoMapper.insert(model);
	}
	
}
