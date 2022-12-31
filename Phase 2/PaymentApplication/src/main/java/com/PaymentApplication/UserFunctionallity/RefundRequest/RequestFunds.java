package com.PaymentApplication.UserFunctionallity.RefundRequest;

import com.PaymentApplication.AdminFunctionality.ManageRefunds.refundsRequestsModel;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.Transaction;
import com.PaymentApplication.User.TransactionRequest;

import java.util.ArrayList;
import java.util.HashMap;

public class RequestFunds implements IRefund {
	public void makeRequest(HashMap m) {
		CurrentUser.checkUser();
		Transaction transaction = null;
		for (Transaction trans : CurrentUser.getUser().getTransactions()) {
			if (trans.getService().equals(m.get("service-name")) && (trans.getAmount() == Double.parseDouble(m.get("amount").toString()))) {
				transaction = trans;
				break;
			}
		}
		//failed
		if (transaction == null)
			throw new IllegalArgumentException("you didn't have any transaction with this specifications, try again");

		//success -> save and request
		TransactionRequest t = new TransactionRequest(CurrentUser.getUser().getUsername(), transaction);
		CurrentUser.getUser().addRequest(t);
		refundsRequestsModel.getInstance().Subscribe(t);
	}

	public ArrayList getRequests() {
		CurrentUser.checkUser();
		ArrayList trans = (ArrayList) CurrentUser.getUser().getRequests();
		return trans;
	}
}