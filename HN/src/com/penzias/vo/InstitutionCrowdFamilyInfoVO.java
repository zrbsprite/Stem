package com.penzias.vo;

import org.springframework.util.StringUtils;

import com.penzias.entity.InstitutionCrowdFamilyInfo;

/**
 * 描述：封装家族史对象数组<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月14日 - 下午8:46:52<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class InstitutionCrowdFamilyInfoVO {

	private Integer crowdid;

	private InstitutionCrowdFamilyInfo[] arrays;

	public InstitutionCrowdFamilyInfo[] getArrays(){

		for(InstitutionCrowdFamilyInfo info:arrays){
			info.setCrowdid(crowdid);
			if(null!=info.getBrothersisterNo() && !StringUtils.isEmpty(info.getBrothersister())){
				info.setBrothersister(info.getBrothersisterNo().toString());
			}
			if(null!=info.getChildrenNo() && !StringUtils.isEmpty(info.getChildren())){
				info.setChildren(info.getChildrenNo().toString());
			}
		}
		return arrays;
	}

	public void setArrays(InstitutionCrowdFamilyInfo[] arrays){

		this.arrays = arrays;
	}

	public Integer getCrowdid(){

		return crowdid;
	}

	public void setCrowdid(Integer crowdid){

		this.crowdid = crowdid;
	}

}
