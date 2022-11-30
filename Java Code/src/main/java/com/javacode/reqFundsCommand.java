package com.javacode;

import java.util.Map;

public class reqFundsCommand implements Command {
	@Override
	public void execute(Map m) {
		refundsRequestsModel.addRequestFund(m);
	}
}