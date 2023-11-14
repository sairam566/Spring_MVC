package com.tsr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsr.form.SearchForm;
import com.tsr.service.SearchService;

@Controller
@RequestMapping("/search.htm")
public class SearchController {
	
	@Autowired
	private SearchService searchService;
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping
	public String displaySearch(ModelMap modelMap) {
		SearchForm form = new SearchForm();
		modelMap.addAttribute("itemForm", form);
		return "search-product";
	}
	
	@PostMapping
	public String searchProduct(@ModelAttribute("itemForm") SearchForm form, BindingResult errors,ModelMap modelMap) {
		
		if(errors.hasErrors()) {
			return "search-product";
		}
		String product = searchService.getSearchProduct(form);
		modelMap.addAttribute("productName", product);
		return "display-product";
	}
	
}
