package com.javacode;

import java.util.Map;

import com.javacode.Model.CurrentUser;

public class addFundsCommand implements Command {
	Command command;
	public addFundsCommand(Command c){command = c;}
	@Override
	public void execute(Map m) {
		command.execute(m);
		CurrentUser.getUser().getWallet().addFunds((double) m.get("amount"));
		
		FormUI form = (FormUI) m.get("form");
		if(form instanceof FundsForm)
			((FundsForm) form).printResult(CurrentUser.getUser().getWallet().getAmount());
	}

}
