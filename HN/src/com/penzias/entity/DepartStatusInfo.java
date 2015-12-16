package com.penzias.entity;

import java.util.Date;

/**
 * 
 * 描述：机构状态信息表<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午5:26:37<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class DepartStatusInfo {
    private Integer infoid;

    //机构编码
    private String depbm;

    //数据来自于sm_codeitem的code字段，codeid值为ZA
    private String status;

    //生成时间
    private Date createdate;

    //机构信息
    private String description;

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public String getDepbm() {
        return depbm;
    }

    public void setDepbm(String depbm) {
        this.depbm = depbm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}