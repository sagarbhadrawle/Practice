package com.masai;

import java.io.IOException;

import org.springframework.security.authentication.BadCredentialsException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RequestValidateFilter implements  Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		HttpServletRequest hs = (HttpServletRequest)request;
		HttpServletResponse rs = (HttpServletResponse) response;
		
		String header = hs.getHeader("Allow");
		
		if(header==null||header.equals("test")) {
			rs.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			throw new BadCredentialsException("header should contain key as allow adn value");
			
			
			
		}
		
		chain.doFilter(request, response);
		
		
	}
	

}
