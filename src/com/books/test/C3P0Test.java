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
			//2.�ӳ����л�ȡ����
			conn = C3P0Utils.getConnection();
			String sql = "INSERT INTO book_type VALUES(?,?)";
			pstmt = conn.prepareStatement(sql);
			//���ò���
			pstmt.setString(1, null);
			pstmt.setString(2, "�׶�ͼ��");
			//ִ�в������
			int rows = pstmt.executeUpdate();
			if(rows>0){
				System.out.println("���ݲ���ɹ���");
			}else{
				System.out.println("�������ʧ�ܣ�");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 


		
		
		
	}

}
