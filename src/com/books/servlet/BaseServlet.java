package com.books.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
* @ClassName: BaseServlet
* @Description: ͨ�õ�Servlet
* @author ���³�
* @date 2018��11��16������9:16:52
*
*/
public class BaseServlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		try {
			
			//1.��ȡ����
			Class clazz=this.getClass();
			//System.out.println(this);
			
			//2.��ȡ����ķ���
			String m=request.getParameter("method");
			//System.out.println(m);
			
			if(m==null) {
				m="index";
			}
			
			
			//3.��ȡ��������
			Method method=clazz.getMethod(m, HttpServletRequest.class,HttpServletResponse.class);
			
			//4.�÷���ִ��  ����ֵΪ����ת����·��
			String s=(String) method.invoke(this,request,response); //�൱�� userservlet.add(request,response)
			
			//5.�ж�s�Ƿ�Ϊ��
			if(s!=null){
				request.getRequestDispatcher(s).forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return "null";
	}
	
}


