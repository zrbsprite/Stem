package com.penzias.entity;

/**
 * 
 * 描述：角色表<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午5:34:22<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class SmRole {
	
	//角色id
    private Integer roleid;

    //角色名称
    private String rolename;

    //角色描述
    private String roledesc;

    //角色权限（数据来自于sm_codeitem的code字段，codeid值为ZB）
    private String powerlevel;

    //SQL
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