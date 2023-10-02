package com.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfig {
	
	@Bean
	public HandlerMapping handlerMapping() {
		SimpleUrlHandlerMapping simpleMapping = new SimpleUrlHandlerMapping();
		Properties properties = new Properties();
		properties.put("/home.htm", "index");
		simpleMapping.setMappings(properties);
		return simpleMapping;
	}
	
	@Bean
	public Controller index() {
		ParameterizableViewController viewcontroller = new ParameterizableViewController();
		viewcontroller.setViewName("index");
		return viewcontroller;
	}
	
	@Bean
	public ViewResolver getJSPViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
