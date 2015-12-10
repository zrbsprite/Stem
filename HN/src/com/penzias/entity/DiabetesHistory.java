package com.penzias.entity;

import java.util.Date;

/**
 * 描述：人群糖尿病病史<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月10日 - 下午4:19:42<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class DiabetesHistory {
    private Integer diabeteshistoryid;

    private Integer crowdid;

    //血糖测量频率(ZW)
    private String frequency;

    //既往有无被诊断为糖尿病(0:无；1：有）
    private String isdiabetes;

    //确诊时间
    private Date diagnosistime;

    //是否服降糖药(0:否；1：是）
    private String ishypoglycemic;

    //是否使用胰岛素(0:否；1：是）
    private String isinsulin;

    //胰岛素用药情况(0:规律；1:不规律)
    private String pharmacysituation;

    //血糖控制情况(ZX)
    private String control;

    //此情况已维持年限
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