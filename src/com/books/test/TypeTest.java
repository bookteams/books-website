package com.books.test;



import java.util.ArrayList;

import org.junit.Test;

import com.books.dao.impl.TypeDaoImpl;
import com.books.model.Type;

/**
* @ClassName: TypeTest
* @Description: Type测试用例
* @author 李勇超
* @date 2018年11月19日下午8:35:11
*
*/
public class TypeTest {
    //查询所有
	@Test
	public void test() {
		TypeDaoImpl dao=new TypeDaoImpl();
		ArrayList<Type> aList=dao.getAllType();
		for (Type type : aList) {
			System.out.println(type.getBtId()+":"+type.getBtName());
		}
		System.out.println(aList);
		
	}
	//添加
	@Test
	public void test1() {
		TypeDaoImpl dao=new TypeDaoImpl();
		Type type=new Type();
		type.setBtName("小说");
		dao.insertType(type);
		
	}
	//通过id删除
	@Test
	public void test2() {
		TypeDaoImpl dao=new TypeDaoImpl();
		dao.deleteTypeById(4);
		
	}
	//通过id修改
	@Test
	public void test3() {
		TypeDaoImpl dao=new TypeDaoImpl();
		Type type=new Type();
		type.setBtId(3);
		type.setBtName("幼儿教育");
		dao.updateTypeById(type);
		
	}
	
	

}
