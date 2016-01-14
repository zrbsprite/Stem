package com.penzias.entity;

import java.util.Date;

/**
 * 描述：系统机构表<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午5:30:17<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class SmDepartment {
	//机构编码
    private String depbm;

    //机构名称
    private String depname;

    //描述
    private String description;

    //机构类型（数据来源于codeitem，类型为ZC）
    private String institutiontype;

    //值为0是机构，值为1为科室
    private String depflag;

    //值为UN为机构
    private String pptr;

    //是否有子节点
    private String cptr;

    //状态（1是启用，0是暂停）
    private String status;

    //机构Logo(只有机构才有Logo，登录人员根据机构动态显示Logo图片，没有则显示默认)
    private String logo;

    //联系人
    private String linkman;

    //联系人电话
    private String linkmantel;

    //机构电话
    private String institutiontel;

    //地址
    private String address;

    //创建时间
    private Date createdate;

    //创建人（数据来自于用户表用户名）
    private String username;

    //所属区域，来自于sm_codeitem的Codeid为AB的code值
    private String area;

    //显示顺序
    private Integer zorder;

    public String getDepbm() {
        return depbm;
    }

    public void setDepbm(String depbm) {
        this.depbm = depbm;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstitutiontype() {
        return institutiontype;
    }

    public void setInstitutiontype(String institutiontype) {
        this.institutiontype = institutiontype;
    }

    public String getDepflag() {
        return depflag;
    }

    public void setDepflag(String depflag) {
        this.depflag = depflag;
    }

    public String getPptr() {
        return pptr;
    }

    public void setPptr(String pptr) {
        this.pptr = pptr;
    }

    public String getCptr() {
        return cptr;
    }

    public void setCptr(String cptr) {
        this.cptr = cptr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkmantel() {
        return linkmantel;
    }

    public void setLinkmantel(String linkmantel) {
        this.linkmantel = linkmantel;
    }

    public String getInstitutiontel() {
        return institutiontel;
    }

    public void setInstitutiontel(String institutiontel) {
        this.institutiontel = institutiontel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getZorder() {
        return zorder;
    }

    public void setZorder(Integer zorder) {
        this.zorder = zorder;
    }
}