package com.penzias.service;

import com.penzias.entity.BloodFatHistory;
import com.penzias.entity.BrainBloodHistory;
import com.penzias.entity.DiabetesHistory;
import com.penzias.entity.HeartDiseaseHistory;
import com.penzias.entity.HistoryPharmacy;
import com.penzias.entity.HypertensionHistory;
import com.penzias.entity.KidneyDiseaseHostory;
import com.penzias.entity.PulmonaryDiseaseHistory;
import com.penzias.vo.OtherHistoryVO;

public interface HistoryControlService {

	public void add(BrainBloodHistory brainBloodHistory, 
			HeartDiseaseHistory heartDiseaseHistory,
			HypertensionHistory hypertensionHistory,
			BloodFatHistory bloodFatHistory,
			DiabetesHistory diabetesHistory,
			KidneyDiseaseHostory kidneyDiseaseHostory,
			PulmonaryDiseaseHistory pulmonaryDiseaseHistory,
			HistoryPharmacy[] historyPharmacys,
			OtherHistoryVO otherVO);
}
