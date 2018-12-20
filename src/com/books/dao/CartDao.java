package com.books.dao;

import java.util.List;

import com.books.model.Cart;

/**
* @ClassName: CartDao
* @Description: ���ﳵ�ӿ�
* @author ���³�
* @date 2018��12��19������5:11:15
*
*/
public interface CartDao {

	//����
	public int insertCart(Cart cart);
	
	//ͨ��brIdɾ��
	public int deleteCart(Integer brId);
	
	//ͨ��brId�޸�
	public int updateCart(Cart cart);
	
	//ͨ��bcId���в�ѯ
	public List<Cart> selectCartBybcId(Integer bcId);
}
