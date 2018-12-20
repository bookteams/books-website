package com.books.dao;

import java.util.List;

import com.books.model.Cart;

/**
* @ClassName: CartDao
* @Description: 购物车接口
* @author 李勇超
* @date 2018年12月19日下午5:11:15
*
*/
public interface CartDao {

	//增加
	public int insertCart(Cart cart);
	
	//通过brId删除
	public int deleteCart(Integer brId);
	
	//通过brId修改
	public int updateCart(Cart cart);
	
	//通过bcId进行查询
	public List<Cart> selectCartBybcId(Integer bcId);
}
