package com.books.service;

import java.util.List;

import com.books.dao.TypeDao;
import com.books.dao.impl.TypeDaoImpl;
import com.books.model.Type;

/**
* @ClassName: TypeService
* @Description: ͼ�����ҵ��ӿ�
* @author ���³�
* @date 2018��12��20������3:36:48
*
*/
public interface TypeService {

	//���
	public int insertType(Type type);
	
	//�޸�
	public int updateType(Type type);
	
	//ɾ��
	public int deleteType(Integer btId);
	
	//�б��ѯ
    public List<Type> selectTypeAll();

	
}
