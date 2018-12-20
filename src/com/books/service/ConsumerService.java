package com.books.service;

import java.util.List;

import com.books.model.Consumer;

/**
* @ClassName: ConsumerService
* @Description: 用户业务接口
* @author 李勇超
* @date 2018年12月20日下午3:28:52
*
*/
public interface ConsumerService {

	//查询所有用户
	public List<Consumer> selectConsumerAll();
	
	//增加
	public int insertConsumer(Consumer consumer);
	
	//通过bcId修改
	public int updateConsumerBybcId(Consumer consumer);
	
	//通过bcId删除
	public int deleteConsumerBybcId(Integer bcId);
}
