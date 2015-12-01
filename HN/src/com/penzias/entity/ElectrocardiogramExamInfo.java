package com.penzias.entity;

import java.util.Date;

public class ElectrocardiogramExamInfo {
    private Integer electrocardiogramexanid;

    private Integer crowdid;

    private Date examtime;

    private String examman;

    private String examresult;

    private String exceptiontype;

    private String flag;

    public Integer getElectrocardiogramexanid() {
        return electrocardiogramexanid;
    }

    public void setElectrocardiogramexanid(Integer electrocardiogramexanid) {
        this.electrocardiogramexanid = electrocardiogramexanid;
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

    public String getExamman() {
        return examman;
    }

    public void setExamman(String examman) {
        this.examman = examman;
    }

    public String getExamresult() {
        return examresult;
    }

    public void setExamresult(String examresult) {
        this.examresult = examresult;
    }

    public String getExceptiontype() {
        return exceptiontype;
    }

    public void setExceptiontype(String exceptiontype) {
        this.exceptiontype = exceptiontype;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}