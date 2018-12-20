package com.books.dao.impl;

import java.util.List;

import com.books.dao.CartDao;
import com.books.model.Cart;
import com.books.util.SqlHelper;

/**
* @ClassName: CartDaoImpl
* @Description: ���ﳵ����
* @author ���³�
* @date 2018��12��19������5:02:19
*
*/
public class CartDaoImpl implements CartDao {

	//����
	@Override
	public int insertCart(Cart cart) {
		return SqlHelper.executeInsert("book_cart", cart);
	}
	
	//ͨ��brIdɾ��
	@Override
	public int deleteCart(Integer brId) {
		return SqlHelper.executeNoQuery("delete from book_cart where brTd="+brId);
	}
	
	//ͨ��brId�޸�
	@Override
	public int updateCart(Cart cart) {
		return SqlHelper.executeUpdate("book_cart", cart, "where brId="+cart.getBrId());
	}
	
	//ͨ��bcId���в�ѯ
	@Override
	public List<Cart> selectCartBybcId(Integer bcId){
		return SqlHelper.executeQuery(Cart.class, "select book_cart.* where bcId="+bcId);
	}
	
	
}
