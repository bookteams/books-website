package com.books.service.impl;

import java.util.List;

import com.books.dao.ConsumerDao;
import com.books.dao.impl.ConsumerDaoImpl;
import com.books.model.Consumer;
import com.books.service.ConsumerService;

/**
* @ClassName: ConsumerServiceImpl
* @Description: 用户业务实现
* @author 李勇超
* @date 2018年12月20日下午3:30:09
*
*/
public class ConsumerServiceImpl implements ConsumerService{

	private ConsumerDao consumerDao=new ConsumerDaoImpl();
	
	@Override
	public List<Consumer> selectConsumerAll() {
		return consumerDao.selectConsumerAll();
	}

	@Override
	public int insertConsumer(Consumer consumer) {
		return consumerDao.insertConsumer(consumer);
	}

	@Override
	public int updateConsumerBybcId(Consumer consumer) {
		return consumerDao.updateConsumerBybcId(consumer);
	}

	@Override
	public int deleteConsumerBybcId(Integer bcId) {
		return consumerDao.deleteConsumerBybcId(bcId);
	}

}
