package com.books.dao.impl;

import java.util.List;

import com.books.dao.AttributeDao;
import com.books.model.Attribute;
import com.books.util.SqlHelper;

/**
* @ClassName: AttributeDaoImpl
* @Description: 图书操作
* @author 李勇超
* @date 2018年12月19日下午4:47:15
*
*/
public class AttributeDaoImpl implements AttributeDao {

	//查询所有图书
	@Override
	public List<Attribute> selectAttributeAll(){
		return SqlHelper.executeQuery(Attribute.class, "select * from book_attribute");
	}
	
	//增加图书
	@Override
	public int insertAttribute(Attribute attribute) {
		return SqlHelper.executeInsert("book_attribute", attribute);
	}
	
	//修改图书
	@Override
	public int updateAttribute(Attribute attribute) {
		return SqlHelper.executeUpdate("book_attribute", attribute, "where baId="+attribute.getBaId());
	}
	
	//删除图书
	@Override
	public int deleteAttribute(Integer baId) {
		return SqlHelper.executeNoQuery("delete from book_attribute where baId="+baId);
	}
	
	//通过图书名查询
	@Override
	public List<Attribute> selectAttributeBybaName(String baName) {
		return SqlHelper.executeQuery(Attribute.class, "select book_attribute.* where baName='"+baName+"'");
	}
	
	
	
}
