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
	private Integer baId;
	private Integer bcId;
	private String bcNickName; //用户昵称
	private Date bmTime;  //评论时间
	private String bmContent;  //评论内容
	public Integer getBmId() {
		return bmId;
	}
	public void setBmId(Integer bmId) {
		this.bmId = bmId;
	}
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
	public String getBcNickName() {
		return bcNickName;
	}
	public void setBcNickName(String bcNickName) {
		this.bcNickName = bcNickName;
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
	
	
	

}
