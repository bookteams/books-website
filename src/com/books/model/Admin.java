package com.books.model;

/**
* @ClassName: Admin
* @Description: 管理员类
* @author 李勇超
* @date 2018年11月18日下午4:01:58
*
*/
public class Admin {
	
	private Integer bnId;
	private String bnName;  //账号
	private String bnPassword; //密码
	
	public Integer getBnId() {
		return bnId;
	}
	public void setBnId(Integer bnId) {
		this.bnId = bnId;
	}
	public String getBnName() {
		return bnName;
	}
	public void setBnName(String bnName) {
		this.bnName = bnName;
	}
	public String getBnPassword() {
		return bnPassword;
	}
	public void setBnPassword(String bnPassword) {
		this.bnPassword = bnPassword;
	}
	
}
