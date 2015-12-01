package com.penzias.entity;

public class SmRole {
    private Integer roleid;

    private String rolename;

    private String roledesc;

    private String powerlevel;

    private String powersql;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public String getPowerlevel() {
        return powerlevel;
    }

    public void setPowerlevel(String powerlevel) {
        this.powerlevel = powerlevel;
    }

    public String getPowersql() {
        return powersql;
    }

    public void setPowersql(String powersql) {
        this.powersql = powersql;
    }
}