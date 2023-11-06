package com.tsr.validator;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tsr.form.BookTableForm;

@Component
public class BookTableFormValidator implements Validator {

	private final List<String> coupons = Arrays.asList(new String[] { "MO1233126", "SWI123", "ASSS2222" });

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(BookTableForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {

		BookTableForm bookTableForm = (BookTableForm) target;

		// check in DB
		if (!errors.hasFieldErrors("coupon")) {
			if (!coupons.stream().anyMatch(cop -> cop.equalsIgnoreCase(bookTableForm.getCoupon().toString()))) {
				errors.rejectValue("coupon", "coupon.notValid");
			}
		}
	}

}
