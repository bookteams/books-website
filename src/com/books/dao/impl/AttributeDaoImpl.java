package com.books.dao.impl;

import java.util.List;

import com.books.dao.AttributeDao;
import com.books.model.Attribute;
import com.books.util.SqlHelper;

/**
* @ClassName: AttributeDaoImpl
* @Description: ͼ�����
* @author ���³�
* @date 2018��12��19������4:47:15
*
*/
public class AttributeDaoImpl implements AttributeDao {

	//��ѯ����ͼ��
	@Override
	public List<Attribute> selectAttributeAll(){
		return SqlHelper.executeQuery(Attribute.class, "select * from book_attribute");
	}
	
	//����ͼ��
	@Override
	public int insertAttribute(Attribute attribute) {
		return SqlHelper.executeInsert("book_attribute", attribute);
	}
	
	//�޸�ͼ��
	@Override
	public int updateAttribute(Attribute attribute) {
		return SqlHelper.executeUpdate("book_attribute", attribute, "where baId="+attribute.getBaId());
	}
	
	//ɾ��ͼ��
	@Override
	public int deleteAttribute(Integer baId) {
		return SqlHelper.executeNoQuery("delete from book_attribute where baId="+baId);
	}
	
	//ͨ��ͼ������ѯ
	@Override
	public List<Attribute> selectAttributeBybaName(String baName) {
		return SqlHelper.executeQuery(Attribute.class, "select book_attribute.* where baName='"+baName+"'");
	}
	
	
	
}
