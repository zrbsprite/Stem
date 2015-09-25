package com.stem.wechat.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 输出音乐消息
 */
@XmlRootElement(name = "xml")
public class MusicOutMessage extends OutMessage {

	public MusicOutMessage(){

	}

	private String MsgType = "music";
	private String MusicUrl;
	private String HQMusicUrl;

	public String getMsgType(){

		return MsgType;
	}

	public String getMusicUrl(){

		return MusicUrl;
	}

	public void setMusicUrl(String musicUrl){

		MusicUrl = musicUrl;
	}

	public String getHQMusicUrl(){

		return HQMusicUrl;
	}

	public void setHQMusicUrl(String hQMusicUrl){

		HQMusicUrl = hQMusicUrl;
	}

	public void setMsgType(String msgType){

		MsgType = msgType;
	}
}
