package com.books.dao.impl;

import com.books.dao.AdminDao;
import com.books.model.Admin;
import com.books.util.SqlHelper;

/**
* @ClassName: AdminDaoImpl
* @Description: ����Ա���ݿ����
* @author ���³�
* @date 2018��12��19������8:40:59
*
*/
public class AdminDaoImpl implements AdminDao {
	
	   
		//��¼
	    @Override
		public Admin loginAdmin(String bnName,String bnPassword) {
			return  SqlHelper.executeQueryOne(Admin.class, "select * from book_admin where bnName='"+bnName+"' and bnPassword='"+bnPassword+"'");
		}
			
		//���
	    @Override
		public int insertAdmin(Admin admin) {	
			return SqlHelper.executeInsert("book_admin", admin);
		}
		
		//�޸�
	    @Override
		public int updateAdmin(Admin admin) {
			return SqlHelper.executeUpdate("book_admin", admin, "where bnId="+admin.getBnId());	
		}
		
		//ɾ��
	    @Override
		public int deleteAdmin(Integer bnId) {
			return SqlHelper.executeNoQuery("delete from book_admin where bnId="+bnId);
		}

}
