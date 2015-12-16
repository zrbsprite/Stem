package com.penzias.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述：人群血脂检查表<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午2:40:57<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class BloodFatExamInfo {
	
    private Integer bloodfatexamid;

    //人群id
    private Integer crowdid;

    //检查时间
    private Date examtime;

    //甘油三酯(mmol/L)
    private BigDecimal triglyceride;

    //胆固醇(mmol/L)
    private BigDecimal cholesterol;

    //低密度脂蛋白胆固醇(mmol/L)
    private BigDecimal lowcholesterol;

    //高密度脂蛋白胆固醇(mmol/L)
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