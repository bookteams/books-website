package com.books.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/user")
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
  
	public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		System.out.println("这是add方法");
		return null;

	}
	
public String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		System.out.println("这是delete方法");
		return null;

	}


	

}
