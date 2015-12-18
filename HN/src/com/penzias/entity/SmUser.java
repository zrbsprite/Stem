package com.penzias.entity;

import java.util.Date;

/**
 * 描述：系统用户<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午5:36:05<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class SmUser {

	// 用户名
	private String username;

	// 密码
	private String password;

	// 邮箱
	private String email;

	// 状态（1有效、0无效）
	private String states;

	// 姓名
	private String fullname;

	// 联系方式
	private String mobile;

	// 所属机构（注意是科室代码）
	private String depbm;

	// 所属角色
	private String roleid;

	// 用户类型(数据来源于codeitem的ZA)
	private String usertype;

	// 创建时间
	private Date createdate;

	// 身份证号码
	private String idnumber;

	// 关联用户信息
	private UserPersonalInfo userInfo;

	public String getUsername(){

		return username;
	}

	public void setUsername(String username){

		this.username = username;
	}

	public String getPassword(){

		return password;
	}

	public void setPassword(String password){

		this.password = password;
	}

	public String getEmail(){

		return email;
	}

	public void setEmail(String email){

		this.email = email;
	}

	public String getStates(){

		return states;
	}

	public void setStates(String states){

		this.states = states;
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

	public String getDepbm(){

		return depbm;
	}

	public void setDepbm(String depbm){

		this.depbm = depbm;
	}

	public String getRoleid(){

		return roleid;
	}

	public void setRoleid(String roleid){

		this.roleid = roleid;
	}

	public String getUsertype(){

		return usertype;
	}

	public void setUsertype(String usertype){

		this.usertype = usertype;
	}

	public Date getCreatedate(){

		return createdate;
	}

	public void setCreatedate(Date createdate){

		this.createdate = createdate;
	}

	public String getIdnumber(){

		return idnumber;
	}

	public void setIdnumber(String idnumber){

		this.idnumber = idnumber;
	}

	public UserPersonalInfo getUserInfo(){

		return userInfo;
	}

	public void setUserInfo(UserPersonalInfo userInfo){

		this.userInfo = userInfo;
	}

}