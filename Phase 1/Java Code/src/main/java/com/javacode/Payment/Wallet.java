package com.javacode.Payment;

public class Wallet implements Payment {
	private double amount;

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

	public void addFunds(double funds) {
		amount += funds;
	}

	public double getAmount() {return amount;}
}
