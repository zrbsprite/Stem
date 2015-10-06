package com.stem.service;

import java.util.List;

import com.stem.core.interfaces.BasicService;
import com.stem.entity.WxImageResource;
import com.stem.entity.WxImageResourceExample;

public interface WxImageResourceService extends
		BasicService<WxImageResourceExample, WxImageResource> {

	void doBatchAdd(List<WxImageResource> wir);
	
	void doClearTempTable();
	
	void doClearTable();
	
	void doSynTable();
}
