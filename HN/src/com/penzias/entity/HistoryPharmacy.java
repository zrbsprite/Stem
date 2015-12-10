package com.penzias.entity;

/**
 * 描述：用药历史<br>
 * 作者：ruibo <br>
 * 修改日期：2015年12月10日-下午9:28:28 <br>
 * E-mail:  sireezhang@163.com<br>
 */
public class HistoryPharmacy {
    private Integer pharmacyid;

    private Integer crowdid;

    //用药类型（ZU--前2位）
    private String pharmacytype;
    
    //用药名称（ZU--4或6位）
    private String pharmacyname;

    //用药年限
    private String pharmacyyear;

    //用药情况(0:规律；1:不规律)
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