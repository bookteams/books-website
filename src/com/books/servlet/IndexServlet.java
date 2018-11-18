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
* @Description: ����ҳ��ص�Servlet
* @author ���³�
* @date 2018��11��17������9:32:09
*
*/
@WebServlet("/index")
public class IndexServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ȥ���ݿ����������Ʒ �����Ƿŵ�request���� ����ת��
		
		request.setAttribute("hello", "���");
		
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("user", "user");
		map.put("list","list");
		
		JSONObject jsonObject=JSONObject.fromObject(map);
		
		System.out.println(jsonObject);
		
		request.setAttribute("jsonObject", jsonObject);
		
		return "/jsp/index.jsp";
	}

}
