package com.penzias.entity;

public class InstitutionCrowdFamilyInfo {
    private Integer familyid;

    private Integer crowdid;

    //病种类型（ZR）
    private String diseasetype;

    //是否存在（0：无；1：有；2：不详）
    private String isexist;

    //父亲（0：无；1:有）
    private String father;

    //母亲（0：无；1:有）
    private String mother;

    //兄弟姐妹（0:无；1:1个；2:2个......）
    private String brothersister;

    //子女（0:无；1:1个；2:2个......）
    private String children;

    private String flag;
    
    //不参与映射
    //兄弟姐妹患病人数
    private Integer brothersisterNo;
    
   //子女患病人数
    private Integer childrenNo;

    public Integer getFamilyid() {
        return familyid;
    }

    public void setFamilyid(Integer familyid) {
        this.familyid = familyid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getDiseasetype() {
        return diseasetype;
    }

    public void setDiseasetype(String diseasetype) {
        this.diseasetype = diseasetype;
    }

    public String getIsexist() {
        return isexist;
    }

    public void setIsexist(String isexist) {
        this.isexist = isexist;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getBrothersister() {
        return brothersister;
    }

    public void setBrothersister(String brothersister) {
        this.brothersister = brothersister;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}