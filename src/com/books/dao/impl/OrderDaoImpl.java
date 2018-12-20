package com.books.dao.impl;

import java.util.List;

import com.books.dao.OrderDao;
import com.books.model.Order;
import com.books.util.SqlHelper;

/**
* @ClassName: OrderDaoImpl
* @Description: ��������
* @author ���³�
* @date 2018��12��19������9:32:19
*
*/
public class OrderDaoImpl implements OrderDao {

	//��ѯ���ж���
	@Override
	public List<Order> selectOrderAll(){
		return SqlHelper.executeQuery(Order.class,"select * from book_order");
	}
	
	//����
	@Override
	public int insertOrder(Order order) {
		return SqlHelper.executeInsert("book_order", order);
	}
	
	//ͨ��boId�޸�
	@Override
	public int updateOrderByboId(Order order) {
		return SqlHelper.executeUpdate("book_order", order, "where boId="+order.getBoId());
	}
	
	//ͨ��boIdɾ��
	@Override
	public int deleteOrderboId(Integer boId) {
		return SqlHelper.executeNoQuery("delete from book_order where boId="+boId);
	}
	
	
	
}
