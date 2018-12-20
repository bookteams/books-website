package com.books.service;

import java.util.List;

import com.books.model.Attribute;

/**
* @ClassName: AttributeService
* @Description: 图书业务接口
* @author 李勇超
* @date 2018年12月20日下午3:11:13
*
*/
public interface AttributeService {

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
