package com.tsr;

import java.util.Date;
import java.util.Set;

import com.tsr.bean.Trip;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class App 
{
    public static void main( String[] args )
    {
    	Trip trip = Trip.builder().tripNo(123)
    			.tripName("s")
    			.source("Ogl")
    			.destination("Viz")
    			.tripPlannedDate(new Date())
    			.transportMode("Plain")
    			.amount(5600.0)
    			.build();
    	
    	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    	Validator validator = factory.getValidator();
    	System.out.println("Validator"+validator.getClass().getName());
    	
    	Set<ConstraintViolation<Trip>> constraintViolations = validator.validate(trip);
    	for(ConstraintViolation<Trip> violation : constraintViolations) {
    		System.out.println(violation.getMessage());
    	}
    }
}
