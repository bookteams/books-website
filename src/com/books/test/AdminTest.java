package com.books.test;


import org.junit.Test;

import com.books.model.Admin;
import com.books.service.AdminService;
import com.books.service.impl.AdminServiceImpl;

public class AdminTest {

	private AdminService adminService=new AdminServiceImpl();
	
	@Test
	public void test() {
		
		Admin admin=new Admin();
		admin.setBnName("yongchao");
		admin.setBnPassword("123456");
		adminService.insertAdmin(admin);
		
	}
	
	@Test
	public void test1() {
		
		Admin admin=new Admin();
		admin.setBnName("yongchao");
		admin.setBnPassword("123456");
		Admin loginAdmin = adminService.loginAdmin("yongchao", "123456");
		if(loginAdmin!=null)
		{
			System.out.println("µÇÂ¼³É¹¦£¡£¡£¡");
		}else {
			System.out.println("µÇÂ¼Ê§°Ü£¡£¡£¡");
		}
		
	}

}
