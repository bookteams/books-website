package com.books.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

/**
* @ClassName: EncodingFilter
* @Description: ͳһ����
* @author ���³�
* @date 2018��11��17������10:28:29
*
*/
public class EncodingFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		//1.ǿת
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) resp;
		
		
		//2.����
		chain.doFilter(new MyRequest(request), response);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

}

//�̳�HttpServletRequestWrapperʵ��request�������ظ���ȡ
class MyRequest extends HttpServletRequestWrapper{

	private HttpServletRequest request;
	private boolean flag= true;

	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request=request;
		
	}

	@Override
	public String getParameter(String name) {
		
		if (name==null||name.trim().length()==0) {
			return null;
		}
		String[] values=getParameterValues(name);
		if (values==null||values.length==0) {
			return null;
		}
		
		return values[0];
	}

	
	/* (�� Javadoc)
	* <p>Title: getParameterMap</p>
	* <p>�����ж�����ʽ
	*    ��Ϊpost request.setCharacterEncoding("UTF-8");
	*    ��Ϊget ��map�е�ֵ��������Ϳ�����  </p>
	* @return
	* @see javax.servlet.ServletRequestWrapper#getParameterMap()
	*/
	@Override
	public Map<String, String[]> getParameterMap() {
		
		String method=request.getMethod();
		if ("post".equalsIgnoreCase(method)) {
			try {
				request.setCharacterEncoding("UTF-8");
				return request.getParameterMap();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}else if("get".equalsIgnoreCase(method)) {
			Map<String, String[]> map=request.getParameterMap();
			if(flag) {
				for(String key:map.keySet()) {
					String[] arr=map.get(key);
					//������������
					for(int i=0;i<arr.length;i++) {
						//����
						try {
							arr[i]=new String(arr[i].getBytes("iso8859-1"),"UTF-8");
						} catch (UnsupportedEncodingException e) {
							e.printStackTrace();
						}
					}
				}
				flag=false; //��ֹ��������
			}
			//��Ҫ����map�޸�value��ÿһ�����ݵı���
			return map;
		}
		
		return super.getParameterMap();
	}

	@Override
	public String[] getParameterValues(String name) {
		
		if(name==null||name.trim().length()==0) {
			return null;
		}
		Map<String, String[]> map=getParameterMap();
		if(map==null||map.size()==0) {
			return null;
		}
		
		return map.get(name);
	}
	
	
	
}

