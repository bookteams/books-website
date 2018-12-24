package com.books.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.books.model.Admin;
import com.books.service.AdminService;
import com.books.service.impl.AdminServiceImpl;

@WebServlet("/admin")
public class AdminServlet extends BaseServlet{
	
	private static final long serialVersionUID = 1L;
	
	private AdminService adminService=new AdminServiceImpl();
	
	 public String dologin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String bnName=request.getParameter("bnName");
			String bnPassword=request.getParameter("bnPassword");
			System.out.println(bnName);
			System.out.println(bnPassword);
	    	
			Admin loginAdmin = adminService.loginAdmin(bnName, bnPassword);
			if (loginAdmin!=null) {
				System.out.println("µÇÂ¼³É¹¦£¡£¡£¡");
			}else {
				System.out.println("µÇÂ¼Ê§°Ü£¡£¡£¡");
			}
	    	
			return null;

		}
		

}
