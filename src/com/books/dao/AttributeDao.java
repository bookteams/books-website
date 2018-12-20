package com.books.dao;

import java.util.List;

import com.books.model.Attribute;

/**
* @ClassName: AttributeDao
* @Description: ͼ������ӿ�
* @author ���³�
* @date 2018��12��19������4:59:29
*
*/
public interface AttributeDao {

	//��ѯ����ͼ��
	public List<Attribute> selectAttributeAll();
	
	//����ͼ��
	public int insertAttribute(Attribute attribute);
	
	//�޸�ͼ��
	public int updateAttribute(Attribute attribute);
	
	//ɾ��ͼ��
	public int deleteAttribute(Integer baId);
	
	//ͨ��ͼ������ѯ
	public List<Attribute> selectAttributeBybaName(String baName);
		
		
}
