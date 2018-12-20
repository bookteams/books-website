package com.books.service;

import java.util.List;

import com.books.model.Order;

/**
* @ClassName: OrderService
* @Description: ����ҵ��ӿ�
* @author ���³�
* @date 2018��12��20������3:32:42
*
*/
public interface OrderService {
	
	//��ѯ���ж���
	public List<Order> selectOrderAll();
	
	//����
	public int insertOrder(Order order);
	
	//ͨ��boId�޸�
	public int updateOrderByboId(Order order);
	
	//ͨ��boIdɾ��
	public int deleteOrderboId(Integer boId);

}
