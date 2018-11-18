package com.books.model;

/**
* @ClassName: Consumer
* @Description: 用户实体
* @author 李勇超
* @date 2018年11月18日下午4:30:27
*
*/
public class Consumer {
	
	private Integer bcId;
	private String bcNickName; //昵称
	private String bcPassword; //密码
	private String bcName; //真实姓名
	private Integer bcSex;   //性别
	private String bcTelphone; //联系方式
	private String bcAddress; //用户地址
	private Integer bcState;   //用户状态
	public Integer getBcId() {
		return bcId;
	}
	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}
	public String getBcNickName() {
		return bcNickName;
	}
	public void setBcNickName(String bcNickName) {
		this.bcNickName = bcNickName;
	}
	public String getBcPassword() {
		return bcPassword;
	}
	public void setBcPassword(String bcPassword) {
		this.bcPassword = bcPassword;
	}
	public String getBcName() {
		return bcName;
	}
	public void setBcName(String bcName) {
		this.bcName = bcName;
	}
	public Integer getBcSex() {
		return bcSex;
	}
	public void setBcSex(Integer bcSex) {
		this.bcSex = bcSex;
	}
	public String getBcTelphone() {
		return bcTelphone;
	}
	public void setBcTelphone(String bcTelphone) {
		this.bcTelphone = bcTelphone;
	}
	public String getBcAddress() {
		return bcAddress;
	}
	public void setBcAddress(String bcAddress) {
		this.bcAddress = bcAddress;
	}
	public Integer getBcState() {
		return bcState;
	}
	public void setBcState(Integer bcState) {
		this.bcState = bcState;
	}
	
	
	
	
	
	

}
