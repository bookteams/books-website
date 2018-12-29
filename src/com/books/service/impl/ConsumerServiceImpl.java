package com.books.service.impl;

import java.util.List;

import com.books.dao.ConsumerDao;
import com.books.dao.impl.ConsumerDaoImpl;
import com.books.model.Consumer;
import com.books.service.ConsumerService;
import com.books.util.MD5Utils;

/**
* @ClassName: ConsumerServiceImpl
* @Description: �û�ҵ��ʵ��
* @author ���³�
* @date 2018��12��20������3:30:09
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
		Consumer consumer=new Consumer(bcId,bcNickname,MD5Utils.md5(bcPassword),bcName,bcSex,
				bcTelphone,bcAddress,bcState,bcImage);
		return consumerDao.insertConsumer(consumer);
	}

	@Override
	public int updateConsumerBybcId(Integer bcId,String bcNickname,String bcPassword,String bcName,String bcSex,
			String bcTelphone,String bcAddress,Integer bcState,String bcImage) {
		Consumer consumer=new Consumer(bcId,bcNickname,MD5Utils.md5(bcPassword),bcName,bcSex,
				bcTelphone,bcAddress,bcState,bcImage);
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
