package com.javacode.Payment;

import com.javacode.Command;

public class Wallet implements Payment {
	private double amount;
	private Command command;
	public Wallet()
	{
		amount = 0;
	}
	@Override
	public void pay(double amount) {
		if(this.amount < amount)
			throw new IllegalArgumentException("Failed! you didn't have enough money in your wallet!");
		this.amount -= amount;
	}

	public void addFunds(CreditCard card, double funds) {
		amount += funds;
	}
}
