package com.tsr;

import java.util.Set;

import com.tsr.beans.LoanApplication;
import com.tsr.validator.AgricultureGroup;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.groups.Default;

public class App 
{
    public static void main( String[] args )
    {
    	LoanApplication application = LoanApplication.builder()
    			.loanApplicationNo(566)
    			.applicantName("Loan Manager")
    			.loanType("home")
    			.tenure(23)
    			.loanAmount(200000)
    			.emailAddress("tsr@gmailcom")
    			.contactNo("213265478")
    			.cropType("Wheet")
    			.acres(1)
    			.build();
    	
    	ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		
		Set<ConstraintViolation<LoanApplication>> constraintViolations = validator.validate(application,AgricultureGroup.class,Default.class);
		for(ConstraintViolation<LoanApplication> violation : constraintViolations) {
    		System.out.println(violation.getMessage());
    	}
    }
}
