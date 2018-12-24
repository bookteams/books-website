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
	public int insertConsumer(Integer bcId,String bcNickName,String bcPassword,String bcName,String bcSex,String bcTelphone,String bcAddress,Integer bcState,String bcImage);
	
	//ͨ��bcId�޸�
	public int updateConsumerBybcId(Integer bcId,String bcNickname,String bcPassword,String bcName,String bcSex,String bcTelphone,String bcAddress,Integer bcState,String bcImage);
	
	//ͨ��bcIdɾ��
	public int deleteConsumerBybcId(Integer bcId);
	
	//ͨ��bcNickName��bcPassword���е�¼
	public Consumer loginConsumer(String bcNickName,String bcPassword);
}
