package com.books.dao;

import java.util.List;

import com.books.model.Consumer;

/**
* @ClassName: ConsumerDao
* @Description: 用户接口
* @author 李勇超
* @date 2018年12月19日下午5:35:41
*
*/
public interface ConsumerDao {
	
	//查询所有用户
	public List<Consumer> selectConsumerAll();
	
	//增加
	public int insertConsumer(Consumer consumer);
	
	//通过bcId修改
	public int updateConsumerBybcId(Consumer consumer);
	
	//通过bcId删除
	public int deleteConsumerBybcId(Integer bcId);
	
	//通过bcNickName和bcPassword进行登录
	public Consumer loginConsumer(String bcNickName,String bcPassword);
}
