package com.penzias.entity;

public class HistoryPharmacy {
    private Integer pharmacyid;

    private Integer crowdid;

    private String pharmacytype;

    private String pharmacyname;

    private String pharmacyyear;

    private String pharmacysituation;

    private String flag;

    public Integer getPharmacyid() {
        return pharmacyid;
    }

    public void setPharmacyid(Integer pharmacyid) {
        this.pharmacyid = pharmacyid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getPharmacytype() {
        return pharmacytype;
    }

    public void setPharmacytype(String pharmacytype) {
        this.pharmacytype = pharmacytype;
    }

    public String getPharmacyname() {
        return pharmacyname;
    }

    public void setPharmacyname(String pharmacyname) {
        this.pharmacyname = pharmacyname;
    }

    public String getPharmacyyear() {
        return pharmacyyear;
    }

    public void setPharmacyyear(String pharmacyyear) {
        this.pharmacyyear = pharmacyyear;
    }

    public String getPharmacysituation() {
        return pharmacysituation;
    }

    public void setPharmacysituation(String pharmacysituation) {
        this.pharmacysituation = pharmacysituation;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}