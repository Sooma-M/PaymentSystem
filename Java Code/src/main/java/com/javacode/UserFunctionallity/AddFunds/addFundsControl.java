package com.javacode.UserFunctionallity.AddFunds;

import java.util.Map;

import com.javacode.Command;
import com.javacode.Model.CurrentUser;

public class addFundsControl implements Command {
	Command command;
	public addFundsControl(Command c){command = c;}
	@Override
	public void execute(Map m) {
		try {
			command.execute(m);
			CurrentUser.getUser().getWallet().addFunds((double) m.get("amount"));
		}catch (IllegalArgumentException ex){
			throw ex;
		}
	}

}
