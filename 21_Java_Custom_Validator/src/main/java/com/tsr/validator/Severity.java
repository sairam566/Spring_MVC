package com.tsr.validator;

import jakarta.validation.Payload;

public class Severity {
	public static interface ERROR extends Payload {
	}

	public static interface FATAL extends Payload {
	}
}
