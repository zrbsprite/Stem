package com.penzias.entity;

import java.util.Date;

public class InstitutionCrowdBaseInfo {

	private Integer crowdid;

	//证件类型（数据来源于CODEITEM的ZD)
	private String certificatestype;

	//证件号码
	private String certificatesid;

	//姓名
	private String fullname;

	//手机号
	private String mobile;

	//性别（0：女；1：男；2：不定）
	private String sex;

	//出生日期
	private Date birthdate;

	//创建机构（不显示，过滤人群的条件），注意不是科室代码
	private String depbm;

	//创建时间
	private Date createdate;

	//创建人
	private String username;

	//病例状态（数据来源于ZE)
	private String states;

	//风险等级（ZF)
	private String grade;

	//数据来源(ZG)
	private String source;

	//来源机构（备注说明）
	private String sourcebz;

	//病例编号
	private String caseno;

	//民族（ZH）
	private String nation;

	//受教育程度（ZI）
	private String education;

	//职业（ZJ）
	private String occupation;

	//本人年均收入（ZK）
	private String income;

	//主要医疗付费方式（ZL）
	private String pay;

	//户籍地址
	private String censusregisteraddress;

	//户籍邮编
	private String censusregistercode;

	//现居住地址
	private String liveaddress;

	//现居住地址邮编
	private String livecode;

	//联系电话
	private String tel;

	//电子邮箱
	private String email;

	//主要联系人姓名
	private String linkman;

	//主要联系人手机
	private String linkmanmob;

	//与本人关系（ZM)
	private String relationship;

	private String flag;

	// 不参与映射
	private Integer age;

	// 病历状态显示
	private String statusInfo;

	private String gradeInfo;

	private Integer gradeColor;

	public Integer getCrowdid(){

		return crowdid;
	}

	public void setCrowdid(Integer crowdid){

		this.crowdid = crowdid;
	}

	public String getCertificatestype(){

		return certificatestype;
	}

	public void setCertificatestype(String certificatestype){

		this.certificatestype = certificatestype;
	}

	public String getCertificatesid(){

		return certificatesid;
	}

	public void setCertificatesid(String certificatesid){

		this.certificatesid = certificatesid;
	}

	public String getFullname(){

		return fullname;
	}

	public void setFullname(String fullname){

		this.fullname = fullname;
	}

	public String getMobile(){

		return mobile;
	}

	public void setMobile(String mobile){

		this.mobile = mobile;
	}

	public String getSex(){

		return sex;
	}

	public void setSex(String sex){

		this.sex = sex;
	}

	public Date getBirthdate(){

		return birthdate;
	}

	public void setBirthdate(Date birthdate){

		this.birthdate = birthdate;
	}

	public String getDepbm(){

		return depbm;
	}

	public void setDepbm(String depbm){

		this.depbm = depbm;
	}

	public Date getCreatedate(){

		return createdate;
	}

	public void setCreatedate(Date createdate){

		this.createdate = createdate;
	}

	public String getUsername(){

		return username;
	}

	public void setUsername(String username){

		this.username = username;
	}

	public String getStates(){

		return states;
	}

	public void setStates(String states){

		this.states = states;
	}

	public String getGrade(){

		return grade;
	}

	public void setGrade(String grade){

		this.grade = grade;
	}

	public String getSource(){

		return source;
	}

	public void setSource(String source){

		this.source = source;
	}

	public String getSourcebz(){

		return sourcebz;
	}

	public void setSourcebz(String sourcebz){

		this.sourcebz = sourcebz;
	}

	public String getCaseno(){

		return caseno;
	}

	public void setCaseno(String caseno){

		this.caseno = caseno;
	}

	public String getNation(){

		return nation;
	}

	public void setNation(String nation){

		this.nation = nation;
	}

	public String getEducation(){

		return education;
	}

	public void setEducation(String education){

		this.education = education;
	}

	public String getOccupation(){

		return occupation;
	}

	public void setOccupation(String occupation){

		this.occupation = occupation;
	}

	public String getIncome(){

		return income;
	}

	public void setIncome(String income){

		this.income = income;
	}

	public String getPay(){

		return pay;
	}

	public void setPay(String pay){

		this.pay = pay;
	}

	public String getCensusregisteraddress(){

		return censusregisteraddress;
	}

	public void setCensusregisteraddress(String censusregisteraddress){

		this.censusregisteraddress = censusregisteraddress;
	}

	public String getCensusregistercode(){

		return censusregistercode;
	}

	public void setCensusregistercode(String censusregistercode){

		this.censusregistercode = censusregistercode;
	}

	public String getLiveaddress(){

		return liveaddress;
	}

	public void setLiveaddress(String liveaddress){

		this.liveaddress = liveaddress;
	}

	public String getLivecode(){

		return livecode;
	}

	public void setLivecode(String livecode){

		this.livecode = livecode;
	}

	public String getTel(){

		return tel;
	}

	public void setTel(String tel){

		this.tel = tel;
	}

	public String getEmail(){

		return email;
	}

	public void setEmail(String email){

		this.email = email;
	}

	public String getLinkman(){

		return linkman;
	}

	public void setLinkman(String linkman){

		this.linkman = linkman;
	}

	public String getLinkmanmob(){

		return linkmanmob;
	}

	public void setLinkmanmob(String linkmanmob){

		this.linkmanmob = linkmanmob;
	}

	public String getRelationship(){

		return relationship;
	}

	public void setRelationship(String relationship){

		this.relationship = relationship;
	}

	public String getFlag(){

		return flag;
	}

	public void setFlag(String flag){

		this.flag = flag;
	}

	public Integer getAge(){

		return age;
	}

	public void setAge(Integer age){

		this.age = age;
	}

	public String getStatusInfo(){

		return statusInfo;
	}

	public void setStatusInfo(String statusInfo){

		this.statusInfo = statusInfo;
	}

	public String getGradeInfo(){

		return gradeInfo;
	}

	public void setGradeInfo(String gradeInfo){

		this.gradeInfo = gradeInfo;
	}

	public Integer getGradeColor(){

		return gradeColor;
	}

	public void setGradeColor(Integer gradeColor){

		this.gradeColor = gradeColor;
	}
}