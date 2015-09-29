package com.stem.entity;

import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.util.StringUtils;

public class WxUserinfo {

	private Integer id;

	private String subscribe;

	private String openid;

	private String nickname;

	private String sex;

	private String city;

	private String country;

	private String province;

	private String language;

	private String headimgurl;

	private String subscribeTime;

	private String remark;

	private String groupid;

	private String subscribeTimeLable;

	public Integer getId(){

		return id;
	}

	public void setId(Integer id){

		this.id = id;
	}

	public String getSubscribe(){

		return subscribe;
	}

	public void setSubscribe(String subscribe){

		this.subscribe = subscribe;
	}

	public String getOpenid(){

		return openid;
	}

	public void setOpenid(String openid){

		this.openid = openid;
	}

	public String getNickname(){

		return nickname;
	}

	public void setNickname(String nickname){

		this.nickname = nickname;
	}

	public String getSex(){

		return sex;
	}

	public void setSex(String sex){

		this.sex = sex;
	}

	public String getCity(){

		return city;
	}

	public void setCity(String city){

		this.city = city;
	}

	public String getCountry(){

		return country;
	}

	public void setCountry(String country){

		this.country = country;
	}

	public String getProvince(){

		return province;
	}

	public void setProvince(String province){

		this.province = province;
	}

	public String getLanguage(){

		return language;
	}

	public void setLanguage(String language){

		this.language = language;
	}

	public String getHeadimgurl(){

		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl){

		this.headimgurl = headimgurl;
	}

	public String getSubscribeTime(){

		return subscribeTime;
	}

	public void setSubscribeTime(String subscribeTime){
		this.subscribeTime = subscribeTime;
		if(!StringUtils.isEmpty(subscribeTime)){
			long sb = Long.parseLong(subscribeTime)*1000;
			this.subscribeTimeLable = DateFormatUtils.format(sb,"yyyy-MM-dd");
		}
	}

	public String getRemark(){

		return remark;
	}

	public void setRemark(String remark){

		this.remark = remark;
	}

	public String getGroupid(){

		return groupid;
	}

	public void setGroupid(String groupid){

		this.groupid = groupid;
	}

	public String getSubscribeTimeLable(){

		return subscribeTimeLable;
	}

	public void setSubscribeTimeLable(String subscribeTimeLable){

		this.subscribeTimeLable = subscribeTimeLable;
	}
}