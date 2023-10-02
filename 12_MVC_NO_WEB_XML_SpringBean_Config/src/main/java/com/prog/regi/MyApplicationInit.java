package com.prog.regi;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import com.config.MvcConfig;
import com.config.RootConfig;

public class MyApplicationInit extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext servletApplicationContext = new AnnotationConfigWebApplicationContext();
		servletApplicationContext.register(MvcConfig.class);
		return servletApplicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(RootConfig.class);
		return rootApplicationContext;
	}
	
	
}
