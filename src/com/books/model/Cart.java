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
	private Integer boId; //������
	private Integer baId; //ͼ����
	private Integer brNum; //��������
	private double brPrices; //�ܼ۸�
	public Integer getBrId() {
		return brId;
	}
	public void setBrId(Integer brId) {
		this.brId = brId;
	}
	public Integer getBoId() {
		return boId;
	}
	public void setBoId(Integer boId) {
		this.boId = boId;
	}
	public Integer getBaId() {
		return baId;
	}
	public void setBaId(Integer baId) {
		this.baId = baId;
	}
	public Integer getBrNum() {
		return brNum;
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
	
}
