package com.penzias.entity;

/**
 * 描述：角色功能权限<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午5:35:18<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class SmRoleModular {
	
	//角色功能模块ID
    private Integer rolemodularid;

    //角色ID
    private Integer roleid;

    //功能模块ID
    private Integer modularid;

    public Integer getRolemodularid() {
        return rolemodularid;
    }

    public void setRolemodularid(Integer rolemodularid) {
        this.rolemodularid = rolemodularid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getModularid() {
        return modularid;
    }

    public void setModularid(Integer modularid) {
        this.modularid = modularid;
    }
}