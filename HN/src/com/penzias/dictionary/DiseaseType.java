package com.penzias.dictionary;

/**
 * 描述：病种类型-zr<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月15日 - 上午9:40:30<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public enum DiseaseType {

	zr_brain("01"),
	zr_heart("02"),
	zr_highblood("03"),
	zr_diabetes("04"),
	zr_dyslipidemia("05");
	
	private String value;
	
	private DiseaseType(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
}
