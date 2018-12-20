package com.books.service.impl;

import java.util.List;

import com.books.dao.CartDao;
import com.books.dao.impl.CartDaoImpl;
import com.books.model.Cart;
import com.books.service.CartService;

/**
* @ClassName: CartServiceImpl
* @Description: 购物车业务实现
* @author 李勇超
* @date 2018年12月20日下午3:20:06
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
