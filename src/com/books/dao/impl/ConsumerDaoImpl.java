package com.books.dao.impl;

import java.util.List;

import com.books.dao.ConsumerDao;
import com.books.model.Consumer;
import com.books.util.SqlHelper;

/**
* @ClassName: ConsumerDaoImpl
* @Description: 用户操作
* @author 李勇超
* @date 2018年12月19日下午5:27:45
*
*/
public class ConsumerDaoImpl implements ConsumerDao {

	//查询所有用户
	@Override
	public List<Consumer> selectConsumerAll(){
		return SqlHelper.executeQuery(Consumer.class, "select * from book_consumer");
	}
	
	//增加
	@Override
	public int insertConsumer(Consumer consumer) {
		return SqlHelper.executeInsert("book_consumer", consumer);
	}
	
	//通过bcId修改
	@Override
	public int updateConsumerBybcId(Consumer consumer) {
		return SqlHelper.executeUpdate("book_consumer", consumer, "where bcId="+consumer.getBcId());
	}
	
	//通过bcId删除
	@Override
	public int deleteConsumerBybcId(Integer bcId) {
		return SqlHelper.executeNoQuery("delete * from book_consumer where bcId="+bcId);
	}
	
	
}
