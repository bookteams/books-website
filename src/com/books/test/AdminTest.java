package com.books.test;



import java.util.ArrayList;

import org.junit.Test;

import com.books.dao.impl.AdminDaoImpl;
import com.books.dao.impl.TypeDaoImpl;
import com.books.model.Admin;
import com.books.model.Type;
import com.books.util.MD5Utils;
import com.sun.javafx.sg.prism.web.NGWebView;

/**
* @ClassName: TypeTest
* @Description: Type��������
* @author ���³�
* @date 2018��11��19������8:35:11
*
*/
public class AdminTest {
    //��ѯ����
	@Test
	public void test() {
		TypeDaoImpl dao=new TypeDaoImpl();
		ArrayList<Type> aList=dao.getAllType();
		for (Type type : aList) {
			System.out.println(type.getBtId()+":"+type.getBtName());
		}
		System.out.println(aList);
		
	}
	//���
	@Test
	public void test1() {
		String password="liyongchao";
		AdminDaoImpl adminDao=new AdminDaoImpl();
		Admin admin=new Admin();
		admin.setBnName("admin1");
		admin.setBnPassword(MD5Utils.md5(password));
		adminDao.insertAdmin(admin);
		
	}
	//ͨ��idɾ��
	@Test
	public void test2() {
		AdminDaoImpl dao=new AdminDaoImpl();
		dao.deleteAdminById(2);
		
	}
	//ͨ��id�޸�
	@Test
	public void test3() {
		
		AdminDaoImpl adminDao=new AdminDaoImpl();
		Admin admin=new Admin();
		admin.setBnId(1);
		admin.setBnName("admin");
		admin.setBnPassword(MD5Utils.md5("admin"));
		adminDao.updateAdminById(admin);
	}
	
	

}
