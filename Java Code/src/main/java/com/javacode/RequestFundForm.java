package com.javacode;

import java.util.HashMap;
import java.util.Map;

import com.javacode.Model.CurrentUser;
import com.javacode.Model.Transactions;

public class RequestFundForm implements FormUI {
	private Command command;

	@Override
	public void getInfoFromUser() {
		Map<String, Transactions> m = new HashMap<>();
		m.put(CurrentUser.getUser().getUsername(), CurrentUser.getUser().getTransactions());
		try {
			command.execute(m);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void setCommand(Command c) {
		this.command = c;
	}
}
