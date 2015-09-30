package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.WxNewsResourceMapper;
import com.stem.entity.WxNewsResource;
import com.stem.entity.WxNewsResourceExample;
import com.stem.service.WxNewsResourceService;

@Service("wxNewsResourceService")
public class WxNewsResourceServiceImpl implements WxNewsResourceService {

	@Resource
	private WxNewsResourceMapper wxNewsResourceMapper;
	
	@Override
	public List<WxNewsResource> list(WxNewsResourceExample example){

		return this.wxNewsResourceMapper.selectByExample(example);
	}

	@Override
	public WxNewsResource getByPK(Integer id){

		return this.wxNewsResourceMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(WxNewsResourceExample example){
		return this.wxNewsResourceMapper.countByExample(example);
	}

	@Override
	public int update(WxNewsResource model,WxNewsResourceExample example){
		return this.wxNewsResourceMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(WxNewsResource model){
		return this.wxNewsResourceMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){
		return this.wxNewsResourceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(WxNewsResourceExample example){
		return this.wxNewsResourceMapper.deleteByExample(example);
	}

	@Override
	public int add(WxNewsResource model){
		return this.wxNewsResourceMapper.insert(model);
	}
}
