package com.stem.entity;

public class MemberLevel {
    private Integer id;

    private String code;

    private String name;

    private Short invitationSum;

    private String buyDiscount;

    private String buyIntegral;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getInvitationSum() {
        return invitationSum;
    }

    public void setInvitationSum(Short invitationSum) {
        this.invitationSum = invitationSum;
    }

    public String getBuyDiscount() {
        return buyDiscount;
    }

    public void setBuyDiscount(String buyDiscount) {
        this.buyDiscount = buyDiscount;
    }

    public String getBuyIntegral() {
        return buyIntegral;
    }

    public void setBuyIntegral(String buyIntegral) {
        this.buyIntegral = buyIntegral;
    }
}