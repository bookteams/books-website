package com.books.dao;

import com.books.model.Admin;

/**
* @ClassName: AdminDao
* @Description: 管理员操作接口
* @author 李勇超
* @date 2018年12月19日上午11:16:05
*
*/
public interface AdminDao {
	
	//登录
	public Admin loginAdmin(String bnName,String bnPassword);
	
	//添加
	public int insertAdmin(Admin admin);
	
	//修改
	public int updateAdmin(Admin admin);
	
	//删除
	public int deleteAdmin(Integer bnId);

}
