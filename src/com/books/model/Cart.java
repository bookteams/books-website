package com.books.model;

/**
* @ClassName: Cart
* @Description: ���ﳵ
* @author ���³�
* @date 2018��11��18������4:23:02
*
*/
public class Cart {

	private Integer brId;
	private Order order; //������
	private Attribute attribute; //ͼ����
	private Integer brNum; //��������
	private double brPrices; //�ܼ۸�
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
