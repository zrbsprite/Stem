package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.TigerPayMapper;
import com.stem.entity.TigerPay;
import com.stem.entity.TigerPayExample;
import com.stem.service.TigerPayService;

@Service("tigerPayService")
public class TigerPayServiceImpl implements TigerPayService {

	@Resource
	private TigerPayMapper tigerPayMapper;
	
	@Override
	public List<TigerPay> list(TigerPayExample example){

		return this.tigerPayMapper.selectByExample(example);
	}

	@Override
	public TigerPay getByPK(Integer id){

		return this.tigerPayMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(TigerPayExample example){

		return this.tigerPayMapper.countByExample(example);
	}

	@Override
	public int update(TigerPay model,TigerPayExample example){

		return this.tigerPayMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(TigerPay model){

		return this.tigerPayMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.tigerPayMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(TigerPayExample example){

		return this.tigerPayMapper.deleteByExample(example);
	}

	@Override
	public int add(TigerPay model){

		return this.tigerPayMapper.insert(model);
	}

}
