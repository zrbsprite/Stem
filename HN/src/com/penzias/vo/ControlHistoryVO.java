package com.penzias.vo;

import com.penzias.entity.BloodFatHistory;
import com.penzias.entity.BrainBloodHistory;
import com.penzias.entity.DiabetesHistory;
import com.penzias.entity.HeartDiseaseHistory;
import com.penzias.entity.HypertensionHistory;
import com.penzias.entity.KidneyDiseaseHostory;
import com.penzias.entity.PulmonaryDiseaseHistory;

/**
 * 
 * 描述：既往病史的 value object<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月21日 - 上午11:22:34<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class ControlHistoryVO {

	private Integer crowdid;

	private BrainBloodHistory brainBloodHistory;
	private HeartDiseaseHistory heartDiseaseHistory;
	private HypertensionHistory hypertensionHistory;
	private BloodFatHistory bloodFatHistory;
	private DiabetesHistory diabetesHistory;
	private KidneyDiseaseHostory kidneyDiseaseHostory;
	private PulmonaryDiseaseHistory pulmonaryDiseaseHistory;

	public BrainBloodHistory getBrainBloodHistory(){

		this.brainBloodHistory.setCrowdid(getCrowdid());
		return brainBloodHistory;
	}

	public void setBrainBloodHistory(BrainBloodHistory brainBloodHistory){

		this.brainBloodHistory = brainBloodHistory;
	}

	public HeartDiseaseHistory getHeartDiseaseHistory(){

		this.heartDiseaseHistory.setCrowdid(crowdid);
		return heartDiseaseHistory;
	}

	public void setHeartDiseaseHistory(HeartDiseaseHistory heartDiseaseHistory){

		this.heartDiseaseHistory = heartDiseaseHistory;
	}

	public HypertensionHistory getHypertensionHistory(){

		this.hypertensionHistory.setCrowdid(crowdid);
		return hypertensionHistory;
	}

	public void setHypertensionHistory(HypertensionHistory hypertensionHistory){

		this.hypertensionHistory = hypertensionHistory;
	}

	public BloodFatHistory getBloodFatHistory(){

		this.bloodFatHistory.setCrowdid(crowdid);
		return bloodFatHistory;
	}

	public void setBloodFatHistory(BloodFatHistory bloodFatHistory){

		this.bloodFatHistory = bloodFatHistory;
	}

	public DiabetesHistory getDiabetesHistory(){

		this.diabetesHistory.setCrowdid(crowdid);
		return diabetesHistory;
	}

	public void setDiabetesHistory(DiabetesHistory diabetesHistory){

		this.diabetesHistory = diabetesHistory;
	}

	public KidneyDiseaseHostory getKidneyDiseaseHostory(){

		this.kidneyDiseaseHostory.setCrowdid(crowdid);
		return kidneyDiseaseHostory;
	}

	public void setKidneyDiseaseHostory(KidneyDiseaseHostory kidneyDiseaseHostory){

		this.kidneyDiseaseHostory = kidneyDiseaseHostory;
	}

	public PulmonaryDiseaseHistory getPulmonaryDiseaseHistory(){
		this.pulmonaryDiseaseHistory.setCrowdid(crowdid);
		return pulmonaryDiseaseHistory;
	}

	public void setPulmonaryDiseaseHistory(PulmonaryDiseaseHistory pulmonaryDiseaseHistory){

		this.pulmonaryDiseaseHistory = pulmonaryDiseaseHistory;
	}

	public Integer getCrowdid(){

		return crowdid;
	}

	public void setCrowdid(Integer crowdid){

		this.crowdid = crowdid;
	}

}
