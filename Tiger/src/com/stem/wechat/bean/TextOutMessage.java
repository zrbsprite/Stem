package com.stem.wechat.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 输出文字消息
 */
@XmlRootElement(name = "xml")
public class TextOutMessage extends OutMessage {

	private String MsgType = "text";
	// 文本消息
	private String Content;

	public TextOutMessage(){

	}

	public TextOutMessage(String content){
		Content = content;
	}

	public String getMsgType(){

		return MsgType;
	}

	public void setMsgType(String msgType){

		MsgType = msgType;
	}
	
	public String getContent(){

		return Content;
	}

	public void setContent(String content){

		Content = content;
	}
}
