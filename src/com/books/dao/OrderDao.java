package com.books.dao;

import java.util.List;

import com.books.model.Order;

/**
* @ClassName: OrderDao
* @Description: 订单接口
* @author 李勇超
* @date 2018年12月19日下午10:08:59
*
*/
public interface OrderDao {
	
	//查询所有订单
	public List<Order> selectOrderAll();
	
	//增加
	public int insertOrder(Order order);
	
	//通过boId修改
	public int updateOrderByboId(Order order);
	
	//通过boId删除
	public int deleteOrderboId(Integer boId);

}
