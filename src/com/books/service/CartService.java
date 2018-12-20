package com.books.service;

import java.util.List;

import com.books.model.Cart;

/**
* @ClassName: CartService
* @Description: ���ﳵҵ��ӿ�
* @author ���³�
* @date 2018��12��20������3:16:26
*
*/
public interface CartService {

	//����
	public int insertCart(Cart cart);
	
	//ͨ��brIdɾ��
	public int deleteCart(Integer brId);
	
	//ͨ��brId�޸�
	public int updateCart(Cart cart);
	
	//ͨ��bcId���в�ѯ
	public List<Cart> selectCartBybcId(Integer bcId);
}
