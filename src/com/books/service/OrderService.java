package com.books.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.books.model.Order;

/**
* @ClassName: OrderService
* @Description: 订单业务接口
* @author 李勇超
* @date 2018年12月20日下午3:32:42
*
*/
public interface OrderService {
	
	//查询所有订单
	public List<Order> selectOrderAll();
	
	//增加
	public int insertOrder(Integer boId,Integer bcId,Date boTime,String boPay,String boRename,String boReaddr,String boReTel,
			BigDecimal boPrice,String boMemo);
	
	//通过boId修改
	public int updateOrderByboId(Integer boId,Integer bcId,Date boTime,String boPay,String boRename,String boReaddr,String boReTel,
			BigDecimal boPrice,String boMemo);
	
	//通过boId删除
	public int deleteOrderboId(Integer boId);

}
