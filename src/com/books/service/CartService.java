package com.books.service;

import java.util.List;

import com.books.model.Cart;

/**
* @ClassName: CartService
* @Description: 购物车业务接口
* @author 李勇超
* @date 2018年12月20日下午3:16:26
*
*/
public interface CartService {

	//增加
	public int insertCart(Cart cart);
	
	//通过brId删除
	public int deleteCart(Integer brId);
	
	//通过brId修改
	public int updateCart(Cart cart);
	
	//通过bcId进行查询
	public List<Cart> selectCartBybcId(Integer bcId);
}
