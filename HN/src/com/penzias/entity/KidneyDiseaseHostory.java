package com.penzias.entity;

import java.util.Date;

public class KidneyDiseaseHostory {
    private Integer kidneydiseasehistoryid;

    private Integer crowdid;

    private String iskidneydisease;

    private Date diagnosistime;

    private String diabetes;

    private String hypertension;

    private String renalfailure;

    private String acutenephritis;

    private String chronicnephritis;

    private String flag;

    public Integer getKidneydiseasehistoryid() {
        return kidneydiseasehistoryid;
    }

    public void setKidneydiseasehistoryid(Integer kidneydiseasehistoryid) {
        this.kidneydiseasehistoryid = kidneydiseasehistoryid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getIskidneydisease() {
        return iskidneydisease;
    }

    public void setIskidneydisease(String iskidneydisease) {
        this.iskidneydisease = iskidneydisease;
    }

    public Date getDiagnosistime() {
        return diagnosistime;
    }

    public void setDiagnosistime(Date diagnosistime) {
        this.diagnosistime = diagnosistime;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getHypertension() {
        return hypertension;
    }

    public void setHypertension(String hypertension) {
        this.hypertension = hypertension;
    }

    public String getRenalfailure() {
        return renalfailure;
    }

    public void setRenalfailure(String renalfailure) {
        this.renalfailure = renalfailure;
    }

    public String getAcutenephritis() {
        return acutenephritis;
    }

    public void setAcutenephritis(String acutenephritis) {
        this.acutenephritis = acutenephritis;
    }

    public String getChronicnephritis() {
        return chronicnephritis;
    }

    public void setChronicnephritis(String chronicnephritis) {
        this.chronicnephritis = chronicnephritis;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}