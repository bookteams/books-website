package com.books.dao.impl;

import java.util.List;

import com.books.dao.TypeDao;
import com.books.model.Type;
import com.books.util.SqlHelper;

/**
 * @ClassName: TypeDaoImpl
 * @Description: ͼ��������ݿ����
 * @author ���³�
 * @date 2018��12��19������8:24:56
 *
 */
public class TypeDaoImpl implements TypeDao {
	
	//���
    @Override
	public int insertType(Type type) {	
		return SqlHelper.executeInsert("book_type", type);
	}
	
	//�޸�
    @Override
	public int updateType(Type type) {
		return SqlHelper.executeUpdate("book_type", type, "where btId="+type.getBtId());	
	}
	
	//ɾ��
    @Override
	public int deleteType(Integer btId) {
		return SqlHelper.executeNoQuery("delete from book_type where btId="+btId);
	}
    
    //�б��ѯ
    @Override
    public List<Type> selectTypeAll(){
    	return SqlHelper.executeQuery(Type.class, "select * from book_type");
    }	
}
