package com.penzias.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BloodFatExamInfo {
    private Integer bloodfatexamid;

    private Integer crowdid;

    private Date examtime;

    private BigDecimal triglyceride;

    private BigDecimal cholesterol;

    private BigDecimal lowcholesterol;

    private BigDecimal heightcholesterol;

    private String flag;

    public Integer getBloodfatexamid() {
        return bloodfatexamid;
    }

    public void setBloodfatexamid(Integer bloodfatexamid) {
        this.bloodfatexamid = bloodfatexamid;
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

    public BigDecimal getTriglyceride() {
        return triglyceride;
    }

    public void setTriglyceride(BigDecimal triglyceride) {
        this.triglyceride = triglyceride;
    }

    public BigDecimal getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(BigDecimal cholesterol) {
        this.cholesterol = cholesterol;
    }

    public BigDecimal getLowcholesterol() {
        return lowcholesterol;
    }

    public void setLowcholesterol(BigDecimal lowcholesterol) {
        this.lowcholesterol = lowcholesterol;
    }

    public BigDecimal getHeightcholesterol() {
        return heightcholesterol;
    }

    public void setHeightcholesterol(BigDecimal heightcholesterol) {
        this.heightcholesterol = heightcholesterol;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}