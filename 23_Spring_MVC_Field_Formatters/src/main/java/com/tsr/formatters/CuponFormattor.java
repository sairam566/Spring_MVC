package com.tsr.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.tsr.form.Coupon;

public class CuponFormattor implements Formatter<Coupon> {

	private String type;

	public CuponFormattor(String type) {
		this.type = type;
	}

	@Override
	public Coupon parse(String text, Locale locale) throws ParseException {
		String referal = null;
		String offerType = null;
		String appliedTo = null;

		if (text == null || text.isBlank()) {
			throw new ParseException("Coupon is Blank", 0);
		}
		if (type.equalsIgnoreCase("referal")) {
			if (text.trim().length() != 13) {
				throw new ParseException("Not a valid Referal Coupon", 0);
			}
			referal = text.substring(0, 5);
			offerType = text.substring(5, 10);
			appliedTo = text.substring(10, 13);

		} else if (type.equalsIgnoreCase("partner")) {
			if (text.trim().length() != 9) {
				throw new ParseException("Not a valid Partner Coupon", 0);
			}
			referal = text.substring(0, 3);
			offerType = text.substring(3, 7);
			appliedTo = text.substring(7, 9);
		}

		Coupon coupon = new Coupon();
		coupon.setReferal(referal);
		coupon.setOfferType(offerType);
		coupon.setAppliedTo(appliedTo);
		return coupon;
	}

	@Override
	public String print(Coupon object, Locale locale) {
		return object.getReferal()+object.getOfferType()+object.getAppliedTo();
	}

}
