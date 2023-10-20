package com.tsr.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class BusForm {
	private int busNo;
	private String busName;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate fromDate;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate toDate;
	private String mobileNo;
	private String emailAddress;
	
	public BusForm() {
		super();
	}

	public BusForm(int busNo, String busName, LocalDate fromDate, LocalDate toDate, String mobileNo,
			String emailAddress) {
		super();
		this.busNo = busNo;
		this.busName = busName;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "BusForm [busNo=" + busNo + ", busName=" + busName + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}
	
}
