package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.WxImageResourceMapper;
import com.stem.entity.WxImageResource;
import com.stem.entity.WxImageResourceExample;
import com.stem.service.WxImageResourceService;

@Service("wxImageResourceService")
public class WxImageResourceServiceImpl implements WxImageResourceService {

	@Resource
	private WxImageResourceMapper wxImageResourceMapper;

	@Override
	public List<WxImageResource> list(WxImageResourceExample example){

		return this.wxImageResourceMapper.selectByExample(example);
	}

	@Override
	public WxImageResource getByPK(Integer id){

		return this.wxImageResourceMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(WxImageResourceExample example){
		return this.wxImageResourceMapper.countByExample(example);
	}

	@Override
	public int update(WxImageResource model,WxImageResourceExample example){
		return this.wxImageResourceMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(WxImageResource model){
		return this.wxImageResourceMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){
		return this.wxImageResourceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(WxImageResourceExample example){
		return this.wxImageResourceMapper.deleteByExample(example);
	}

	@Override
	public int add(WxImageResource model){
		return this.wxImageResourceMapper.insert(model);
	}

	@Override
	public void doBatchAdd(List<WxImageResource> wir){
		this.wxImageResourceMapper.batchInsertTemp(wir);
	}

	@Override
	public void clearTempTable(){
		this.wxImageResourceMapper.clearTempTable();
	}

	@Override
	public void clearTable(){
		this.wxImageResourceMapper.clearTable();
	}

	@Override
	public void synTable(){
		this.wxImageResourceMapper.synTable();
	}

}
