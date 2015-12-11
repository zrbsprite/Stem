package com.penzias.entity;

import java.util.Date;

/**
 * 描述：心电图检查<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月11日 - 上午11:46:10<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class ElectrocardiogramExamInfo {
    private Integer electrocardiogramexanid;

    private Integer crowdid;

    //检查时间
    private Date examtime;

    //检查人
    private String examman;

    //检查结果（0：正常；1：异常）
    private String examresult;

    //异常类型(YC)
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