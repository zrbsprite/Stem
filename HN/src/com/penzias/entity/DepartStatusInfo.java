package com.penzias.entity;

import java.util.Date;

public class DepartStatusInfo {
    private Integer infoid;

    private String depbm;

    private String status;

    private Date createdate;

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