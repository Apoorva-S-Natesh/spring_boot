package filter_demo;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Order(1)
@Component
public class Myfilter3 {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
	  
	//HttpServletRequest httpReq = (HttpServletRequest)request;
	//System.out.println("Request is passing the filter3");
	//System.out.println("URL requested: " + httpReq.getRequestURI());
	System.out.println("Before the chain.doFilter of 3"); // Flow is decided based on alphabetical order or using @Order 
	chain.doFilter(request, response);
	System.out.println("After the chain.doFilter of 3");
	}
}
