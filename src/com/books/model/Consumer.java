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
	private String bcNickname; //昵称
	private String bcPassword; //密码
	private String bcName; //真实姓名
	private String bcSex;   //性别
	private String bcTelphone; //联系方式
	private String bcAddress; //用户地址
	private Integer bcState;   //用户状态
	private String bcImage; //用户头像
	
	public Consumer() {}
	
	public Consumer(Integer bcId, String bcNickname, String bcPassword, String bcName, String bcSex, String bcTelphone,
			String bcAddress, Integer bcState, String bcImage) {
		super();
		this.bcId = bcId;
		this.bcNickname = bcNickname;
		this.bcPassword = bcPassword;
		this.bcName = bcName;
		this.bcSex = bcSex;
		this.bcTelphone = bcTelphone;
		this.bcAddress = bcAddress;
		this.bcState = bcState;
		this.bcImage = bcImage;
	}
	public String getBcImage() {
		return bcImage;
	}
	public void setBcImage(String bcImage) {
		this.bcImage = bcImage;
	}
	public Integer getBcId() {
		return bcId;
	}
	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}
	public String getBcNickName() {
		return bcNickname;
	}
	public void setBcNickName(String bcNickName) {
		this.bcNickname = bcNickName;
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
	public String getBcSex() {
		return bcSex;
	}
	public void setBcSex(String bcSex) {
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
