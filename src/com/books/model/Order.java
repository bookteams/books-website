package com.books.model;

import java.util.Date;

/**
* @ClassName: Order
* @Description: 订单实体
* @author 李勇超
* @date 2018年11月18日下午4:37:32
*
*/
public class Order {
	
	private Integer boId;
	private Integer bcId; //用户编号
	private Date boTime; //支付时间
	private String boPay; //支付方式
	private String boReName; //收货人姓名
	private Address address; //收货地址
	private String boReTel; //收货人联系方式
	private Double boPrice; //总价格
	private String boMemo; //备注
	
	private Consumer consumer;
	
	
	public Integer getBcId() {
		return bcId;
	}
	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}
	public Integer getBoId() {
		return boId;
	}
	public void setBoId(Integer boId) {
		this.boId = boId;
	}
	public Date getBoTime() {
		return boTime;
	}
	public void setBoTime(Date boTime) {
		this.boTime = boTime;
	}
	public String getBoPay() {
		return boPay;
	}
	public void setBoPay(String boPay) {
		this.boPay = boPay;
	}
	public String getBoReName() {
		return boReName;
	}
	public void setBoReName(String boReName) {
		this.boReName = boReName;
	}
	public String getBoReTel() {
		return boReTel;
	}
	public void setBoReTel(String boReTel) {
		this.boReTel = boReTel;
	}
	public Double getBoPrice() {
		return boPrice;
	}
	public void setBoPrice(Double boPrice) {
		this.boPrice = boPrice;
	}
	public String getBoMemo() {
		return boMemo;
	}
	public void setBoMemo(String boMemo) {
		this.boMemo = boMemo;
	}
	public Consumer getConsumer() {
		return consumer;
	}
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
