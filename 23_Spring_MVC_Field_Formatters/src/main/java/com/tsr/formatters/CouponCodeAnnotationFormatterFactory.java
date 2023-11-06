package com.tsr.formatters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import com.tsr.annotation.CouponCode;
import com.tsr.form.Coupon;

public class CouponCodeAnnotationFormatterFactory implements AnnotationFormatterFactory<CouponCode> {

	@Override
	public Set<Class<?>> getFieldTypes() {
		return new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {Coupon.class}));
	}

	@Override
	public Printer<?> getPrinter(CouponCode annotation, Class<?> fieldType) {
		CuponFormattor formattor = new CuponFormattor(annotation.type());
		return formattor;
	}

	@Override
	public Parser<?> getParser(CouponCode annotation, Class<?> fieldType) {
		CuponFormattor formattor = new CuponFormattor(annotation.type());
		return formattor;
	}

}
