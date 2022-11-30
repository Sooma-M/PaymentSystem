package com.javacode.Payment;

import com.javacode.Command;

public class Wallet implements Payment {
	private double amount = 0;
	private Command command;

	@Override
	public void pay(double amount) {

	}

	public void addFunds(CreditCard card, double funds) {
		amount += funds;
	}
}
