package com.tsr.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tsr.form.AccountForm;

@Component
public class OpenAccountFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(AccountForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		AccountForm form = (AccountForm) target;

		if (errors.hasFieldErrors("mobileNo") == false) {
			// make a db call to verify the mobileNo already registered into account table
			// or not
			if (form.getMobileNo().equals("0000000000")) {
				errors.rejectValue("mobileNo", "mobileNo.alreadyRegistered");
			}
		}
	}

}
