package com.books.service.impl;

import java.util.List;

import com.books.dao.ConsumerDao;
import com.books.dao.impl.ConsumerDaoImpl;
import com.books.model.Consumer;
import com.books.service.ConsumerService;
import com.books.util.MD5Utils;

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
	public int insertConsumer(Integer bcId,String bcNickname,String bcPassword,String bcName,String bcSex,
			String bcTelphone,String bcAddress,Integer bcState,String bcImage) {
		Consumer consumer=new Consumer();
		consumer.setBcId(bcId);
		consumer.setBcNickName(bcNickname);
		consumer.setBcPassword(MD5Utils.md5(bcPassword));
		consumer.setBcName(bcName);
		consumer.setBcSex(bcSex);
		consumer.setBcTelphone(bcTelphone);
		consumer.setBcAddress(bcAddress);
		consumer.setBcState(bcState);
		consumer.setBcImage(bcImage);
		return consumerDao.insertConsumer(consumer);
	}

	@Override
	public int updateConsumerBybcId(Integer bcId,String bcNickName,String bcPassword,String bcName,String bcSex,
			String bcTelphone,String bcAddress,Integer bcState,String bcImage) {
		Consumer consumer=new Consumer();
		consumer.setBcId(bcId);
		consumer.setBcNickName(bcNickName);
		consumer.setBcPassword(MD5Utils.md5(bcPassword));
		consumer.setBcName(bcName);
		consumer.setBcSex(bcSex);
		consumer.setBcTelphone(bcTelphone);
		consumer.setBcAddress(bcAddress);
		consumer.setBcState(bcState);
		consumer.setBcImage(bcImage);
		return consumerDao.updateConsumerBybcId(consumer);
	}

	@Override
	public int deleteConsumerBybcId(Integer bcId) {
		return consumerDao.deleteConsumerBybcId(bcId);
	}

	@Override
	public Consumer loginConsumer(String bcNickName, String bcPassword) {
		String bcPassword1=MD5Utils.md5(bcPassword); 
		return consumerDao.loginConsumer(bcNickName, bcPassword1);
	}

}
