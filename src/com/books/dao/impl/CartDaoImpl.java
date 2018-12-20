package com.books.dao.impl;

import java.util.List;

import com.books.dao.CartDao;
import com.books.model.Cart;
import com.books.util.SqlHelper;

/**
* @ClassName: CartDaoImpl
* @Description: 购物车操作
* @author 李勇超
* @date 2018年12月19日下午5:02:19
*
*/
public class CartDaoImpl implements CartDao {

	//增加
	@Override
	public int insertCart(Cart cart) {
		return SqlHelper.executeInsert("book_cart", cart);
	}
	
	//通过brId删除
	@Override
	public int deleteCart(Integer brId) {
		return SqlHelper.executeNoQuery("delete from book_cart where brTd="+brId);
	}
	
	//通过brId修改
	@Override
	public int updateCart(Cart cart) {
		return SqlHelper.executeUpdate("book_cart", cart, "where brId="+cart.getBrId());
	}
	
	//通过bcId进行查询
	@Override
	public List<Cart> selectCartBybcId(Integer bcId){
		return SqlHelper.executeQuery(Cart.class, "select book_cart.* where bcId="+bcId);
	}
	
	
}
