package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TigerAccessTokenMapper;
import com.stem.entity.TigerAccessToken;
import com.stem.entity.TigerAccessTokenExample;
import com.stem.service.TigerAccessTokenService;

@Service("tigerAccessTokenService")
public class TigerAccessTokenServiceImpl implements TigerAccessTokenService {

	@Resource
	private TigerAccessTokenMapper tigerAccessTokenMapper;
	
	@Override
	public List<TigerAccessToken> list(TigerAccessTokenExample example){
		return this.tigerAccessTokenMapper.selectByExample(example);
	}

	@Override
	public TigerAccessToken getByPK(Integer id){
		return this.tigerAccessTokenMapper.selectByPrimaryKey(id+"");
	}

	@Override
	public int getTotal(TigerAccessTokenExample example){
		return this.tigerAccessTokenMapper.countByExample(example);
	}

	@Override
	public int update(TigerAccessToken model,TigerAccessTokenExample example){
		return this.tigerAccessTokenMapper.updateByExample(model,example);
	}

	@Override
	public int updateByPK(TigerAccessToken model){
		return this.tigerAccessTokenMapper.updateByPrimaryKey(model);
	}

	@Override
	public int deleteByPK(Integer id){
		return this.tigerAccessTokenMapper.deleteByPrimaryKey(id+"");
	}

	@Override
	public int delete(TigerAccessTokenExample example){
		return this.tigerAccessTokenMapper.deleteByExample(example);
	}

	@Override
	public int add(TigerAccessToken model){
		return this.tigerAccessTokenMapper.insertSelective(model);
	}

	@Override
	public TigerAccessToken getOne(String id){
		return this.tigerAccessTokenMapper.selectByPrimaryKey(id);
	}
	
}
