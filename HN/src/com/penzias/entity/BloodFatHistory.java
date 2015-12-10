package com.penzias.entity;

import java.util.Date;

public class BloodFatHistory {
    private Integer bloodfathistoryid;

    private Integer crowdid;

    //血脂测量频率(ZW)
    private String frequency;

    //既往有无被诊断为血脂异常(0:无；1：有）
    private String isbloodfat;

    private Date diagnosistime;

    //高胆固醇异常（0：无异常；1：异常）
    private String highcholesterol;

    //高甘油三酯异常（0：无异常；1：异常）
    private String hightriglyceride;

    //高LDL-C异常（0：无异常；1：异常）
    private String highldlC;

    //低LDL-C异常（0：无异常；1：异常）
    private String lowhdlC;

    //不详（0:不选中；1：选中）
    private String other;

    //是否服用调脂药(0:否；1：是）
    private String islipidLowering;

    //胆固醇控制情况（ZX)
    private String cholesterolcontrol;

    //胆固醇控制年限
    private String cholesterolyear;

    //甘油三酯控制情况（ZX)
    private String triglyceridecontrol;

    //甘油三酯控制年限
    private String triglycerideyear;

    //LDL-C控制情况（ZX)
    private String ldlCcontrol;

    //LDL-C控制年限
    private String ldlCyear;

    //HDL-C控制情况（ZX)
    private String hdlCcontrol;

    //HDL-C控制年限
    private String hdlCyear;

    private String flag;

    public Integer getBloodfathistoryid() {
        return bloodfathistoryid;
    }

    public void setBloodfathistoryid(Integer bloodfathistoryid) {
        this.bloodfathistoryid = bloodfathistoryid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getIsbloodfat() {
        return isbloodfat;
    }

    public void setIsbloodfat(String isbloodfat) {
        this.isbloodfat = isbloodfat;
    }

    public Date getDiagnosistime() {
        return diagnosistime;
    }

    public void setDiagnosistime(Date diagnosistime) {
        this.diagnosistime = diagnosistime;
    }

    public String getHighcholesterol() {
        return highcholesterol;
    }

    public void setHighcholesterol(String highcholesterol) {
        this.highcholesterol = highcholesterol;
    }

    public String getHightriglyceride() {
        return hightriglyceride;
    }

    public void setHightriglyceride(String hightriglyceride) {
        this.hightriglyceride = hightriglyceride;
    }

    public String getHighldlC() {
        return highldlC;
    }

    public void setHighldlC(String highldlC) {
        this.highldlC = highldlC;
    }

    public String getLowhdlC() {
        return lowhdlC;
    }

    public void setLowhdlC(String lowhdlC) {
        this.lowhdlC = lowhdlC;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getIslipidLowering() {
        return islipidLowering;
    }

    public void setIslipidLowering(String islipidLowering) {
        this.islipidLowering = islipidLowering;
    }

    public String getCholesterolcontrol() {
        return cholesterolcontrol;
    }

    public void setCholesterolcontrol(String cholesterolcontrol) {
        this.cholesterolcontrol = cholesterolcontrol;
    }

    public String getCholesterolyear() {
        return cholesterolyear;
    }

    public void setCholesterolyear(String cholesterolyear) {
        this.cholesterolyear = cholesterolyear;
    }

    public String getTriglyceridecontrol() {
        return triglyceridecontrol;
    }

    public void setTriglyceridecontrol(String triglyceridecontrol) {
        this.triglyceridecontrol = triglyceridecontrol;
    }

    public String getTriglycerideyear() {
        return triglycerideyear;
    }

    public void setTriglycerideyear(String triglycerideyear) {
        this.triglycerideyear = triglycerideyear;
    }

    public String getLdlCcontrol() {
        return ldlCcontrol;
    }

    public void setLdlCcontrol(String ldlCcontrol) {
        this.ldlCcontrol = ldlCcontrol;
    }

    public String getLdlCyear() {
        return ldlCyear;
    }

    public void setLdlCyear(String ldlCyear) {
        this.ldlCyear = ldlCyear;
    }

    public String getHdlCcontrol() {
        return hdlCcontrol;
    }

    public void setHdlCcontrol(String hdlCcontrol) {
        this.hdlCcontrol = hdlCcontrol;
    }

    public String getHdlCyear() {
        return hdlCyear;
    }

    public void setHdlCyear(String hdlCyear) {
        this.hdlCyear = hdlCyear;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}