package com.books.model;

import java.math.BigDecimal;

/**
* @ClassName: Attribute
* @Description: 图书
* @author 李勇超
* @date 2018年11月18日下午4:06:58
*
*/
public class Attribute {
	
	private Integer baId;  //图书编号
	private String baName; //图书名称
	private String baAutor; //作者
	private Integer btId; //图书类型
	private Integer baStock; //库存量  
	private String baIsbn; //图书书号
	private String baIntroduction; //简介
	private String bapicture; //图片
	private Integer baState=0; //状态 0表示不是推荐 1表示推荐
	private Integer baFlag=0; //是否下架 1表示下架 0表示有库存
	private BigDecimal baPrice; //图书单价
	private BigDecimal baMprice; //图书市场价
	
	private Type type;
	
	public Attribute() {}
	
	public Attribute(Integer baId, String baName, String baAutor, Integer btId, Integer baStock, String baIsbn,
			String baIntroduction, String bapicture, Integer baState, Integer baFlag, BigDecimal baPrice,
			BigDecimal baMprice) {
		super();
		this.baId = baId;
		this.baName = baName;
		this.baAutor = baAutor;
		this.btId = btId;
		this.baStock = baStock;
		this.baIsbn = baIsbn;
		this.baIntroduction = baIntroduction;
		this.bapicture = bapicture;
		this.baState = baState;
		this.baFlag = baFlag;
		this.baPrice = baPrice;
		this.baMprice = baMprice;
	}
	public Integer getBtId() {
		return btId;
	}
	public void setBtId(Integer btId) {
		this.btId = btId;
	}
	public Integer getBaId() {
		return baId;
	}
	public void setBaId(Integer baId) {
		this.baId = baId;
	}
	public String getBaName() {
		return baName;
	}
	public void setBaName(String baName) {
		this.baName = baName;
	}
	public String getBaAutor() {
		return baAutor;
	}
	public void setBaAutor(String baAutor) {
		this.baAutor = baAutor;
	}
	public Integer getBaStock() {
		return baStock;
	}
	public void setBaStock(Integer baStock) {
		this.baStock = baStock;
	}
	public String getBaIsbn() {
		return baIsbn;
	}
	public void setBaIsbn(String baIsbn) {
		this.baIsbn = baIsbn;
	}
	public String getBaIntroduction() {
		return baIntroduction;
	}
	public void setBaIntroduction(String baIntroduction) {
		this.baIntroduction = baIntroduction;
	}
	public String getBapicture() {
		return bapicture;
	}
	public void setBapicture(String bapicture) {
		this.bapicture = bapicture;
	}
	public Integer getBaState() {
		return baState;
	}
	public void setBaState(Integer baState) {
		this.baState = baState;
	}
	public BigDecimal getBaPrice() {
		return baPrice;
	}
	public void setBaPrice(BigDecimal baPrice) {
		this.baPrice = baPrice;
	}
	public BigDecimal getBaMprice() {
		return baMprice;
	}
	public void setBaMprice(BigDecimal baMprice) {
		this.baMprice = baMprice;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Integer getBaFlag() {
		return baFlag;
	}
	public void setBaFlag(Integer baFlag) {
		this.baFlag = baFlag;
	}
	
}
