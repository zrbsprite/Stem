package com.penzias.dao;

import com.penzias.core.interfaces.BasicMapper;
import com.penzias.entity.OtherHistory;
import com.penzias.entity.OtherHistoryExample;

public interface OtherHistoryMapper extends BasicMapper<OtherHistoryExample, OtherHistory>{
	
	public Integer batchInsert(OtherHistory[] otherHistorys);
}