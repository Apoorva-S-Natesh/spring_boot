package filter_demo;

import java.io.IOException;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class Myfilter implements Filter{
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
  
		HttpServletRequest httpReq = (HttpServletRequest)request;
		System.out.println("Request is passing the filter1");
		System.out.println("URL requested: " + httpReq.getRequestURI());
		System.out.println("Before the chain.doFilter of 1");
		chain.doFilter(request, response);
		System.out.println("After the chain.doFilter of 1");
	}
}
