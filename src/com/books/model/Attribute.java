package com.books.model;

/**
* @ClassName: Attribute
* @Description: ͼ��
* @author ���³�
* @date 2018��11��18������4:06:58
*
*/
public class Attribute {
	
	private Integer baId;  //ͼ����
	private String baName; //ͼ������
	private String baAutor; //����
	private Type type; //ͼ������
	private Integer baStock; //�����  
	private String baIsbn; //ͼ�����
	private String baIntroduction; //���
	private String bapicture; //ͼƬ
	private Integer baState=0; //״̬ 0��ʾ�����Ƽ� 1��ʾ�Ƽ�
	private Integer baFlag=0; //�Ƿ��¼� 1��ʾ�¼� 0��ʾ�п��
	private double baPrice; //ͼ�鵥��
	private double baMprice; //ͼ���г���
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
	public double getBaPrice() {
		return baPrice;
	}
	public void setBaPrice(double baPrice) {
		this.baPrice = baPrice;
	}
	public double getBaMprice() {
		return baMprice;
	}
	public void setBaMprice(double baMprice) {
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
