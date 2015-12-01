package com.penzias.entity;

import java.util.Date;

public class DiabetesHistory {
    private Integer diabeteshistoryid;

    private Integer crowdid;

    private String frequency;

    private String isdiabetes;

    private Date diagnosistime;

    private String ishypoglycemic;

    private String isinsulin;

    private String pharmacysituation;

    private String control;

    private String controlyeat;

    private String flag;

    public Integer getDiabeteshistoryid() {
        return diabeteshistoryid;
    }

    public void setDiabeteshistoryid(Integer diabeteshistoryid) {
        this.diabeteshistoryid = diabeteshistoryid;
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

    public String getIsdiabetes() {
        return isdiabetes;
    }

    public void setIsdiabetes(String isdiabetes) {
        this.isdiabetes = isdiabetes;
    }

    public Date getDiagnosistime() {
        return diagnosistime;
    }

    public void setDiagnosistime(Date diagnosistime) {
        this.diagnosistime = diagnosistime;
    }

    public String getIshypoglycemic() {
        return ishypoglycemic;
    }

    public void setIshypoglycemic(String ishypoglycemic) {
        this.ishypoglycemic = ishypoglycemic;
    }

    public String getIsinsulin() {
        return isinsulin;
    }

    public void setIsinsulin(String isinsulin) {
        this.isinsulin = isinsulin;
    }

    public String getPharmacysituation() {
        return pharmacysituation;
    }

    public void setPharmacysituation(String pharmacysituation) {
        this.pharmacysituation = pharmacysituation;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getControlyeat() {
        return controlyeat;
    }

    public void setControlyeat(String controlyeat) {
        this.controlyeat = controlyeat;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}