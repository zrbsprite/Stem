package com.penzias.vo;

import com.penzias.entity.InstitutionCrowdFamilyInfo;

/**
 * 描述：封装家族史对象数组<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月14日 - 下午8:46:52<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class InstitutionCrowdFamilyInfoVO {

	private InstitutionCrowdFamilyInfo[] arrays;

	public InstitutionCrowdFamilyInfo[] getArrays(){

		return arrays;
	}

	public void setArrays(InstitutionCrowdFamilyInfo[] arrays){

		this.arrays = arrays;
	}

}
