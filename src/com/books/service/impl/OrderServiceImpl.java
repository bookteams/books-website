package com.books.service.impl;

import java.util.List;

import com.books.dao.OrderDao;
import com.books.dao.impl.OrderDaoImpl;
import com.books.model.Order;
import com.books.service.OrderService;

/**
* @ClassName: OrderServiceImpl
* @Description: 订单业务实现
* @author 李勇超
* @date 2018年12月20日下午3:33:57
*
*/
public class OrderServiceImpl implements OrderService{

	private OrderDao orderDao=new OrderDaoImpl();
	
	@Override
	public List<Order> selectOrderAll() {
		return orderDao.selectOrderAll();
	}

	@Override
	public int insertOrder(Order order) {
		return orderDao.insertOrder(order);
	}

	@Override
	public int updateOrderByboId(Order order) {
		return orderDao.updateOrderByboId(order);
	}

	@Override
	public int deleteOrderboId(Integer boId) {
		return orderDao.deleteOrderboId(boId);
	}

}
