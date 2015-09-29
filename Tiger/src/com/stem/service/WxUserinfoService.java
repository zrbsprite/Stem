package com.stem.service;

import java.util.List;

import com.stem.core.interfaces.BasicService;
import com.stem.entity.WxUserinfo;
import com.stem.entity.WxUserinfoExample;


public interface WxUserinfoService extends BasicService<WxUserinfoExample, WxUserinfo> {

	void doBatchAdd(List<WxUserinfo> wxUserinfoList);
	
	void doClearTable();

	void doSynTables();

	void doTruncateTempTable();
}
