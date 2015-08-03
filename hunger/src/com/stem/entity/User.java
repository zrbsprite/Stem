package com.stem.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	
	private static final long serialVersionUID = -6675024037569659860L;

	private Integer id;

    private String userTypeCode;

    private String userName;

    private String password;

    private String mobile;

    private String nickName;

    private String inviteCode;

    private String lableCode;

    private String intoGuide;

    private String functionGuide;

    private String wxOpenId;

    private String wxNick;

    private String memberLevelCode;

    private String parentUserName;

    private Date createTime;

    private String deleteLable;

    private byte[] headPortrait;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserTypeCode() {
        return userTypeCode;
    }

    public void setUserTypeCode(String userTypeCode) {
        this.userTypeCode = userTypeCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getLableCode() {
        return lableCode;
    }

    public void setLableCode(String lableCode) {
        this.lableCode = lableCode;
    }

    public String getIntoGuide() {
        return intoGuide;
    }

    public void setIntoGuide(String intoGuide) {
        this.intoGuide = intoGuide;
    }

    public String getFunctionGuide() {
        return functionGuide;
    }

    public void setFunctionGuide(String functionGuide) {
        this.functionGuide = functionGuide;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getWxNick() {
        return wxNick;
    }

    public void setWxNick(String wxNick) {
        this.wxNick = wxNick;
    }

    public String getMemberLevelCode() {
        return memberLevelCode;
    }

    public void setMemberLevelCode(String memberLevelCode) {
        this.memberLevelCode = memberLevelCode;
    }

    public String getParentUserName() {
        return parentUserName;
    }

    public void setParentUserName(String parentUserName) {
        this.parentUserName = parentUserName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeleteLable() {
        return deleteLable;
    }

    public void setDeleteLable(String deleteLable) {
        this.deleteLable = deleteLable;
    }

    public byte[] getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(byte[] headPortrait) {
        this.headPortrait = headPortrait;
    }
}