package com.books.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.books.model.Order;
import com.books.service.OrderService;
import com.books.service.impl.OrderServiceImpl;

import net.sf.json.JSONObject;

@WebServlet("/order")
public class OrderServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;
	
	private OrderService orderService=new OrderServiceImpl();
	
	//添加订单
	public String addOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String boId=request.getParameter("boId");
		String bcId=request.getParameter("bcId");
		String boPay=request.getParameter("boPay");
		String boRename=request.getParameter("boRename");
		String boReaddr=request.getParameter("boReaddr");
		String boReTel=request.getParameter("boReTel");   
		String boPrice=request.getParameter("boPrice");
		String boMemo=request.getParameter("boMemo");
		orderService.insertOrder(Integer.parseInt(boId),Integer.parseInt(bcId),new Date(), boPay, boRename, boReaddr, boReTel,new BigDecimal(boPrice),boMemo);
		return null;

	}
	
	//删除订单
    public String deleteOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    	String boId=request.getParameter("boId");
    	orderService.deleteOrderboId(Integer.parseInt(boId));
		return null;

	}
    
    //修改订单
    public String updateOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	

		String boId=request.getParameter("boId");
		String bcId=request.getParameter("bcId");
		String boPay=request.getParameter("boPay");
		String boRename=request.getParameter("boRename");
		String boReaddr=request.getParameter("boReaddr");
		String boReTel=request.getParameter("boReTel");   
		String boPrice=request.getParameter("boPrice");
		String boMemo=request.getParameter("boMemo");
		orderService.updateOrderByboId(Integer.parseInt(boId),Integer.parseInt(bcId),new Date(), boPay, boRename, boReaddr, boReTel,new BigDecimal(boPrice),boMemo);
		return null;


	}
    
    //查询所有订单
    public String selectAllOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	
    	List<Order> selectOrderAll = orderService.selectOrderAll();
    	HashMap<String, Order> map=new HashMap<String,Order>();
    	for (Order order : selectOrderAll) {
			map.put(String.valueOf(order.getBoId()),order);
		}
		JSONObject jsonObject=JSONObject.fromObject(map);
		response.getWriter().println(jsonObject);
		return null;

	}

	

}
