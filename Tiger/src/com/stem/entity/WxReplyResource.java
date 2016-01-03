package com.stem.entity;

public class WxReplyResource {

	private Integer id;

	private String newsKeyword;

	private String mediaId;

	private String newsTitle;

	private String newsDes;

	private String picUrl;

	private String newsUrl;

	public Integer getId(){

		return id;
	}

	public void setId(Integer id){

		this.id = id;
	}

	public String getMediaId(){

		return mediaId;
	}

	public void setMediaId(String mediaId){

		this.mediaId = mediaId;
	}

	public String getNewsTitle(){

		return newsTitle;
	}

	public void setNewsTitle(String newsTitle){

		this.newsTitle = newsTitle;
	}

	public String getNewsDes(){

		return newsDes;
	}

	public void setNewsDes(String newsDes){

		this.newsDes = newsDes;
	}

	public String getPicUrl(){

		return picUrl;
	}

	public void setPicUrl(String picUrl){

		this.picUrl = picUrl;
	}

	public String getNewsUrl(){

		return newsUrl;
	}

	public void setNewsUrl(String newsUrl){

		this.newsUrl = newsUrl;
	}

	public String getNewsKeyword(){

		return newsKeyword;
	}

	public void setNewsKeyword(String newsKeyword){

		this.newsKeyword = newsKeyword;
	}
}