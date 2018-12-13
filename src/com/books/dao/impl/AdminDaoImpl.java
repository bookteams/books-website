package com.books.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.books.model.Admin;
import com.books.util.C3P0Utils;

/**
* @ClassName: AdminDaoImpl
* @Description: ����Ա���ݿ����
* @author ���³�
* @date 2018��11��19������8:40:59
*
*/
public class AdminDaoImpl {
	
	private Connection conn=C3P0Utils.getConnection();
	private Statement st;
	private PreparedStatement ps;
	
	//����
	public void insertAdmin(Admin admin) {
		
		try {
			ps=conn.prepareStatement("insert into book_admin values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, admin.getBnName());
			ps.setString(3, admin.getBnPassword());
			ps.executeUpdate();
			System.out.println(admin.getBnName()+",����ɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//ͨ��id�޸�
	public void updateAdminById(Admin admin) {
		
		try {
			ps=conn.prepareStatement("update book_admin set bn_name=?,bn_password=? where bn_id=?");
			ps.setInt(1, admin.getBnId());
			ps.setString(2, admin.getBnName());
			ps.setString(3, admin.getBnPassword());
			ps.executeUpdate();
			System.out.println(admin.getBnName()+",�޸ĳɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//ͨ��idɾ��
	public void deleteAdminById(Integer id) {
		try {
			ps=conn.prepareStatement("delete from book_admin where bn_id='"+id+"' ");
			ps.executeUpdate();
			System.out.println(id+",ɾ���ɹ�������");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
