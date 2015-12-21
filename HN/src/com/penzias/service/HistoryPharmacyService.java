package com.penzias.service;

import com.penzias.core.interfaces.BasicService;
import com.penzias.entity.HistoryPharmacy;
import com.penzias.entity.HistoryPharmacyExample;

public interface HistoryPharmacyService extends BasicService<HistoryPharmacyExample, HistoryPharmacy> {

	public Integer addBatch(HistoryPharmacy[] historyPharmacys);
}