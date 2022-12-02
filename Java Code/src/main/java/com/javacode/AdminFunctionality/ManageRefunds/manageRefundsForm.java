package com.javacode.AdminFunctionality.ManageRefunds;

import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.TransactionRequest;

import java.util.*;

public class manageRefundsForm implements FormUI {
	private Command command;
	List<TransactionRequest> requestsList;
	public manageRefundsForm(List<TransactionRequest> req){this.requestsList = req;}
	@Override
	public void setCommand(Command c) {
		this.command = c;
	}

	@Override
	public void getInfoFromUser() {
		System.out.println("Refunds: ");
		if (requestsList.size() == 0) {
			System.out.println("No requests yet!");
			return;
		}
		Scanner in = new Scanner(System.in);
		List<Character> chooses = new ArrayList<>();
		char choose;
		for (int i=0 ; i<requestsList.size();i++) {
			System.out.println((i + 1) + ". Service: " + requestsList.get(i).getTransaction().getType() + ", Amount: "
				+ requestsList.get(i).getTransaction().getAmount());
			System.out.print("Are you accept? y/n :");
			choose = in.next().charAt(0);
			while (choose != 'y' && choose !='n')
			{
				System.out.print("Please enter y or n (y for yes and n for no) to continue : ");
				choose = in.next().charAt(0);
			}
			chooses.add(choose);

			System.out.print("Do you want to end this process? y/n :");
			choose = in.next().charAt(0);
			while (choose != 'y' && choose !='n')
			{
				System.out.print("Please enter y or n (y for yes and n for no) to continue : ");
				choose = in.next().charAt(0);
			}
			if (choose == 'y')
				break;
			else if (i == requestsList.size() - 1)
				System.out.println("List of requests is empty now, thank you.");
		}
		Map m = new HashMap<>();
		m.put("answer", chooses);
		command.execute(m);
	}

}
