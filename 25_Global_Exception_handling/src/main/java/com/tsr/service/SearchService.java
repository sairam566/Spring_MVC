package com.tsr.service;

import org.springframework.stereotype.Service;

import com.tsr.exceptions.ProductInventoryException;
import com.tsr.exceptions.ProductNotFoundException;
import com.tsr.form.SearchForm;

@Service
public class SearchService {

	public String getSearchProduct(SearchForm form) {

		if (form.getValue().equalsIgnoreCase("x")) {
			throw new ProductNotFoundException("No Such Product");
		}
		if(form.getValue().equalsIgnoreCase("y")) {
			throw new ProductInventoryException("Error failed to fetch Product");
		}
		return form.getValue();
	}
}
