package com.books.model;

/**
* @ClassName: Address
* @Description: �ջ���ַʵ��
* @author ���³�
* @date 2018��11��19������7:51:21
*
*/
public class Address {
	
	private Integer bsId;
	private Integer bcId;
	private String bsAddress;   //�ջ���ַ
	public Integer getBsId() {
		return bsId;
	}
	public void setBsId(Integer bsId) {
		this.bsId = bsId;
	}
	public Integer getBcId() {
		return bcId;
	}
	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}
	public String getBsAddress() {
		return bsAddress;
	}
	public void setBsAddress(String bsAddress) {
		this.bsAddress = bsAddress;
	}

}
