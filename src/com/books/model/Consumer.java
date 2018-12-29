package com.books.model;

/**
* @ClassName: Consumer
* @Description: �û�ʵ��
* @author ���³�
* @date 2018��11��18������4:30:27
*
*/
public class Consumer {
	
	private Integer bcId;
	private String bcNickname; //�ǳ�
	private String bcPassword; //����
	private String bcName; //��ʵ����
	private String bcSex;   //�Ա�
	private String bcTelphone; //��ϵ��ʽ
	private String bcAddress; //�û���ַ
	private Integer bcState;   //�û�״̬
	private String bcImage; //�û�ͷ��
	
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
