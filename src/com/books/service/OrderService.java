package com.books.service;

import java.math.BigDecimal;
import java.util.Date;
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
	public int insertOrder(Integer boId,Integer bcId,Date boTime,String boPay,String boRename,String boReaddr,String boReTel,
			BigDecimal boPrice,String boMemo);
	
	//ͨ��boId�޸�
	public int updateOrderByboId(Integer boId,Integer bcId,Date boTime,String boPay,String boRename,String boReaddr,String boReTel,
			BigDecimal boPrice,String boMemo);
	
	//ͨ��boIdɾ��
	public int deleteOrderboId(Integer boId);

}
