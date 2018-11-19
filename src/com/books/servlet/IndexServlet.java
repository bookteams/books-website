   package com.books.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;


/**
* @ClassName: IndexServlet
* @Description: 和首页相关的Servlet
* @author 李勇超
* @date 2018年11月17日上午9:32:09
*
*/
@WebServlet("/index")
public class IndexServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//去数据库查找热门商品 将他们放到request域中 请求转发
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(request.getParameter("password"));
		
		request.setAttribute("hello", "你好");
		
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("user", "user");
		map.put("list","list");
		
		JSONObject jsonObject=JSONObject.fromObject(map);
		
		System.out.println(jsonObject);
		
		request.setAttribute("jsonObject", jsonObject);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(jsonObject);
		
		//return "/jsp/index.jsp";
		return null;
	}

}
