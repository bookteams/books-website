package com.books.dao;

import java.util.List;
import com.books.model.Type;

/**
* @ClassName: TypeDao
* @Description: ͼ�����ӿ�
* @author ���³�
* @date 2018��12��20������3:36:20
*
*/
public interface TypeDao {
	
	//���
	public int insertType(Type type);
	
	//�޸�
	public int updateType(Type type);
	
	//ɾ��
	public int deleteType(Integer btId);
	
	//�б��ѯ
    public List<Type> selectTypeAll();

}
