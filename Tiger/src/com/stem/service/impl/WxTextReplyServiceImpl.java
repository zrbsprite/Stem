package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.WxTextReplyMapper;
import com.stem.entity.WxTextReply;
import com.stem.entity.WxTextReplyExample;
import com.stem.service.WxTextReplyService;

@Service("wxTextReplyService")
public class WxTextReplyServiceImpl implements WxTextReplyService{

	@Resource
	private WxTextReplyMapper wxTextReplyMapper;
	
	@Override
	public List<WxTextReply> list(WxTextReplyExample example){

		return this.wxTextReplyMapper.selectByExample(example);
	}

	@Override
	public WxTextReply getByPK(Integer id){

		return this.wxTextReplyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(WxTextReplyExample example){

		return this.wxTextReplyMapper.countByExample(example);
	}

	@Override
	public int update(WxTextReply model,WxTextReplyExample example){

		return this.wxTextReplyMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(WxTextReply model){

		return this.wxTextReplyMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){
		return this.wxTextReplyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(WxTextReplyExample example){

		return this.wxTextReplyMapper.deleteByExample(example);
	}

	@Override
	public int add(WxTextReply model){

		return this.wxTextReplyMapper.insert(model);
	}

}
