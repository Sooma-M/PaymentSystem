package com.javacode.UserFunctionallity.AddFunds;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FundsForm implements FormUI {
	private Command command;

	@Override
	public void setCommand(Command c) {
		this.command = c;
	}
	@Override

	public void getInfoFromUser() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount you want: ");
		double amount = in.nextDouble();
		while (amount <= 0){
			System.out.print("Please enter amount more than 0, amount: ");
			amount = in.nextDouble();
		}
		Map m = new HashMap<>();
		m.put("amount", amount);
		m.put("way","no change");
		m.put("form", this);
		try {
			command.execute(m);
			System.out.println("Success!");
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
