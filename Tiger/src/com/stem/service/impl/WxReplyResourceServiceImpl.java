package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.WxReplyResourceMapper;
import com.stem.entity.WxReplyResource;
import com.stem.entity.WxReplyResourceExample;
import com.stem.service.WxReplyResourceService;

@Service("wxReplyResourceService")
public class WxReplyResourceServiceImpl implements WxReplyResourceService {

	@Resource
	private WxReplyResourceMapper wxReplyResourceMapper;
	
	@Override
	public List<WxReplyResource> list(WxReplyResourceExample example){

		return this.wxReplyResourceMapper.selectByExample(example);
	}

	@Override
	public WxReplyResource getByPK(Integer id){

		return this.wxReplyResourceMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(WxReplyResourceExample example){
		return this.wxReplyResourceMapper.countByExample(example);
	}

	@Override
	public int update(WxReplyResource model,WxReplyResourceExample example){
		return this.wxReplyResourceMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(WxReplyResource model){
		return this.wxReplyResourceMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){
		return this.wxReplyResourceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(WxReplyResourceExample example){
		return this.wxReplyResourceMapper.deleteByExample(example);
	}

	@Override
	public int add(WxReplyResource model){
		return this.wxReplyResourceMapper.insert(model);
	}
}
