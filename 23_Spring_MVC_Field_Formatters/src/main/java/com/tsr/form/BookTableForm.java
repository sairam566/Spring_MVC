package com.tsr.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.tsr.annotation.CouponCode;

import lombok.Data;

@Data
public class BookTableForm {
	
	@NotBlank
	private String customerName;
	
	@Min(value = 1)
	@Max(value = 15)
	private int persons;
	
	@FutureOrPresent
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date reservationDate;
	
	@NotBlank
	private String timeSlot;
	
	@NotBlank
	private String restaurantName;
	
	@NotBlank
	private String contactNo;
	
	@Email
	private String email;
	
	@NotBlank
	private String address;
	
	@NotNull
	@CouponCode(type = "partner")
	private Coupon coupon;
}
