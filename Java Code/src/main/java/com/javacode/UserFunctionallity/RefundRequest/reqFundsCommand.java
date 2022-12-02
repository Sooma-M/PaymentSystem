package com.javacode.UserFunctionallity.RefundRequest;

import com.javacode.Command;
import com.javacode.Model.CurrentUser;
import com.javacode.TransactionRequest;
import com.javacode.Transaction;
import com.javacode.Model.refundsRequestsModel;

import java.util.List;
import java.util.Map;

public class reqFundsCommand implements Command {
	@Override
	public void execute(Map m) {
		TransactionRequest transactionRequest = new TransactionRequest(CurrentUser.getUser(), (Transaction) m.get("trans"));
		List<TransactionRequest> requestsList = refundsRequestsModel.getRequestsList();
		for (TransactionRequest t : requestsList)
			if (t.getTransaction().equals(m.get("trans")) && t.getUser().equals(CurrentUser.getUser()))
				throw new IllegalArgumentException("Failed! You made the same request before.");
		refundsRequestsModel.addRequest(transactionRequest);
	}
}