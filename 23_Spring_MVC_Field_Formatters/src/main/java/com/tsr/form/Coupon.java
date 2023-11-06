package com.tsr.form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coupon {
	private String referal;
	private String offerType;
	private String appliedTo;

	@Override
	public String toString() {
		return referal + offerType + appliedTo;
	}
}
