package com.tsr.validator;


import java.util.stream.Stream;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class LoanTypeValidator implements ConstraintValidator<LoanType, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		String[] loanTypes = new String[] { "home", "personal", "automobile", "corporate", "industrial", "agriculture",
				"education", "MSME", "gold loan" };
		if(value!=null && value.isBlank()) {
			return false;
		}else {
			return Stream.of(loanTypes).anyMatch(loan->loan.equalsIgnoreCase(value));
		}
		
	}

}
