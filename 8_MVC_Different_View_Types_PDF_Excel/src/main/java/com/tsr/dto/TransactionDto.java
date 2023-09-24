package com.tsr.dto;

import java.time.LocalDate;

public class TransactionDto {
	private String transactionRefNo;
	private LocalDate transactionDate;
	private double amount;
	private String transactionType;

	public TransactionDto() {
		super();
	}

	public TransactionDto(String transactionRefNo, LocalDate transactionDate, double amount, String transactionType) {
		this.transactionRefNo = transactionRefNo;
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.transactionType = transactionType;
	}

	public String getTransactionRefNo() {
		return transactionRefNo;
	}

	public void setTransactionRefNo(String transactionRefNo) {
		this.transactionRefNo = transactionRefNo;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

}
