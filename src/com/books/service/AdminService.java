package com.books.service;

import com.books.model.Admin;

/**
* @ClassName: AdminService
* @Description: 管理员业务接口
* @author 李勇超
* @date 2018年12月20日上午7:38:11
*
*/
public interface AdminService {
	
	//登录
	public Admin loginAdmin(String bnName,String bnPassword);
		
	//添加
	public int insertAdmin(Admin admin);
		
	//修改
	public int updateAdmin(Admin admin);
		
	//删除
	public int deleteAdmin(Integer bnId);

}
