package com.tsr.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(value = { ElementType.FIELD, ElementType.PARAMETER })
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = LoanTypeValidator.class)
public @interface LoanType {
	String message() default "Loan Type is not valid";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
