package com.books.service;

import java.util.List;

import com.books.dao.TypeDao;
import com.books.dao.impl.TypeDaoImpl;
import com.books.model.Type;

/**
* @ClassName: TypeService
* @Description: 图书类别业务接口
* @author 李勇超
* @date 2018年12月20日下午3:36:48
*
*/
public interface TypeService {

	//添加
	public int insertType(Type type);
	
	//修改
	public int updateType(Type type);
	
	//删除
	public int deleteType(Integer btId);
	
	//列表查询
    public List<Type> selectTypeAll();

	
}
