package com.penzias.entity;

import java.util.Date;

/**
 * 描述：用户个人信息表<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午5:39:15<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class UserPersonalInfo {

	//
    private Integer userpersonalinfoid;

    //用户名
    private String username;

    //姓名
    private String name;

    //性别(0:男；1：女)
    private String sex;

    //出生日期
    private Date birthdate;

    //国籍
    private String nationality;

    //政治面貌 
    private String politicsstatus;

    //身份证号
    private String idnumber;

    //民族 
    private String nation;

    //邮编
    private String post;

    //毕业院校 
    private String graduateinstitutions;

    //毕业时间 
    private Date graduatedate;

    //学历
    private String education;

    //学位
    private String degree;

    //专业 
    private String specialty;

    //执业医师级别
    private String grade;

    //执业类别 
    private String category;

    //手机
    private String tel;

    public Integer getUserpersonalinfoid() {
        return userpersonalinfoid;
    }

    public void setUserpersonalinfoid(Integer userpersonalinfoid) {
        this.userpersonalinfoid = userpersonalinfoid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPoliticsstatus() {
        return politicsstatus;
    }

    public void setPoliticsstatus(String politicsstatus) {
        this.politicsstatus = politicsstatus;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getGraduateinstitutions() {
        return graduateinstitutions;
    }

    public void setGraduateinstitutions(String graduateinstitutions) {
        this.graduateinstitutions = graduateinstitutions;
    }

    public Date getGraduatedate() {
        return graduatedate;
    }

    public void setGraduatedate(Date graduatedate) {
        this.graduatedate = graduatedate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}