package com.books.service;

import java.util.List;

import com.books.model.Consumer;

/**
* @ClassName: ConsumerService
* @Description: �û�ҵ��ӿ�
* @author ���³�
* @date 2018��12��20������3:28:52
*
*/
public interface ConsumerService {

	//��ѯ�����û�
	public List<Consumer> selectConsumerAll();
	
	//����
	public int insertConsumer(Consumer consumer);
	
	//ͨ��bcId�޸�
	public int updateConsumerBybcId(Consumer consumer);
	
	//ͨ��bcIdɾ��
	public int deleteConsumerBybcId(Integer bcId);
	
	//ͨ��bcNickName��bcPassword���е�¼
	public Consumer loginConsumer(String bcNickName,String bcPassword);
}
