package com.books.model;

import java.util.Date;

/**
* @ClassName: Comment
* @Description: ����
* @author ���³�
* @date 2018��11��18������4:26:31
*
*/
public class Comment {
	
	private Integer bmId;
	private Integer baId;
	private Integer bcId;
	
	private Date bmTime;  //����ʱ��
	private String bmContent;  //��������
	
	private Attribute attribute;
	private Consumer consumer; 
	
	
	public Integer getBaId() {
		return baId;
	}
	public void setBaId(Integer baId) {
		this.baId = baId;
	}
	public Integer getBcId() {
		return bcId;
	}
	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}
	public Integer getBmId() {
		return bmId;
	}
	public void setBmId(Integer bmId) {
		this.bmId = bmId;
	}
	public Date getBmTime() {
		return bmTime;
	}
	public void setBmTime(Date bmTime) {
		this.bmTime = bmTime;
	}
	public String getBmContent() {
		return bmContent;
	}
	public void setBmContent(String bmContent) {
		this.bmContent = bmContent;
	}
	public Attribute getAttribute() {
		return attribute;
	}
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	public Consumer getConsumer() {
		return consumer;
	}
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}
	
}
