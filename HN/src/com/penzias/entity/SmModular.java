package com.penzias.entity;

/**
 * 描述：功能模块儿<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午5:32:54<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class SmModular {
	
	//id程序模块编码
    private Integer modularid;

    //上级模块编码
    private Integer parentmodularid;

    //名称
    private String modularname;

    //功能模块地址
    private String uri;

    //描述
    private String modulardesc;

    //顺序
    private Integer displayorder;

    //增删改查
    private String crud;

    //0:一级功能；1：二级功能
    private String homemodular;

    public Integer getModularid() {
        return modularid;
    }

    public void setModularid(Integer modularid) {
        this.modularid = modularid;
    }

    public Integer getParentmodularid() {
        return parentmodularid;
    }

    public void setParentmodularid(Integer parentmodularid) {
        this.parentmodularid = parentmodularid;
    }

    public String getModularname() {
        return modularname;
    }

    public void setModularname(String modularname) {
        this.modularname = modularname;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getModulardesc() {
        return modulardesc;
    }

    public void setModulardesc(String modulardesc) {
        this.modulardesc = modulardesc;
    }

    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    public String getCrud() {
        return crud;
    }

    public void setCrud(String crud) {
        this.crud = crud;
    }

    public String getHomemodular() {
        return homemodular;
    }

    public void setHomemodular(String homemodular) {
        this.homemodular = homemodular;
    }
}