package com.penzias.dao;

import com.penzias.core.interfaces.BasicMapper;
import com.penzias.entity.HistoryPharmacy;
import com.penzias.entity.HistoryPharmacyExample;

public interface HistoryPharmacyMapper extends BasicMapper<HistoryPharmacyExample, HistoryPharmacy>{
	
	public Integer batchInsert(HistoryPharmacy[] historyPharmacys);
}