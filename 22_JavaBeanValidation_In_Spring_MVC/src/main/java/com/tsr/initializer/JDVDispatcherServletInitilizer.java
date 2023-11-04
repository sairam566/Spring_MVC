package com.tsr.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.tsr.config.MVCConfig;
import com.tsr.config.RootConfig;

public class JDVDispatcherServletInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {MVCConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.htm"};
	}
	
}
