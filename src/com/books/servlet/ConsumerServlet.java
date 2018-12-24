package com.books.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.books.model.Consumer;
import com.books.service.ConsumerService;
import com.books.service.impl.ConsumerServiceImpl;


@WebServlet("/consumer")
public class ConsumerServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    private ConsumerService consumerService=new ConsumerServiceImpl();
	
    public String dologin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String bcNickName=request.getParameter("bcNickName");
		String bcPassword=request.getParameter("bcPassword");
		System.out.println(bcNickName);
		System.out.println(bcPassword);
    	
		Consumer loginConsumer = consumerService.loginConsumer(bcNickName,bcPassword);
		if (loginConsumer!=null) {
			System.out.println("��¼�ɹ�������");
		}else {
			System.out.println("��¼ʧ�ܣ�����");
		}
    	
		return null;

	}
	
	
	public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		System.out.println("����add����");
		return null;

	}
	
    public String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("����delete����");
		return null;

	}


	

}
