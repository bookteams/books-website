package com.books.dao.impl;

import java.util.List;

import com.books.dao.ConsumerDao;
import com.books.model.Consumer;
import com.books.util.SqlHelper;

/**
* @ClassName: ConsumerDaoImpl
* @Description: �û�����
* @author ���³�
* @date 2018��12��19������5:27:45
*
*/
public class ConsumerDaoImpl implements ConsumerDao {

	//��ѯ�����û�
	@Override
	public List<Consumer> selectConsumerAll(){
		return SqlHelper.executeQuery(Consumer.class, "select * from book_consumer");
	}
	
	//����
	@Override
	public int insertConsumer(Consumer consumer) {
		return SqlHelper.executeInsert("book_consumer", consumer);
	}
	
	//ͨ��bcId�޸�
	@Override
	public int updateConsumerBybcId(Consumer consumer) {
		return SqlHelper.executeUpdate("book_consumer", consumer, "where bcId="+consumer.getBcId());
	}
	
	//ͨ��bcIdɾ��
	@Override
	public int deleteConsumerBybcId(Integer bcId) {
		return SqlHelper.executeNoQuery("delete * from book_consumer where bcId="+bcId);
	}
	
	
}
