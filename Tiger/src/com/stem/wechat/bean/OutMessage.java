package com.stem.wechat.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="xml")
public class OutMessage implements Serializable{

	private String ToUserName;
	private String FromUserName;
	private Long CreateTime;

	public OutMessage(){
		
	}
	
	public String getToUserName(){

		return ToUserName;
	}

	public void setToUserName(String toUserName){

		ToUserName = toUserName;
	}

	public String getFromUserName(){

		return FromUserName;
	}

	public void setFromUserName(String fromUserName){

		FromUserName = fromUserName;
	}

	public Long getCreateTime(){

		return CreateTime;
	}

	public void setCreateTime(Long createTime){

		CreateTime = createTime;
	}
}