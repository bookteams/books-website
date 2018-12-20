package com.books.service;

import java.util.List;

import com.books.model.Attribute;

/**
* @ClassName: AttributeService
* @Description: ͼ��ҵ��ӿ�
* @author ���³�
* @date 2018��12��20������3:11:13
*
*/
public interface AttributeService {

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
