package com.tsr;

import java.util.Set;

import com.tsr.beans.LoanApplication;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class App 
{
    public static void main( String[] args )
    {
    	LoanApplication application = LoanApplication.builder()
    			.loanApplicationNo(566)
    			.applicantName("Loan Manager")
    			.loanType("home")
    			.tenure(24)
    			.loanAmount(200000)
    			.emailAddress("test@gmail.com")
    			.contactNo("213265478").build();
    	
    	ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		
		Set<ConstraintViolation<LoanApplication>> constraintViolations = validator.validate(application);
		for(ConstraintViolation<LoanApplication> violation : constraintViolations) {
    		System.out.println(violation.getMessage());
    	}
    }
}
