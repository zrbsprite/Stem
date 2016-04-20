package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TigerUriInfoMapper;
import com.stem.entity.TigerUriInfo;
import com.stem.entity.TigerUriInfoExample;
import com.stem.service.TigerUriInfoService;

@Service("tigerUriInfoService")
public class TigerUriInfoServiceImpl implements TigerUriInfoService {

	private TigerUriInfoMapper tigerUriInfoMapper;
	
	@Override
	public List<TigerUriInfo> list(TigerUriInfoExample example){

		return this.tigerUriInfoMapper.selectByExample(example);
	}

	@Override
	public TigerUriInfo getByPK(Integer id){

		return this.tigerUriInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TigerUriInfoExample example){

		return this.tigerUriInfoMapper.countByExample(example);
	}

	@Override
	public int update(TigerUriInfo model,TigerUriInfoExample example){

		return this.tigerUriInfoMapper.updateByExample(model,example);
	}

	@Override
	public int updateByPK(TigerUriInfo model){

		return this.updateByPK(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.tigerUriInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TigerUriInfoExample example){

		return this.tigerUriInfoMapper.deleteByExample(example);
	}

	@Override
	public int add(TigerUriInfo model){

		return this.tigerUriInfoMapper.insert(model);
	}

	@Resource
	public void setTigerUriInfoMapper(TigerUriInfoMapper TigerUriInfoMapper){
	
		this.tigerUriInfoMapper = TigerUriInfoMapper;
	}
}
