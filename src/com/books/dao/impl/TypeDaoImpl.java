package com.books.dao.impl;

import java.util.List;

import com.books.dao.TypeDao;
import com.books.model.Type;
import com.books.util.SqlHelper;

/**
 * @ClassName: TypeDaoImpl
 * @Description: 图书类别数据库操作
 * @author 李勇超
 * @date 2018年12月19日下午8:24:56
 *
 */
public class TypeDaoImpl implements TypeDao {
	
	//添加
    @Override
	public int insertType(Type type) {	
		return SqlHelper.executeInsert("book_type", type);
	}
	
	//修改
    @Override
	public int updateType(Type type) {
		return SqlHelper.executeUpdate("book_type", type, "where btId="+type.getBtId());	
	}
	
	//删除
    @Override
	public int deleteType(Integer btId) {
		return SqlHelper.executeNoQuery("delete from book_type where btId="+btId);
	}
    
    //列表查询
    @Override
    public List<Type> selectTypeAll(){
    	return SqlHelper.executeQuery(Type.class, "select * from book_type");
    }	
}
