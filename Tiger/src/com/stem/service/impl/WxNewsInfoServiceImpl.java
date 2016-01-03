package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.WxNewsInfoMapper;
import com.stem.entity.WxNewsInfo;
import com.stem.entity.WxNewsInfoExample;
import com.stem.service.WxNewsInfoService;

@Service("wxNewsInfoService")
public class WxNewsInfoServiceImpl implements WxNewsInfoService {

	@Resource
	private WxNewsInfoMapper wxNewsInfoMapper;
	
	@Override
	public List<WxNewsInfo> list(WxNewsInfoExample example){
		return this.wxNewsInfoMapper.selectByExample(example);
	}

	@Override
	public WxNewsInfo getByPK(Integer id){
		return this.wxNewsInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(WxNewsInfoExample example){
		return this.wxNewsInfoMapper.countByExample(example);
	}

	@Override
	public int update(WxNewsInfo model,WxNewsInfoExample example){
		return this.wxNewsInfoMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(WxNewsInfo model){

		return this.wxNewsInfoMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){
		return this.wxNewsInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(WxNewsInfoExample example){
		return this.wxNewsInfoMapper.deleteByExample(example);
	}

	@Override
	public int add(WxNewsInfo model){
		return this.wxNewsInfoMapper.insert(model);
	}

}
