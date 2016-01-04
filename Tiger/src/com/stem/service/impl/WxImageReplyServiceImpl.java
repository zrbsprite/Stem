package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.WxImageReplyMapper;
import com.stem.entity.WxImageReply;
import com.stem.entity.WxImageReplyExample;
import com.stem.service.WxImageReplyService;

@Service("wxImageReplyService")
public class WxImageReplyServiceImpl implements WxImageReplyService{

	@Resource
	private WxImageReplyMapper wxImageReplyMapper;
	
	@Override
	public List<WxImageReply> list(WxImageReplyExample example){

		return this.wxImageReplyMapper.selectByExample(example);
	}

	@Override
	public WxImageReply getByPK(Integer id){

		return this.wxImageReplyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(WxImageReplyExample example){

		return this.wxImageReplyMapper.countByExample(example);
	}

	@Override
	public int update(WxImageReply model,WxImageReplyExample example){

		return this.wxImageReplyMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(WxImageReply model){

		return this.wxImageReplyMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){
		return this.wxImageReplyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(WxImageReplyExample example){

		return this.wxImageReplyMapper.deleteByExample(example);
	}

	@Override
	public int add(WxImageReply model){

		return this.wxImageReplyMapper.insert(model);
	}

}
