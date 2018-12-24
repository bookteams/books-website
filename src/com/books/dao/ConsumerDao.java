package com.books.dao;

import java.util.List;

import com.books.model.Consumer;

/**
* @ClassName: ConsumerDao
* @Description: �û��ӿ�
* @author ���³�
* @date 2018��12��19������5:35:41
*
*/
public interface ConsumerDao {
	
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
