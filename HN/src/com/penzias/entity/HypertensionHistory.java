package com.penzias.entity;

import java.util.Date;

/**
 * 描述：人群高血压病史<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月10日 - 下午2:55:02<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class HypertensionHistory {
    private Integer hypertensionhistoryid;

    private Integer crowdid;

    //血压测量频率(ZS)
    private String frequency;

    //既往有无被诊断为高血压(0:无；1：有）
    private String ishypertension;

    //确诊时间
    private Date diagnosistime;

    //是否服用降压药(0:否；1：是)
    private String ishypotensor;

    //是否服用降同型半胱氨酸药(0:否；1：是)
    private String iscysteine;

    //血压控制情况(ZT)
    private String control;

    //此情况已维持年限
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