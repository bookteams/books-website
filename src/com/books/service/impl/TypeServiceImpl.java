package com.books.service.impl;

import java.util.List;

import com.books.dao.TypeDao;
import com.books.dao.impl.TypeDaoImpl;
import com.books.model.Type;
import com.books.service.TypeService;

/**
* @ClassName: TypeServiceImpl
* @Description: ͼ�����ҵ��ʵ��
* @author ���³�
* @date 2018��12��20������3:38:43
*
*/
public class TypeServiceImpl implements TypeService{

	private TypeDao typeDao=new TypeDaoImpl();
	
	@Override
	public int insertType(Type type) {
		return typeDao.insertType(type);
	}

	@Override
	public int updateType(Type type) {
		return typeDao.updateType(type);
	}

	@Override
	public int deleteType(Integer btId) {
		return typeDao.deleteType(btId);
	}

	@Override
	public List<Type> selectTypeAll() {
		return typeDao.selectTypeAll();
	}

}
