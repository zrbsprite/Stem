package com.penzias.entity;

import java.util.Date;

public class HypertensionHistory {
    private Integer hypertensionhistoryid;

    private Integer crowdid;

    private String frequency;

    private String ishypertension;

    private Date diagnosistime;

    private String ishypotensor;

    private String iscysteine;

    private String control;

    private String controlyear;

    private String flag;

    public Integer getHypertensionhistoryid() {
        return hypertensionhistoryid;
    }

    public void setHypertensionhistoryid(Integer hypertensionhistoryid) {
        this.hypertensionhistoryid = hypertensionhistoryid;
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

    public String getIshypertension() {
        return ishypertension;
    }

    public void setIshypertension(String ishypertension) {
        this.ishypertension = ishypertension;
    }

    public Date getDiagnosistime() {
        return diagnosistime;
    }

    public void setDiagnosistime(Date diagnosistime) {
        this.diagnosistime = diagnosistime;
    }

    public String getIshypotensor() {
        return ishypotensor;
    }

    public void setIshypotensor(String ishypotensor) {
        this.ishypotensor = ishypotensor;
    }

    public String getIscysteine() {
        return iscysteine;
    }

    public void setIscysteine(String iscysteine) {
        this.iscysteine = iscysteine;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getControlyear() {
        return controlyear;
    }

    public void setControlyear(String controlyear) {
        this.controlyear = controlyear;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}