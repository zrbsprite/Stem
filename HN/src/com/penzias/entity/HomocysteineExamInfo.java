package com.penzias.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HomocysteineExamInfo {
    private Integer homocysteineexamid;

    private Integer crowdid;

    private Date examtime;

    private BigDecimal homocysteine;

    private String flag;

    public Integer getHomocysteineexamid() {
        return homocysteineexamid;
    }

    public void setHomocysteineexamid(Integer homocysteineexamid) {
        this.homocysteineexamid = homocysteineexamid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public Date getExamtime() {
        return examtime;
    }

    public void setExamtime(Date examtime) {
        this.examtime = examtime;
    }

    public BigDecimal getHomocysteine() {
        return homocysteine;
    }

    public void setHomocysteine(BigDecimal homocysteine) {
        this.homocysteine = homocysteine;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}