package com.books.dao;

import java.util.List;

import com.books.model.Order;

/**
* @ClassName: OrderDao
* @Description: �����ӿ�
* @author ���³�
* @date 2018��12��19������10:08:59
*
*/
public interface OrderDao {
	
	//��ѯ���ж���
	public List<Order> selectOrderAll();
	
	//����
	public int insertOrder(Order order);
	
	//ͨ��boId�޸�
	public int updateOrderByboId(Order order);
	
	//ͨ��boIdɾ��
	public int deleteOrderboId(Integer boId);

}
