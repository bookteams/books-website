package com.books.model;

/**
* @ClassName: Admin
* @Description: ����Ա��
* @author ���³�
* @date 2018��11��18������4:01:58
*
*/
public class Admin {
	
	private Integer bnId;
	private String bnName;  //�˺�
	private String bnPassword; //����
	
	public Admin() {}
	
	public Admin(Integer bnId, String bnName, String bnPassword) {
		super();
		this.bnId = bnId;
		this.bnName = bnName;
		this.bnPassword = bnPassword;
	}
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
