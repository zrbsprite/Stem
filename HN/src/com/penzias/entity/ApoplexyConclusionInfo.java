package com.penzias.entity;

/**
 * 描述：人群评级结论表<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月11日 - 上午11:53:04<br/>
 */
public class ApoplexyConclusionInfo {
    private Integer apoplexyconclusionid;

    private Integer crowdid;

    //高血压（0：无；1：有）
    private String hypertension;

    //血脂异常(0:否；1：是)
    private String dyslipidemia;

    //糖尿病(0:无；1：有）
    private String diabetes;

    //房颤或瓣膜性心脏病(0：无；1：有）
    private String atrialfibrillation;

    //吸烟史(0：无；1：有）
    private String smokinghistory;

    //明显超重或肥胖(0：否；1：是)
    private String overweight;

    //运动缺乏或轻体力劳动者（0：否；1：是）
    private String sportslack;

    //脑卒中家族史（0：无；1：有）
    private String familyhistory;

    //既往脑卒中（0：无；1：有）
    private String paststroke;

    //既往短暂性脑缺血发作（0：无；1：有）
    private String pasttia;

    //风险等级（ZF）
    private String grade;

    //危险标识（YE）
    private String mark;

    //管理分级（Y）
    private String managelevel;

    private String flag;

    public Integer getApoplexyconclusionid() {
        return apoplexyconclusionid;
    }

    public void setApoplexyconclusionid(Integer apoplexyconclusionid) {
        this.apoplexyconclusionid = apoplexyconclusionid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getHypertension() {
        return hypertension;
    }

    public void setHypertension(String hypertension) {
        this.hypertension = hypertension;
    }

    public String getDyslipidemia() {
        return dyslipidemia;
    }

    public void setDyslipidemia(String dyslipidemia) {
        this.dyslipidemia = dyslipidemia;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getAtrialfibrillation() {
        return atrialfibrillation;
    }

    public void setAtrialfibrillation(String atrialfibrillation) {
        this.atrialfibrillation = atrialfibrillation;
    }

    public String getSmokinghistory() {
        return smokinghistory;
    }

    public void setSmokinghistory(String smokinghistory) {
        this.smokinghistory = smokinghistory;
    }

    public String getOverweight() {
        return overweight;
    }

    public void setOverweight(String overweight) {
        this.overweight = overweight;
    }

    public String getSportslack() {
        return sportslack;
    }

    public void setSportslack(String sportslack) {
        this.sportslack = sportslack;
    }

    public String getFamilyhistory() {
        return familyhistory;
    }

    public void setFamilyhistory(String familyhistory) {
        this.familyhistory = familyhistory;
    }

    public String getPaststroke() {
        return paststroke;
    }

    public void setPaststroke(String paststroke) {
        this.paststroke = paststroke;
    }

    public String getPasttia() {
        return pasttia;
    }

    public void setPasttia(String pasttia) {
        this.pasttia = pasttia;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getManagelevel() {
        return managelevel;
    }

    public void setManagelevel(String managelevel) {
        this.managelevel = managelevel;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}