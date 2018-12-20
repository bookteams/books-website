package com.books.dao;

import java.util.List;
import com.books.model.Type;

/**
* @ClassName: TypeDao
* @Description: 图书类别接口
* @author 李勇超
* @date 2018年12月20日下午3:36:20
*
*/
public interface TypeDao {
	
	//添加
	public int insertType(Type type);
	
	//修改
	public int updateType(Type type);
	
	//删除
	public int deleteType(Integer btId);
	
	//列表查询
    public List<Type> selectTypeAll();

}
