package com.tsr.form;

public class BusDTO {
	private int busNo;
	private String busName;
	private String mobileNo;
	private String emailAddress;
	
	public BusDTO() {
		super();
	}

	public BusDTO(int busNo, String busName, String mobileNo, String emailAddress) {
		super();
		this.busNo = busNo;
		this.busName = busName;
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
		return "BusDTO [busNo=" + busNo + ", busName=" + busName + ", mobileNo=" + mobileNo + ", emailAddress="
				+ emailAddress + "]";
	}
}
