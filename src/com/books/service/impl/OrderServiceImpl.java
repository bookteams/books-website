package com.books.service.impl;

import java.util.List;

import com.books.dao.OrderDao;
import com.books.dao.impl.OrderDaoImpl;
import com.books.model.Order;
import com.books.service.OrderService;

/**
* @ClassName: OrderServiceImpl
* @Description: ����ҵ��ʵ��
* @author ���³�
* @date 2018��12��20������3:33:57
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
