package com.penzias.entity;

public class SmModular {
    private Integer modularid;

    private Integer parentmodularid;

    private String modularname;

    private String uri;

    private String modulardesc;

    private Integer displayorder;

    private String crud;

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