package com.stem.wechat.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 描述：回复image<br/>
 * 作者：stem zhang <br/>
 * 修改日期：2015年9月6日 - 下午2:38:00<br/>
 * E-mail: sireezhang@163.com<br/>
 */
@XmlRootElement(name = "xml")
public class ImageOutMessage extends OutMessage {

	public ImageOutMessage(){

	}

	public void setMsgType(String msgType){

		MsgType = msgType;
	}

	private String MsgType = "image";

	private Image Image;

	public String getMsgType(){

		return MsgType;
	}

	public Image getImage(){

		return Image;
	}

	public void setImage(Image image){

		Image = image;
	}
}
