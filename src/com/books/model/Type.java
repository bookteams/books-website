package com.books.model;

/**
* @ClassName: Type
* @Description: ͼ�����
* @author ���³�
* @date 2018��11��18������4:04:48
*
*/
public class Type {
	
	
	private Integer btId;
	private String btName;
	
	public Type() {}
	
	public Type(Integer btId, String btName) {
		super();
		this.btId = btId;
		this.btName = btName;
	}
	public Integer getBtId() {
		return btId;
	}
	public void setBtId(Integer btId) {
		this.btId = btId;
	}
	public String getBtName() {
		return btName;
	}
	public void setBtName(String btName) {
		this.btName = btName;
	}
	
	
	

}
