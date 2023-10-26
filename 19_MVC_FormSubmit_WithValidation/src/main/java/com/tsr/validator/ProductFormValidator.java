package com.tsr.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tsr.form.ProductForm;


@Component
public class ProductFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(ProductForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ProductForm productForm = null;

		productForm = (ProductForm) target;

		if (StringUtils.hasText(productForm.getProductName()) == false) {
			errors.rejectValue("productName", "productName.blank");
		}
		if (StringUtils.hasText(productForm.getDescription()) == false) {
			errors.rejectValue("description", "description.blank");
		}
		if (StringUtils.hasText(productForm.getManufacturer()) == false) {
			errors.rejectValue("manufacturer", "manufacturer.blank");
		}
		if (errors.hasFieldErrors("price") == false) {
			if (productForm.getPrice() <= 0) {
				errors.rejectValue("price", "price.notValid");
			}
		}
	}
}
