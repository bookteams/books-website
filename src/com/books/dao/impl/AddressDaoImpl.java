package com.books.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.books.model.Address;
import com.books.model.Type;
import com.books.util.C3P0Utils;

/**
* @ClassName: AddressDaoImpl
* @Description: 收货地址数据库操作
* @author 李勇超
* @date 2018年12月13日上午10:26:30
*
*/
public class AddressDaoImpl {
	
	private Connection conn = C3P0Utils.getConnection(); // 获取数据库连接池
	private Statement st;
	private PreparedStatement ps;

	// 查询用户所有的地址信息
	public ArrayList<Address> getAllAddress() {

		ArrayList<Address> aList = new ArrayList<Address>();

		try {
			st = conn.createStatement();
			ResultSet resultSet = st.executeQuery("select book_address.*,book_consumer.* from book_address,book_consumer where book_address.bc_id=book_consumer.bc_id");
			while (resultSet.next()) {
				Address address=new Address();
				address.setBsId(resultSet.getInt("bs_id"));
				address.setBcId(resultSet.getInt("bc_id"));
				address.setBsAddress(resultSet.getString("bs_address"));
				aList.add(address);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return aList;

	}

	// 添加地址
	public void insertAddress(Address address) {

		try {
			ps = conn.prepareStatement("insert into book_address values(?,?,?)");
			ps.setInt(1, 0);
			ps.setInt(2, address.getBcId());
			ps.setString(3, address.getBsAddress());
			ps.executeUpdate();
			System.out.println("数据插入成功！！！");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 通过bsId删除地址
	public void deleteAddressById(Integer bsId) {

		try {
			ps = conn.prepareStatement("delete from book_address where bs_id="+bsId);
			ps.executeUpdate();
			System.out.println(bsId + "删除成功！！！");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 通过bs_id进行修改地址
	public void updateAddressById(Address address) {

		try {
			ps = conn.prepareStatement("update book_address set bs_address=? where bs_id=?");
			ps.setString(1, address.getBsAddress());
			ps.setInt(2, address.getBsId());
			ps.executeUpdate();
			System.out.println(address.getBsId() + "修改成功！！！");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
}
