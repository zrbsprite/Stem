package com.penzias.entity;

import java.util.Date;

/**
 * 描述：人群肺源性疾病病史<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月10日 - 下午4:28:46<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class PulmonaryDiseaseHistory {
    private Integer pulmonarydiseasehistoryid;

    private Integer crowdid;

    //既往有无被诊断为肺源性疾病(0:无；1：有）
    private String ispulmonarydisease;

    //确诊时间
    private Date diagnosistime;

    //肺源性疾病类型-慢阻肺(0:无；1：有)
    private String slow;

    //肺源性疾病类型-支气管扩张(0:无；1：有)
    private String turtlelung;

    //肺源性疾病类型-肺结核(0:无；1：有)
    private String tuberculosis;

    //肺源性疾病类型-肺肿瘤(0:无；1：有)
    private String lungtumor;

    //肺源性疾病类型-肺栓塞(0:无；1：有)
    private String pulmonaryembolism;

    private String flag;

    public Integer getPulmonarydiseasehistoryid() {
        return pulmonarydiseasehistoryid;
    }

    public void setPulmonarydiseasehistoryid(Integer pulmonarydiseasehistoryid) {
        this.pulmonarydiseasehistoryid = pulmonarydiseasehistoryid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getIspulmonarydisease() {
        return ispulmonarydisease;
    }

    public void setIspulmonarydisease(String ispulmonarydisease) {
        this.ispulmonarydisease = ispulmonarydisease;
    }

    public Date getDiagnosistime() {
        return diagnosistime;
    }

    public void setDiagnosistime(Date diagnosistime) {
        this.diagnosistime = diagnosistime;
    }

    public String getSlow() {
        return slow;
    }

    public void setSlow(String slow) {
        this.slow = slow;
    }

    public String getTurtlelung() {
        return turtlelung;
    }

    public void setTurtlelung(String turtlelung) {
        this.turtlelung = turtlelung;
    }

    public String getTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(String tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public String getLungtumor() {
        return lungtumor;
    }

    public void setLungtumor(String lungtumor) {
        this.lungtumor = lungtumor;
    }

    public String getPulmonaryembolism() {
        return pulmonaryembolism;
    }

    public void setPulmonaryembolism(String pulmonaryembolism) {
        this.pulmonaryembolism = pulmonaryembolism;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}