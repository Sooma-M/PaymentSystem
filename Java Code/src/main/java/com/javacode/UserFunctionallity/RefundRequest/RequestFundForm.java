package com.javacode.UserFunctionallity.RefundRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.Transaction;
import com.javacode.TransactionRequest;

public class RequestFundForm implements FormUI {
	private Command command;
	private List<Transaction> transactions;
	private List<TransactionRequest> req;
	public RequestFundForm(List<Transaction> t, List<TransactionRequest> r){transactions = t; req = r;}

	@Override
	public void getInfoFromUser() {
		System.out.println("Your transactions:");
		if (transactions.size() == 0) {
			System.out.println("No transactions yet!");
			return;
		}
		Scanner in = new Scanner(System.in);
		for(int i=0 ; i<transactions.size() ; i++)
			System.out.println((i+1) + ". Service: " +transactions.get(i).getType() + ", Amount: " +transactions.get(i).getAmount());
		System.out.println((transactions.size()+1) + ". Go to requests result");
		System.out.println((transactions.size()+2) + ". Back");
		System.out.print("choose which one you want to make refund on it: ");
		int choose = in.nextInt();
		while (choose <1 || choose> transactions.size()+2)
		{
			System.out.print("try again! choose: ");
			choose = in.nextInt();
		}
		if (choose == transactions.size()+2)
			return;
		if (choose == transactions.size()+1){
			printResult();
			return;
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
	public void printResult() {
		if (req.size() == 0)
			System.out.println("No requests yet!");
		System.out.println("Your requests :");
		for (TransactionRequest t : req)
			System.out.println("Service: " + t.getTransaction().getType() + ", Amount: " + t.getTransaction().getAmount()
			+ ", Result for this request: " + t.getState());
	}
	@Override
	public void setCommand(Command c) {
		this.command = c;
	}
}
