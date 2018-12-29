package com.books.service.impl;

import java.math.BigDecimal;
import java.util.Date;
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
	public int insertOrder(Integer boId,Integer bcId,Date boTime,String boPay,String boRename,String boReaddr,String boReTel,
			BigDecimal boPrice,String boMemo) {
		Order order=new Order(boId,bcId,boTime,boPay,boRename,boReaddr,boReTel,boPrice,boMemo);
		return orderDao.insertOrder(order);
	}

	@Override
	public int updateOrderByboId(Integer boId,Integer bcId,Date boTime,String boPay,String boRename,String boReaddr,String boReTel,
			BigDecimal boPrice,String boMemo) {
		Order order=new Order(boId,bcId,boTime,boPay,boRename,boReaddr,boReTel,boPrice,boMemo);
		return orderDao.updateOrderByboId(order);
	}

	@Override
	public int deleteOrderboId(Integer boId) {
		return orderDao.deleteOrderboId(boId);
	}

}
