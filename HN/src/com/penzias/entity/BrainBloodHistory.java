package com.penzias.entity;

import java.util.Date;

public class BrainBloodHistory {
    private Integer brainbloodhistoryid;

    private Integer crowdid;

    private String isbrainblood;

    private String number;

    private Date lasttime;

    private String diagnosis;

    private String basisbrainct;

    private String basisbrainmri;

    private String clinical;

    private Date mrstime;

    private String mrsoption;

    private String mrsvalue;

    private String flag;

    public Integer getBrainbloodhistoryid() {
        return brainbloodhistoryid;
    }

    public void setBrainbloodhistoryid(Integer brainbloodhistoryid) {
        this.brainbloodhistoryid = brainbloodhistoryid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getIsbrainblood() {
        return isbrainblood;
    }

    public void setIsbrainblood(String isbrainblood) {
        this.isbrainblood = isbrainblood;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getBasisbrainct() {
        return basisbrainct;
    }

    public void setBasisbrainct(String basisbrainct) {
        this.basisbrainct = basisbrainct;
    }

    public String getBasisbrainmri() {
        return basisbrainmri;
    }

    public void setBasisbrainmri(String basisbrainmri) {
        this.basisbrainmri = basisbrainmri;
    }

    public String getClinical() {
        return clinical;
    }

    public void setClinical(String clinical) {
        this.clinical = clinical;
    }

    public Date getMrstime() {
        return mrstime;
    }

    public void setMrstime(Date mrstime) {
        this.mrstime = mrstime;
    }

    public String getMrsoption() {
        return mrsoption;
    }

    public void setMrsoption(String mrsoption) {
        this.mrsoption = mrsoption;
    }

    public String getMrsvalue() {
        return mrsvalue;
    }

    public void setMrsvalue(String mrsvalue) {
        this.mrsvalue = mrsvalue;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}