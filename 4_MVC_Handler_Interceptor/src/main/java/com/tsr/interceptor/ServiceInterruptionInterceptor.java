package com.tsr.interceptor;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class ServiceInterruptionInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		LocalDateTime ldt = LocalDateTime.now();
		if(ldt.getHour()>1 && ldt.getHour()<2) {
			response.sendRedirect("site-maintenance.jsp");
			return false;
		}
		
		return true;
	}
	
}
