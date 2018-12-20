package com.books.service.impl;

import java.util.List;

import com.books.dao.AttributeDao;
import com.books.dao.impl.AttributeDaoImpl;
import com.books.model.Attribute;
import com.books.service.AttributeService;
/**
* @ClassName: AttributeServiceImpl
* @Description: ͼ��ҵ��ӿ�ʵ��
* @author ���³�
* @date 2018��12��20������3:13:01
*
*/
public class AttributeServiceImpl implements AttributeService {

	private AttributeDao attributeDao=new AttributeDaoImpl();
	
	@Override
	public List<Attribute> selectAttributeAll() {
		return attributeDao.selectAttributeAll();
	}

	@Override
	public int insertAttribute(Attribute attribute) {
		return attributeDao.insertAttribute(attribute);
	}

	@Override
	public int updateAttribute(Attribute attribute) {
		return attributeDao.updateAttribute(attribute);
	}

	@Override
	public int deleteAttribute(Integer baId) {
		return attributeDao.deleteAttribute(baId);
	}

	@Override
	public List<Attribute> selectAttributeBybaName(String baName) {
		return attributeDao.selectAttributeBybaName(baName);
	}

}
