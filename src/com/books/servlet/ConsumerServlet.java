package com.books.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.books.model.Consumer;
import com.books.service.ConsumerService;
import com.books.service.impl.ConsumerServiceImpl;

import net.sf.json.JSONObject;


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
			System.out.println("登录成功！！！");
		}else {
			System.out.println("登录失败！！！");
		}
    	
		return null;

	}
	
	//添加用户
	public String addConsumer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String bcNickname=request.getParameter("bcNickname");
		String bcPassword=request.getParameter("bcPassword");
		String bcName=request.getParameter("bcName");
		String bcSex=request.getParameter("bcSex");
		String bcTelphone=request.getParameter("bcTelphone");
		String bcAddress=request.getParameter("bcAddress");
		String bcState=request.getParameter("bcState");   //用户状态
		String bcImage=request.getParameter("bcImage"); 
		
		consumerService.insertConsumer(0, bcNickname, bcPassword, bcName, bcSex, bcTelphone, bcAddress, Integer.parseInt(bcState), bcImage);
		
		return null;

	}
	
	//删除用户
    public String deleteConsumer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    	String bcId=request.getParameter("bcId");
    	consumerService.deleteConsumerBybcId(Integer.parseInt(bcId));
		return null;

	}
    
    //修改用户
    public String updateConsumer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String bcId=request.getParameter("bcId");
    	String bcNickname=request.getParameter("bcNickname");
		String bcPassword=request.getParameter("bcPassword");
		String bcName=request.getParameter("bcName");
		String bcSex=request.getParameter("bcSex");
		String bcTelphone=request.getParameter("bcTelphone");
		String bcAddress=request.getParameter("bcAddress");
		String bcState=request.getParameter("bcState");   //用户状态
		String bcImage=request.getParameter("bcImage"); 
    	
    	consumerService.updateConsumerBybcId(Integer.parseInt(bcId), bcNickname, bcPassword, bcName, bcSex, bcTelphone, bcAddress, Integer.parseInt(bcState), bcImage);
		return null;

	}
    
    //查询所有用户
    public String selectAllConsumer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	
    	List<Consumer> selectConsumerAll = consumerService.selectConsumerAll();
    	HashMap<String, Consumer> map=new HashMap<String,Consumer>();
    	for (Consumer consumer : selectConsumerAll) {
			map.put("String.valueOf(consumer.getBcId())",consumer);
		}
		JSONObject jsonObject=JSONObject.fromObject(map);
		response.getWriter().println(jsonObject);
		return null;

	}

	

}
