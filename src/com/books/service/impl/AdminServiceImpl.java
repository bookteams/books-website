package com.books.service.impl;

import com.books.dao.AdminDao;
import com.books.dao.impl.AdminDaoImpl;
import com.books.model.Admin;
import com.books.service.AdminService;
import com.books.util.MD5Utils;

/**
* @ClassName: AdminServiceImpl
* @Description: ����Աҵ��ʵ��
* @author ���³�
* @date 2018��12��20������7:37:40
*
*/
public class AdminServiceImpl  implements AdminService{

	AdminDao adminDao=new AdminDaoImpl();
	
	@Override
	public Admin loginAdmin(String bnName, String bnPassword) {
		String bnPassword1=MD5Utils.md5(bnPassword);
		return adminDao.loginAdmin(bnName, bnPassword1);
	}

	@Override
	public int insertAdmin(Admin admin) {
		admin.setBnPassword(MD5Utils.md5(admin.getBnPassword()));
		return adminDao.insertAdmin(admin);
	}

	@Override
	public int updateAdmin(Admin admin) {
		return adminDao.updateAdmin(admin);
	}

	@Override
	public int deleteAdmin(Integer bnId) {
		return adminDao.deleteAdmin(bnId);
	}

}
