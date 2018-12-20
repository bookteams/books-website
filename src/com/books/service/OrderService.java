package com.books.service;

import java.util.List;

import com.books.model.Order;

/**
* @ClassName: OrderService
* @Description: 订单业务接口
* @author 李勇超
* @date 2018年12月20日下午3:32:42
*
*/
public interface OrderService {
	
	//查询所有订单
	public List<Order> selectOrderAll();
	
	//增加
	public int insertOrder(Order order);
	
	//通过boId修改
	public int updateOrderByboId(Order order);
	
	//通过boId删除
	public int deleteOrderboId(Integer boId);

}
