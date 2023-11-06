package com.tsr.dto;

import java.util.Date;

import com.tsr.form.Coupon;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BookingDto {
	private String referenceNo;
	private String contactPerson;
	private String contactNo;
	private String restaurantName;
	private Date bookingDateTime;
	private Coupon coupon;
	
}
