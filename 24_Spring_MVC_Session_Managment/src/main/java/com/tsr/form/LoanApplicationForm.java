package com.tsr.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

import com.tsr.validator.LoanInfoGroup;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanApplicationForm {
	@NotBlank
	private String applicationName;
	
	@NotBlank
	private String phoneNo;
	
	@Email
	private String email;
	
	@Future
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	
	@NotBlank
	private String gender;
	
	@NotBlank
	private String identificationType;
	
	@NotBlank
	private String identificationNo;
	
	@NotBlank(groups = {LoanInfoGroup.class})
	private String occupation;
	
	@NotBlank(groups = {LoanInfoGroup.class})
	private String company;
	
	@Min(value = 3,groups = {LoanInfoGroup.class})
	private int experience;
	
	@Min(value = 100000,groups = {LoanInfoGroup.class})
	private double grossSalary;
	
	@NotBlank(groups = {LoanInfoGroup.class})
	private String loanType;
	
	@Min(value = 300000,groups = {LoanInfoGroup.class})
	@Max(value = 6000000,groups = {LoanInfoGroup.class})
	@Positive(groups = {LoanInfoGroup.class})
	private double loanAmount;
	
	@Min(value = 5,groups = {LoanInfoGroup.class})
	@Max(value = 20,groups = {LoanInfoGroup.class})
	@Positive(groups = {LoanInfoGroup.class})
	private int tenure;
}
