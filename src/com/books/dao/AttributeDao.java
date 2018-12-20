package com.books.dao;

import java.util.List;

import com.books.model.Attribute;

/**
* @ClassName: AttributeDao
* @Description: 图书操作接口
* @author 李勇超
* @date 2018年12月19日下午4:59:29
*
*/
public interface AttributeDao {

	//查询所有图书
	public List<Attribute> selectAttributeAll();
	
	//增加图书
	public int insertAttribute(Attribute attribute);
	
	//修改图书
	public int updateAttribute(Attribute attribute);
	
	//删除图书
	public int deleteAttribute(Integer baId);
	
	//通过图书名查询
	public List<Attribute> selectAttributeBybaName(String baName);
		
		
}
