package com.tsr.initailzer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.tsr.config.RootConfig;
import com.tsr.config.WebMVCConfig;

public class FSNVDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebMVCConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "*.htm" };
	}

}