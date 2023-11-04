package com.tsr;

import java.util.Set;

import com.tsr.beans.LoanApplication;
import com.tsr.validator.AgricultureGroup;
import com.tsr.validator.Severity;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Path.Node;
import jakarta.validation.Payload;
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
    			.acres(0)
    			.build();
    	
    	ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		
		Set<ConstraintViolation<LoanApplication>> constraintViolations = validator.validate(application,AgricultureGroup.class,Default.class);
		for(ConstraintViolation<LoanApplication> violation : constraintViolations) {
    		Set<Class<? extends Payload>> payloads = violation.getConstraintDescriptor().getPayload();
    		for (Class<? extends Payload> payload : payloads) {
    			if (payload == Severity.FATAL.class) {
    				System.out.println(violation.getConstraintDescriptor().getAnnotation().annotationType().getName());
    				for (Node node : violation.getPropertyPath()) {
						System.out.println(node.getName());
					}
    			}
    		}
			//System.out.println(violation.getMessage());
    	}
    }
}
