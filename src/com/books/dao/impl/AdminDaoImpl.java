package com.books.dao.impl;

import com.books.dao.AdminDao;
import com.books.model.Admin;
import com.books.util.SqlHelper;

/**
* @ClassName: AdminDaoImpl
* @Description: 管理员数据库操作
* @author 李勇超
* @date 2018年12月19日下午8:40:59
*
*/
public class AdminDaoImpl implements AdminDao {
	
	   
		//登录
	    @Override
		public Admin loginAdmin(String bnName,String bnPassword) {
			return  SqlHelper.executeQueryOne(Admin.class, "select * from book_admin where bnName='"+bnName+"' and bnPassword='"+bnPassword+"'");
		}
			
		//添加
	    @Override
		public int insertAdmin(Admin admin) {	
			return SqlHelper.executeInsert("book_admin", admin);
		}
		
		//修改
	    @Override
		public int updateAdmin(Admin admin) {
			return SqlHelper.executeUpdate("book_admin", admin, "where bnId="+admin.getBnId());	
		}
		
		//删除
	    @Override
		public int deleteAdmin(Integer bnId) {
			return SqlHelper.executeNoQuery("delete from book_admin where bnId="+bnId);
		}

}
