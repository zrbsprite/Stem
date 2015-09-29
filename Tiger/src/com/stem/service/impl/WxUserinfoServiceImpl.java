package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.WxUserinfoMapper;
import com.stem.entity.WxUserinfo;
import com.stem.entity.WxUserinfoExample;
import com.stem.service.WxUserinfoService;

@Service("wxUserService")
public class WxUserinfoServiceImpl implements WxUserinfoService {

	@Resource
	private WxUserinfoMapper wxUserinfoMapper;

	@Override
	public List<WxUserinfo> list(WxUserinfoExample example){

		return this.wxUserinfoMapper.selectByExample(example);
	}

	@Override
	public WxUserinfo getByPK(Integer id){

		return this.wxUserinfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int getTotal(WxUserinfoExample example){

		return this.wxUserinfoMapper.countByExample(example);
	}

	@Override
	public int update(WxUserinfo model,WxUserinfoExample example){

		return this.wxUserinfoMapper.updateByExampleSelective(model,example);
	}

	@Override
	public int updateByPK(WxUserinfo model){

		return this.wxUserinfoMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public int deleteByPK(Integer id){

		return this.wxUserinfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(WxUserinfoExample example){

		return this.wxUserinfoMapper.deleteByExample(example);
	}

	@Override
	public int add(WxUserinfo model){

		return this.wxUserinfoMapper.insertSelective(model);
	}

	@Override
	public void doBatchAdd(List<WxUserinfo> wxUserinfoList){
		this.wxUserinfoMapper.batchInsertTemp(wxUserinfoList);
	}

	@Override
	public void doClearTable(){
		this.wxUserinfoMapper.truncateTable();
	}

	@Override
	public void doSynTables(){
		//清空用户信息表
		this.wxUserinfoMapper.truncateTable();
		//将临时表的数据导入用户信息表
		this.wxUserinfoMapper.synTables();
	}

	@Override
	public void doTruncateTempTable(){
		this.wxUserinfoMapper.truncateTempTable();
	}

}
