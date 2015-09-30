package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.WxMenuMapper;
import com.stem.entity.WxMenu;
import com.stem.entity.WxMenuExample;
import com.stem.service.WxMenuService;

@Service("wxMenuService")
public class WxMenuServiceImpl implements WxMenuService {

	@Resource
	private WxMenuMapper wxMenuMapper;
	
	@Override
	public List<WxMenu> list(WxMenuExample example){
		return this.wxMenuMapper.selectByExample(example);
	}

	@Override
	public WxMenu getByPK(Integer id){
		return this.wxMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(WxMenuExample example){
		return this.wxMenuMapper.countByExample(example);
	}

	@Override
	public int update(WxMenu model,WxMenuExample example){
		return this.wxMenuMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(WxMenu model){
		return this.wxMenuMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){
		return this.wxMenuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(WxMenuExample example){
		return this.wxMenuMapper.deleteByExample(example);
	}

	@Override
	public int add(WxMenu model){
		return this.wxMenuMapper.insert(model);
	}

}
