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
 * @Description: 图书类别数据库操作
 * @author 李勇超
 * @date 2018年11月19日下午8:24:56
 *
 */
public class TypeDao {

	private Connection conn = C3P0Utils.getConnection(); // 获取数据库连接池
	private Statement st;
	private PreparedStatement ps;

	// 查询所有的图书类别
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

	// 添加
	public void insertType(Type type) {

		try {
			ps = conn.prepareStatement("insert into book_type values(?,?)");
			ps.setInt(1, 0);
			ps.setString(2, type.getBtName());
			ps.executeUpdate();
			System.out.println("数据插入成功！！！");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 通过id删除
	public void deleteTypeById(Integer id) {

		try {
			ps = conn.prepareStatement("delete from book_type where bt_id="+id);
			ps.executeUpdate();
			System.out.println(id + "删除成功！！！");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 通过id进行修改
	public void updateTypeById(Type type) {

		try {
			ps = conn.prepareStatement("update book_type set bt_name=? where bt_id=?");
			ps.setString(1, type.getBtName());
			ps.setInt(2, type.getBtId());
			ps.executeUpdate();
			System.out.println(type.getBtId() + "修改成功！！！");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) {
		TypeDao typeDao=new TypeDao();
		
		
		//Type type=new Type();
		//type.setBtId(btId);
		//type.setBtName("儿童");
		
		//type.setBtId(4);
		//type.setBtName("儿童图书");
		
		//typeDao.insertType(type);
		//typeDao.updateTypeById(type);
		/*ArrayList<Type> allType = typeDao.getAllType();
		for (Type type2 : allType) {
			System.out.println(type2.getBtId()+","+type2.getBtName());
		}*/
		typeDao.deleteTypeById(4);
	}
		

}
