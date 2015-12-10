package com.penzias.entity;

import java.util.Date;

/**
 * 描述：人群肾脏病病史<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月10日 - 下午4:21:20<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class KidneyDiseaseHostory {
    private Integer kidneydiseasehistoryid;

    private Integer crowdid;

    //既往有无被诊断为肾脏疾病(0:无；1：有)
    private String iskidneydisease;

    //确诊时间
    private Date diagnosistime;

    //肾脏疾病类型-糖尿病肾病(0:否；1：是)
    private String diabetes;

    //肾脏疾病类型-高血压肾病(0:否；1：是)
    private String hypertension;

    //肾脏疾病类型-肾功能衰竭(0:否；1：是)
    private String renalfailure;

    //肾脏疾病类型-急性肾炎(0:否；1：是)
    private String acutenephritis;

    //肾脏疾病类型-慢性肾炎(0:否；1：是)
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