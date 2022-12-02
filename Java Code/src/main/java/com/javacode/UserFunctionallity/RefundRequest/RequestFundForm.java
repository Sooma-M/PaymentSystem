package com.javacode.UserFunctionallity.RefundRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.Model.CurrentUser;
import com.javacode.Transaction;

public class RequestFundForm implements FormUI {
	private Command command;

	@Override
	public void getInfoFromUser() {
		List<Transaction> transactions = CurrentUser.getUser().getTransactions();
		System.out.println("Your transactions:");
		if (transactions.size() == 0) {
			System.out.println("No transactions yet!");
			return;
		}
		Scanner in = new Scanner(System.in);
		for(int i=0 ; i<transactions.size() ; i++)
			System.out.println((i+1) + ". Service: " +transactions.get(i).getType() + ", Amount: " +transactions.get(i).getAmount());
		System.out.print("choose which one you want to make refund on it: ");
		int choose = in.nextInt();
		while (choose <1 || choose> transactions.size())
		{
			System.out.print("try again! choose: ");
			choose = in.nextInt();
		}
		Map m = new HashMap<>();
		m.put("trans", transactions.get(choose-1));
		try {
			command.execute(m);
			System.out.println("Success!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void setCommand(Command c) {
		this.command = c;
	}
}
