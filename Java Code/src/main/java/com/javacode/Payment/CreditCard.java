package com.javacode.Payment;

import java.util.Scanner;

public class CreditCard implements Payment {
    @Override
    public void pay(double amount){
		Scanner in = new Scanner(System.in);
		System.out.println("the amount: " + amount);
		System.out.print("Credit Card Number: ");
		String num = in.nextLine();
		System.out.print("Password: ");
		String password = in.nextLine();
	}
}
