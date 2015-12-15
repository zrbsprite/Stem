package com.penzias.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.penzias.dao.BloodFatHistoryMapper;
import com.penzias.dao.BrainBloodHistoryMapper;
import com.penzias.dao.DiabetesHistoryMapper;
import com.penzias.dao.HeartDiseaseHistoryMapper;
import com.penzias.dao.HypertensionHistoryMapper;
import com.penzias.dao.KidneyDiseaseHostoryMapper;
import com.penzias.dao.OtherHistoryMapper;
import com.penzias.dao.PulmonaryDiseaseHistoryMapper;
import com.penzias.entity.BloodFatHistory;
import com.penzias.entity.BrainBloodHistory;
import com.penzias.entity.DiabetesHistory;
import com.penzias.entity.HeartDiseaseHistory;
import com.penzias.entity.HypertensionHistory;
import com.penzias.entity.KidneyDiseaseHostory;
import com.penzias.entity.OtherHistory;
import com.penzias.entity.PulmonaryDiseaseHistory;
import com.penzias.service.HistoryControlService;
import com.penzias.vo.OtherHistoryVO;


@Service("historyControlService")
public class HistoryControlServiceImpl implements HistoryControlService {

	@Resource
	private BrainBloodHistoryMapper brainBloodHistoryMapper;
	
	@Resource
	private HeartDiseaseHistoryMapper heartDiseaseHistoryMapper;
	
	@Resource
	private HypertensionHistoryMapper hypertensionHistoryMapper;
	
	@Resource
	private BloodFatHistoryMapper bloodFatHistoryMapper;
	
	@Resource
	private DiabetesHistoryMapper diabetesHistoryMapper;
	
	@Resource
	private KidneyDiseaseHostoryMapper kidneyDiseaseHostoryMapper;
	
	@Resource
	private PulmonaryDiseaseHistoryMapper pulmonaryDiseaseHistoryMapper;
	
	@Resource
	private OtherHistoryMapper otherHistoryMapper;
	
	@Override
	public void add(BrainBloodHistory brainBloodHistory,HeartDiseaseHistory heartDiseaseHistory,
			HypertensionHistory hypertensionHistory,BloodFatHistory bloodFatHistory,
			DiabetesHistory diabetesHistory,KidneyDiseaseHostory kidneyDiseaseHostory,
			PulmonaryDiseaseHistory pulmonaryDiseaseHistory,OtherHistoryVO otherVO){

		this.brainBloodHistoryMapper.insert(brainBloodHistory);
		this.heartDiseaseHistoryMapper.insert(heartDiseaseHistory);
		this.hypertensionHistoryMapper.insert(hypertensionHistory);
		this.bloodFatHistoryMapper.insert(bloodFatHistory);
		this.diabetesHistoryMapper.insert(diabetesHistory);
		this.kidneyDiseaseHostoryMapper.insert(kidneyDiseaseHostory);
		this.pulmonaryDiseaseHistoryMapper.insert(pulmonaryDiseaseHistory);
		for(OtherHistory other : otherVO.getOthers()){
			this.otherHistoryMapper.insert(other);
		}
		
	}

}
