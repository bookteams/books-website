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
	
	private Consumer consumer;
	
	public Address() {}
	
	public Address(Integer bsId, Integer bcId, String bsAddress) {
		super();
		this.bsId = bsId;
		this.bcId = bcId;
		this.bsAddress = bsAddress;
	}
	public Integer getBcId() {
		return bcId;
	}
	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}
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
