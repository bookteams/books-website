package com.books.service.impl;

import java.util.List;

import com.books.dao.CartDao;
import com.books.dao.impl.CartDaoImpl;
import com.books.model.Cart;
import com.books.service.CartService;

/**
* @ClassName: CartServiceImpl
* @Description: ���ﳵҵ��ʵ��
* @author ���³�
* @date 2018��12��20������3:20:06
*
*/
public class CartServiceImpl implements CartService{

	private CartDao cartDao=new CartDaoImpl();
	
	@Override
	public int insertCart(Cart cart) {
		return cartDao.insertCart(cart);
	}

	@Override
	public int deleteCart(Integer brId) {
		return cartDao.deleteCart(brId);
	}

	@Override
	public int updateCart(Cart cart) {
		return cartDao.updateCart(cart);
	}

	@Override
	public List<Cart> selectCartBybcId(Integer bcId) {
		return cartDao.selectCartBybcId(bcId);
	}

}
