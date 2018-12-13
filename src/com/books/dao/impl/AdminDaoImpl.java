package com.books.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.books.model.Admin;
import com.books.util.C3P0Utils;

/**
* @ClassName: AdminDaoImpl
* @Description: 管理员数据库操作
* @author 李勇超
* @date 2018年11月19日下午8:40:59
*
*/
public class AdminDaoImpl {
	
	private Connection conn=C3P0Utils.getConnection();
	private Statement st;
	private PreparedStatement ps;
	
	//插入
	public void insertAdmin(Admin admin) {
		
		try {
			ps=conn.prepareStatement("insert into book_admin values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, admin.getBnName());
			ps.setString(3, admin.getBnPassword());
			ps.executeUpdate();
			System.out.println(admin.getBnName()+",插入成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//通过id修改
	public void updateAdminById(Admin admin) {
		
		try {
			ps=conn.prepareStatement("update book_admin set bn_name=?,bn_password=? where bn_id=?");
			ps.setInt(1, admin.getBnId());
			ps.setString(2, admin.getBnName());
			ps.setString(3, admin.getBnPassword());
			ps.executeUpdate();
			System.out.println(admin.getBnName()+",修改成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//通过id删除
	public void deleteAdminById(Integer id) {
		try {
			ps=conn.prepareStatement("delete from book_admin where bn_id='"+id+"' ");
			ps.executeUpdate();
			System.out.println(id+",删除成功！！！");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
