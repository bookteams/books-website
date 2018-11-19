package com.books.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.books.util.C3P0Utils;

public class C3P0Test {

	@Test
	public void test() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//2.从池子中获取连接
			conn = C3P0Utils.getConnection();
			String sql = "INSERT INTO book_type VALUES(?,?)";
			pstmt = conn.prepareStatement(sql);
			//设置参数
			pstmt.setString(1, null);
			pstmt.setString(2, "幼儿图书");
			//执行插入操作
			int rows = pstmt.executeUpdate();
			if(rows>0){
				System.out.println("数据插入成功！");
			}else{
				System.out.println("数据添加失败！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 


		
		
		
	}

}
