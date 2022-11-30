package com.javacode;

import java.util.HashMap;
import java.util.Map;

public class FundsForm implements FormUI {
	private double amount;
	private Command command;

	@Override
	public void setCommand(Command c) {
		this.command = c;
	}
	@Override
	public void getInfoFromUser() {
		Map<String, Double> m = new HashMap<>();
		m.put("amount", amount);
		try {
			command.execute(m);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
