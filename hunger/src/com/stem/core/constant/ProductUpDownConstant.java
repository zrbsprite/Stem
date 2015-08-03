package com.stem.core.constant;

/**
 * @author ruibo
 * 产品上下架
 */
public enum ProductUpDownConstant {

	UP(1),DOWN(0);
	
	private int type;
	
	private ProductUpDownConstant(int type){
		this.type = type;
	}
	
	public int intValue(){
		return this.type;
	}
}
