package com.penzias.vo;

import com.penzias.entity.BloodFatExamInfo;
import com.penzias.entity.BloodGlucoseExamInfo;
import com.penzias.entity.HomocysteineExamInfo;

/**
 * 描述：实验室检查vo<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午2:56:35<br/>
 *
 */
public class InnerCheckVO {

	private BloodGlucoseExamInfo[] bloodGlucoseExamInfos;

	private BloodFatExamInfo bloodFatExamInfo;

	private HomocysteineExamInfo homocysteineExamInfo;

	public BloodGlucoseExamInfo[] getBloodGlucoseExamInfos(){

		return bloodGlucoseExamInfos;
	}

	public void setBloodGlucoseExamInfos(BloodGlucoseExamInfo[] bloodGlucoseExamInfos){

		this.bloodGlucoseExamInfos = bloodGlucoseExamInfos;
	}

	public BloodFatExamInfo getBloodFatExamInfo(){

		return bloodFatExamInfo;
	}

	public void setBloodFatExamInfo(BloodFatExamInfo bloodFatExamInfo){

		this.bloodFatExamInfo = bloodFatExamInfo;
	}

	public HomocysteineExamInfo getHomocysteineExamInfo(){

		return homocysteineExamInfo;
	}

	public void setHomocysteineExamInfo(HomocysteineExamInfo homocysteineExamInfo){

		this.homocysteineExamInfo = homocysteineExamInfo;
	}

}
