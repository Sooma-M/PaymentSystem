package com.PaymentApplication.User;

public class Transaction {
	private String service;
	private double amount;

	public Transaction(String type, double amount) {
		this.service = type;
		this.amount = amount;
	}

	public String getService() {
		return service;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "{" +
				"service name='" + service + '\'' +
				", amount=" + amount +
				'}';
	}
}
