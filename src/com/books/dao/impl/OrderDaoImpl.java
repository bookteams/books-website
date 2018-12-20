package com.books.dao.impl;

import java.util.List;

import com.books.dao.OrderDao;
import com.books.model.Order;
import com.books.util.SqlHelper;

/**
* @ClassName: OrderDaoImpl
* @Description: 订单操作
* @author 李勇超
* @date 2018年12月19日下午9:32:19
*
*/
public class OrderDaoImpl implements OrderDao {

	//查询所有订单
	@Override
	public List<Order> selectOrderAll(){
		return SqlHelper.executeQuery(Order.class,"select * from book_order");
	}
	
	//增加
	@Override
	public int insertOrder(Order order) {
		return SqlHelper.executeInsert("book_order", order);
	}
	
	//通过boId修改
	@Override
	public int updateOrderByboId(Order order) {
		return SqlHelper.executeUpdate("book_order", order, "where boId="+order.getBoId());
	}
	
	//通过boId删除
	@Override
	public int deleteOrderboId(Integer boId) {
		return SqlHelper.executeNoQuery("delete from book_order where boId="+boId);
	}
	
	
	
}
