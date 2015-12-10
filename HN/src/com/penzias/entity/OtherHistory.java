package com.penzias.entity;

import java.util.Date;

/**
 * 
 * 描述：其他疾病历史<br>
 * 作者：ruibo <br>
 * 修改日期：2015年12月10日-下午9:28:49 <br>
 * E-mail:  sireezhang@163.com<br>
 */
public class OtherHistory {
    private Integer otherid;

    private Integer crowdid;

    //其他病类型（YB)
    private String othertype;

    //是否有既往病历（0：否；1：是）
    private String isother;

    //确诊时间
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