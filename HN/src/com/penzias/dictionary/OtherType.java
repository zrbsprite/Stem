package com.penzias.dictionary;

/**
 * 
 * 描述：其他类型-yb<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月15日 - 上午11:09:26<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public enum OtherType {

	yb_xiazhidongmai("01"),
	yb_yandixuguan("02"),
	yb_kouqiang("03"),
	yb_jingshenxinli("04");
	
	private String value;
	
	private OtherType(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
