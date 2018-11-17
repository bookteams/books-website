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
* @Description: 统一编码
* @author 李勇超
* @date 2018年11月17日上午10:28:29
*
*/
public class EncodingFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		//1.强转
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) resp;
		
		
		//2.放行
		chain.doFilter(new MyRequest(request), response);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

}

//继承HttpServletRequestWrapper实现request中流的重复获取
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

	
	/* (非 Javadoc)
	* <p>Title: getParameterMap</p>
	* <p>首先判断请求方式
	*    若为post request.setCharacterEncoding("UTF-8");
	*    若为get 将map中的值遍历编码就可以了  </p>
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
					//继续遍历数组
					for(int i=0;i<arr.length;i++) {
						//编码
						try {
							arr[i]=new String(arr[i].getBytes("iso8859-1"),"UTF-8");
						} catch (UnsupportedEncodingException e) {
							e.printStackTrace();
						}
					}
				}
				flag=false; //防止反复请求
			}
			//需要遍历map修改value的每一个数据的编码
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

