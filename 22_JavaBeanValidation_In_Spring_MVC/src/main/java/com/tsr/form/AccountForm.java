package com.tsr.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;

import lombok.Builder;
import lombok.Data;

@Data
public class AccountForm {
	
	@NotBlank
	@Length(min = 10,max = 12)
	private String mobileNo;
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
	@Email
	private String emailAddress;
	
	@Past
	private Date dob;
	
	@NotBlank
	private String gender;
	
	@NotBlank
	@Length(min = 10,max = 10)
	private String panNo;
}
