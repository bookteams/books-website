package com.books.test;



import java.util.ArrayList;

import org.junit.Test;

import com.books.dao.TypeDao;
import com.books.model.Type;

/**
* @ClassName: TypeTest
* @Description: Type����
* @author ���³�
* @date 2018��11��19������8:35:11
*
*/
public class TypeTest {
    //��ѯ����
	@Test
	public void test() {
		TypeDao dao=new TypeDao();
		ArrayList<Type> aList=dao.getAllType();
		for (Type type : aList) {
			System.out.println(type.getBtId()+":"+type.getBtName());
		}
		System.out.println(aList);
		
	}
	//����
	@Test
	public void test1() {
		TypeDao dao=new TypeDao();
		Type type=new Type();
		type.setBtName("С˵");
		dao.insertType(type);
		
	}
	//ͨ��idɾ��
	@Test
	public void test2() {
		TypeDao dao=new TypeDao();
		dao.deleteTypeById(4);
		
	}
	//ͨ��id�޸�
	@Test
	public void test3() {
		TypeDao dao=new TypeDao();
		Type type=new Type();
		type.setBtId(3);
		type.setBtName("�׶�����");
		dao.updateTypeById(type);
		
	}
	
	

}