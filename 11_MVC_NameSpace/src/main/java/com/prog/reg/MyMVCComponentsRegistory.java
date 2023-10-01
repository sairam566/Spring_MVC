package com.prog.reg;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class MyMVCComponentsRegistory extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
		applicationContext.setConfigLocation("/WEB-INF/application-context.xml");
		return applicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext rootApplicationContext = new XmlWebApplicationContext();
		rootApplicationContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		return rootApplicationContext;
	}
	
}