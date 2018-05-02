package cn.suimg.ls.filter;

import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 首页过滤器
 * @author suimg
 *
 */
public class IndexFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

    /**
     * 作用:当访问/结尾的目录的时候自动跳转到index.html  默认欢迎文件
     * @param servletRequest
     * @param servletResponse
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)  throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        String fullURL = request.getRequestURL().toString();
        //跳转欢迎文件
        if(StringUtils.endsWith(uri,"/")){
            response.sendRedirect(fullURL+"index.html");
            return;
        }
        chain.doFilter(request, response);
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		
	}

}
