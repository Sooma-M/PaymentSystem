package com.javacode;

public class Transactions {
	private String type;
	private double amount;

	public Transactions(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}
}
