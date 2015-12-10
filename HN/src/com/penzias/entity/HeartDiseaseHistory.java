package com.penzias.entity;

import java.util.Date;

/**
 * 描述： 心脏病史<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月10日 - 下午2:27:44<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class HeartDiseaseHistory {
    private Integer heartdiseasehistoryid;

    private Integer crowdid;

    //心脏病史(0:无；1：有)
    private String isheartdisease;

    //冠心病（0：无；1：有）
    private String coronarydisease;

    //房颤（0：无；1：有）
    private String atrialfibrillation;

    //瓣膜性心脏病（0：无；1：有）
    private String vhd;

    //其他（0：无；1：有）
    private String other;

    //冠心病发病次数
    private String number;

    //冠心病末次发病时间
    private Date lasttime;

    //主要诊断(YA)
    private String diagnosis;

    //诊断依据-心肌酶升高（0：否；1：是）
    private String basismyocardialenzymes;

    //诊断依据-心电图异常（0：否；1：是）
    private String basisecg;

    //诊断依据-冠脉造影（0：否；1：是）
    private String basiscoronaryangiography;

    //诊断依据-临床表现(0:否；1：是）
    private String clinical;

    //房颤首次确诊时间
    private Date firsttime;

    //是否服用抗血小板药物(0:否；1：是)
    private String isplatelet;

    //是否服用抗凝药物(0:否；1：是)
    private String isanticoagulant;

    private String flag;
    
    //一下不参与映射
    //主要诊断具体选项
    private String diagnosisItem; 

    public Integer getHeartdiseasehistoryid() {
        return heartdiseasehistoryid;
    }

    public void setHeartdiseasehistoryid(Integer heartdiseasehistoryid) {
        this.heartdiseasehistoryid = heartdiseasehistoryid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getIsheartdisease() {
        return isheartdisease;
    }

    public void setIsheartdisease(String isheartdisease) {
        this.isheartdisease = isheartdisease;
    }

    public String getCoronarydisease() {
        return coronarydisease;
    }

    public void setCoronarydisease(String coronarydisease) {
        this.coronarydisease = coronarydisease;
    }

    public String getAtrialfibrillation() {
        return atrialfibrillation;
    }

    public void setAtrialfibrillation(String atrialfibrillation) {
        this.atrialfibrillation = atrialfibrillation;
    }

    public String getVhd() {
        return vhd;
    }

    public void setVhd(String vhd) {
        this.vhd = vhd;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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

    public String getBasismyocardialenzymes() {
        return basismyocardialenzymes;
    }

    public void setBasismyocardialenzymes(String basismyocardialenzymes) {
        this.basismyocardialenzymes = basismyocardialenzymes;
    }

    public String getBasisecg() {
        return basisecg;
    }

    public void setBasisecg(String basisecg) {
        this.basisecg = basisecg;
    }

    public String getBasiscoronaryangiography() {
        return basiscoronaryangiography;
    }

    public void setBasiscoronaryangiography(String basiscoronaryangiography) {
        this.basiscoronaryangiography = basiscoronaryangiography;
    }

    public String getClinical() {
        return clinical;
    }

    public void setClinical(String clinical) {
        this.clinical = clinical;
    }

    public Date getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(Date firsttime) {
        this.firsttime = firsttime;
    }

    public String getIsplatelet() {
        return isplatelet;
    }

    public void setIsplatelet(String isplatelet) {
        this.isplatelet = isplatelet;
    }

    public String getIsanticoagulant() {
        return isanticoagulant;
    }

    public void setIsanticoagulant(String isanticoagulant) {
        this.isanticoagulant = isanticoagulant;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

	
	public String getDiagnosisItem(){
	
		return diagnosisItem;
	}

	public void setDiagnosisItem(String diagnosisItem){
	
		this.diagnosisItem = diagnosisItem;
	}
}