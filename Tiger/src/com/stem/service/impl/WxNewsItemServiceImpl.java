package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.WxNewsItemMapper;
import com.stem.entity.WxNewsItem;
import com.stem.entity.WxNewsItemExample;
import com.stem.service.WxNewsItemService;

@Service("wxNewsItemService")
public class WxNewsItemServiceImpl implements WxNewsItemService {

	@Resource
	private WxNewsItemMapper wxNewsItemMapper;
	
	@Override
	public List<WxNewsItem> list(WxNewsItemExample example){
		return this.wxNewsItemMapper.selectByExample(example);
	}

	@Override
	public WxNewsItem getByPK(Integer id){
		return this.wxNewsItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(WxNewsItemExample example){
		return this.wxNewsItemMapper.countByExample(example);
	}

	@Override
	public int update(WxNewsItem model,WxNewsItemExample example){
		return this.wxNewsItemMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(WxNewsItem model){

		return this.wxNewsItemMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){
		return this.wxNewsItemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(WxNewsItemExample example){
		return this.wxNewsItemMapper.deleteByExample(example);
	}

	@Override
	public int add(WxNewsItem model){
		return this.wxNewsItemMapper.insert(model);
	}

}
