package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.core.BasicServiceImpl;
import com.penzias.core.interfaces.BasicMapper;
import com.penzias.dao.HistoryPharmacyMapper;
import com.penzias.entity.HistoryPharmacy;
import com.penzias.entity.HistoryPharmacyExample;
import com.penzias.service.HistoryPharmacyService;

@Service("historyPharmacyService")
public class HistoryPharmacyServiceImpl extends BasicServiceImpl<HistoryPharmacyExample, HistoryPharmacy> implements HistoryPharmacyService {

	@Resource
	private HistoryPharmacyMapper historyPharmacyMapper;
	
	@Override
	public BasicMapper<HistoryPharmacyExample, HistoryPharmacy> getMapper(){

		return historyPharmacyMapper;
	}

	@Override
	public Integer addBatch(HistoryPharmacy[] historyPharmacys){

		return this.historyPharmacyMapper.batchInsert(historyPharmacys);
	}

}
