package com.books.model;

import java.util.Date;

/**
* @ClassName: Comment
* @Description: 评论
* @author 李勇超
* @date 2018年11月18日下午4:26:31
*
*/
public class Comment {
	
	private Integer bmId;
	private Attribute attribute;
	private Consumer consumer; //bcId和用户昵称
	private Date bmTime;  //评论时间
	private String bmContent;  //评论内容
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
