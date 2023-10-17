package com.tsr.dto;

import java.time.LocalDate;

public class BusDTO {
	
	private int busNo;
	private String busModelNo;
	private String source;
	private String destination;
	private LocalDate manufacturedDate;
	
	public BusDTO() {
		super();
	}
	
	public BusDTO(int busNo, String busModelNo, String source, String destination, LocalDate manufacturedDate) {
		super();
		this.busNo = busNo;
		this.busModelNo = busModelNo;
		this.source = source;
		this.destination = destination;
		this.manufacturedDate = manufacturedDate;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusModelNo() {
		return busModelNo;
	}

	public void setBusModelNo(String busModelNo) {
		this.busModelNo = busModelNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	@Override
	public String toString() {
		return "BusDTO [busNo=" + busNo + ", busModelNo=" + busModelNo + ", source=" + source + ", destination="
				+ destination + ", manufacturedDate=" + manufacturedDate + "]";
	}
}
