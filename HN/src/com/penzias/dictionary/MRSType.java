package com.penzias.dictionary;

/**
 * 描述：MRS选项（ZZ）<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月15日 - 下午2:31:02<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public enum MRSType {

	zz_01(0, "01"),
	zz_02(1, "02"),
	zz_03(2, "03"),
	zz_04(3, "04"),
	zz_05(4, "05"),
	zz_06(5, "06");
	
	private int score;
	
	private String key;
	
	private MRSType(int score, String key){
		this.key = key;
		this.score = score;
	}
	
	public int getScore(){
		return this.score;
	}
	
	public String getValue(){
		return this.key;
	}
	
	public static int getScore(String key){
		Integer val = new Integer(key);
		return val.intValue() - 1;
	}
}
