package com.penzias.entity;

import java.util.Date;

/**
 * 描述：脑血管病史 <br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月10日 - 下午2:27:49<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class BrainBloodHistory {
    private Integer brainbloodhistoryid;

    private Integer crowdid;

    //脑血管病史(0:无；1：有)
    private String isbrainblood;

    //发病次数
    private String number;

    //末次发病时间
    private Date lasttime;

    //主要诊断(ZY)
    private String diagnosis;

    //诊断依据脑部CT(0:否；1：是）
    private String basisbrainct;

    //诊断依据脑部MRI(0:否；1：是）
    private String basisbrainmri;

    //诊断依据临床表现(0:否；1：是）
    private String clinical;

    //MRS评估时间
    private Date mrstime;

    //MRS选项（ZZ）
    private String mrsoption;

    //MRS分值
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