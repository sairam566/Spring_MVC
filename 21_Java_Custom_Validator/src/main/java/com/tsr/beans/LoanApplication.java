package com.tsr.beans;

import com.tsr.validator.LoanType;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoanApplication {
	
	@Positive(message = "Application No Can't be -ve number")
	private int loanApplicationNo;
	@NotBlank(message = "Application name cannot be empty")
	private String applicantName;
	
	@LoanType(message = "loanType should be one of these values: [home,automobile,agriculture,gold loan]")
	private String loanType;
	
	@Min(value = 12, message = "Tenure should be a minimum of 12 in months")
	@Max(value = 500, message = "Tenure cannot exceed a maximum of 600 months")
	private int tenure;
	
	@Min(value = 10000, message = "loanAmount should be a minimum of 10000 INR")
	@Max(value = 999999999, message = "loanAmount cannot exceed 999999999 INR")
	private double loanAmount;
	
	@Email(message = "emailAddress is not valid")
	private String emailAddress;
	
	@NotBlank(message = "contactNo cannot be blank")
	private String contactNo;
}
