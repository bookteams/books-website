package com.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.books.model.Type;
import com.books.util.C3P0Utils;

/**
 * @ClassName: TypeDao
 * @Description: ͼ��������ݿ����
 * @author ���³�
 * @date 2018��11��19������8:24:56
 *
 */
public class TypeDao {

	private Connection conn = C3P0Utils.getConnection(); // ��ȡ���ݿ����ӳ�
	private Statement st;
	private PreparedStatement ps;

	// ��ѯ���е�ͼ�����
	public ArrayList<Type> getAllType() {

		ArrayList<Type> tList = new ArrayList<Type>();

		try {
			st = conn.createStatement();
			ResultSet resultSet = st.executeQuery("select * from book_type");
			while (resultSet.next()) {
				Type type = new Type();
				type.setBtId(resultSet.getInt(1));
				type.setBtName(resultSet.getString(2));
				tList.add(type);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return tList;

	}

	// ���
	public void insertType(Type type) {

		try {
			ps = conn.prepareStatement("insert into book_type values(?,?)");
			ps.setInt(1, 0);
			ps.setString(2, type.getBtName());
			ps.executeUpdate();
			System.out.println("���ݲ���ɹ�������");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// ͨ��idɾ��
	public void deleteTypeById(Integer id) {

		try {
			ps = conn.prepareStatement("delete from book_type where bt_id="+id);
			ps.executeUpdate();
			System.out.println(id + "ɾ���ɹ�������");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ͨ��id�����޸�
	public void updateTypeById(Type type) {

		try {
			ps = conn.prepareStatement("update book_type set bt_name=? where bt_id=?");
			ps.setString(1, type.getBtName());
			ps.setInt(2, type.getBtId());
			ps.executeUpdate();
			System.out.println(type.getBtId() + "�޸ĳɹ�������");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) {
		TypeDao typeDao=new TypeDao();
		
		
		//Type type=new Type();
		//type.setBtId(btId);
		//type.setBtName("��ͯ");
		
		//type.setBtId(4);
		//type.setBtName("��ͯͼ��");
		
		//typeDao.insertType(type);
		//typeDao.updateTypeById(type);
		/*ArrayList<Type> allType = typeDao.getAllType();
		for (Type type2 : allType) {
			System.out.println(type2.getBtId()+","+type2.getBtName());
		}*/
		typeDao.deleteTypeById(4);
	}
		

}
