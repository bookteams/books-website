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
	private Consumer consumer;
	private String bsAddress;   //�ջ���ַ
	public Integer getBsId() {
		return bsId;
	}
	public void setBsId(Integer bsId) {
		this.bsId = bsId;
	}
	public String getBsAddress() {
		return bsAddress;
	}
	public void setBsAddress(String bsAddress) {
		this.bsAddress = bsAddress;
	}
	public Consumer getConsumer() {
		return consumer;
	}
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}

}
