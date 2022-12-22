package com.javacode.UserFunctionallity.AddFunds;

import java.util.Map;

import com.javacode.Controller;
import com.javacode.Model.CurrentUser;

public class addFundsControl implements Controller {
	Controller controller;
	public addFundsControl(Controller c){controller = c;}
	@Override
	public void execute(Map m) {
		try {
			controller.execute(m);
			CurrentUser.getUser().getWallet().addFunds((double) m.get("amount"));
		}catch (IllegalArgumentException ex){
			throw ex;
		}
	}

}
