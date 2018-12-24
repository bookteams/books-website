   package com.books.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.books.model.Attribute;
import com.books.service.AttributeService;
import com.books.service.impl.AttributeServiceImpl;

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
	
	private AttributeService attributeService=new AttributeServiceImpl();
       
	public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ȥ���ݿ����������Ʒ �����Ƿŵ�request���� ����ת��
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(request.getParameter("password"));
		
		List<Attribute> selectAttributeAll = attributeService.selectAttributeAll();
		System.out.println(selectAttributeAll);
		HashMap<String, Attribute> map=new HashMap<String,Attribute>();
		for (Attribute attribute : selectAttributeAll) {
			map.put(String.valueOf(attribute.getBaId()), attribute);
		}
		JSONObject jsonObject=JSONObject.fromObject(map);
		response.getWriter().println(jsonObject);
		System.out.println(jsonObject);
		
		return null;
	}

}
