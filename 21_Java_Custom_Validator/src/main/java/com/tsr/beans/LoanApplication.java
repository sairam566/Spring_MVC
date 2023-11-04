package com.tsr.beans;

import com.tsr.validator.AgricultureGroup;
import com.tsr.validator.AutomobileGroup;
import com.tsr.validator.GoldLoanGroup;
import com.tsr.validator.HomeLoanGroup;
import com.tsr.validator.LoanType;
import com.tsr.validator.Severity;

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
	
	//-------------AgricultureGroup --------------------//
	@NotBlank(message = "Crop Type cannot be blank",groups = {AgricultureGroup.class} )
	private String cropType;
	
	@Positive(message = "Acres should be non-zero positive number", groups = {AgricultureGroup.class},payload = {Severity.FATAL.class})
	@Min(value = 5,message = "Minimum of 5 acres land only eligible for loan" ,groups = {AgricultureGroup.class} ,payload = { Severity.ERROR.class })
	@Max(value = 20,message = "Maximum of 20 acres land only eligible for loan" ,groups = {AgricultureGroup.class}, payload = { Severity.ERROR.class })
	private int acres;
	
	//-------------AutomobileGroup --------------------//
	@NotBlank(message = "VehicleType cannot be blank", groups = {AutomobileGroup.class})
	private String vehicleType;
	
	@NotBlank(message = "Manufacturer cannot be blank", groups = { AutomobileGroup.class })
	private String manufacturer;
	
	//-------------GoldLoanGroup --------------------//
	@Positive(message = "grams should be non-zero positive integer", groups = { GoldLoanGroup.class })
	private int grams;
	
	@NotBlank(message = "purity cannot be blank", groups = { GoldLoanGroup.class })
	private String purity;
	
	//-------------HomeLoanGroup --------------------//
	@NotBlank(message = "propertyType cannot be blank", groups = { HomeLoanGroup.class })
	private String propertyType;
	
	@Positive(message = "sqYards should be non-zero positive integer", groups = { HomeLoanGroup.class })
	private int sqYards;
}
