package com.tsr.exceptions;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@Autowired
	private MessageSource messageSource;
	
	@ExceptionHandler(ProductInventoryException.class)
	public ModelAndView productFetchError() {
		ModelAndView view = new ModelAndView();
		System.out.println(Locale.getDefault().getDisplayName());
		//view.addObject("productFetch", messageSource.getMessage("product.fetch", null, Locale.getDefault()));
		view.setViewName("error");
		return view;
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView productNotFound() {
		ModelAndView view = new ModelAndView();
		System.out.println(Locale.getDefault().getDisplayName());
		//view.addObject("noProduct", messageSource.getMessage("no.product", null, Locale.getDefault()));
		view.setViewName("error");
		return view;
	}
}
