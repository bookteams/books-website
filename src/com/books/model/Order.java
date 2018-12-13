package com.books.model;

import java.util.Date;

/**
* @ClassName: Order
* @Description: ����ʵ��
* @author ���³�
* @date 2018��11��18������4:37:32
*
*/
public class Order {
	
	private Integer boId;
	private Integer bcId; //�û����
	private Date boTime; //֧��ʱ��
	private String boPay; //֧����ʽ
	private String boReName; //�ջ�������
	private Address address; //�ջ���ַ
	private String boReTel; //�ջ�����ϵ��ʽ
	private Double boPrice; //�ܼ۸�
	private String boMemo; //��ע
	
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
