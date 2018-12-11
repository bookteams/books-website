package com.books.model;

/**
* @ClassName: Cart
* @Description: 购物车
* @author 李勇超
* @date 2018年11月18日下午4:23:02
*
*/
public class Cart {

	private Integer brId;
	private Order order; //订单号
	private Attribute attribute; //图书编号
	private Integer brNum; //订购数量
	private double brPrices; //总价格
	public Integer getBrId() {
		return brId;
	}
	public void setBrId(Integer brId) {
		this.brId = brId;
	}
	public void setBrNum(Integer brNum) {
		this.brNum = brNum;
	}
	public double getBrPrices() {
		return brPrices;
	}
	public void setBrPrices(double brPrices) {
		this.brPrices = brPrices;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Attribute getAttribute() {
		return attribute;
	}
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	public Integer getBrNum() {
		return brNum;
	}

}
