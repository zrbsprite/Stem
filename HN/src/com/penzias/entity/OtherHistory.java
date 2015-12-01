package com.penzias.entity;

import java.util.Date;

public class OtherHistory {
    private Integer otherid;

    private Integer crowdid;

    private String othertype;

    private String isother;

    private Date diagnosistime;

    private String flag;

    public Integer getOtherid() {
        return otherid;
    }

    public void setOtherid(Integer otherid) {
        this.otherid = otherid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getOthertype() {
        return othertype;
    }

    public void setOthertype(String othertype) {
        this.othertype = othertype;
    }

    public String getIsother() {
        return isother;
    }

    public void setIsother(String isother) {
        this.isother = isother;
    }

    public Date getDiagnosistime() {
        return diagnosistime;
    }

    public void setDiagnosistime(Date diagnosistime) {
        this.diagnosistime = diagnosistime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}