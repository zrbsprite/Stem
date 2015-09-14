package com.stem.wechat.bean;

public class OutMessage {

	private String ToUserName;
	private String FromUserName;
	private Long CreateTime;

	public String getToUserName(){

		return ToUserName;
	}

	public String getFromUserName(){

		return FromUserName;
	}

	public Long getCreateTime(){

		return CreateTime;
	}

	public void setToUserName(String toUserName){

		ToUserName = toUserName;
	}

	public void setFromUserName(String fromUserName){

		FromUserName = fromUserName;
	}

	public void setCreateTime(Long createTime){

		CreateTime = createTime;
	}

}