package com.books.model;

/**
* @ClassName: Address
* @Description: 收货地址实例
* @author 李勇超
* @date 2018年11月19日下午7:51:21
*
*/
public class Address {
	
	private Integer bsId;
	private Integer bcId;
	private String bsAddress;   //收货地址
	
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
