package com.PaymentApplication.UserFunctionallity.RefundRequest;

import com.PaymentApplication.AdminFunctionality.ManageRefunds.refundsRequestsModel;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.Transaction;
import com.PaymentApplication.User.TransactionRequest;

import java.util.ArrayList;

public class RequestFundControl {
	public ArrayList getTransactions() {
		if (CurrentUser.getUser() == null)
			throw new IllegalArgumentException("You need to sign-in first!");
		ArrayList trans = new ArrayList();
		int cnt = 0;
		for (Transaction t : CurrentUser.getUser().getTransactions()) {
			trans.add("Transaction id: "+(cnt++) + ", provider: " + t.getType() + ", amount: " + t.getAmount());
		}
		return trans;
	}
	public String makeRequest(Integer id) {
		if (CurrentUser.getUser() == null)
			throw new IllegalArgumentException("You need to sign-in first!");
		TransactionRequest t = new TransactionRequest(CurrentUser.getUser().getUsername(),
				CurrentUser.getUser().getTransactions().get(id));
		CurrentUser.getUser().addRequest(t);
		refundsRequestsModel.getInstance().Subscribe(t);
		return "Success";
	}
	public ArrayList getRequests() {
		if (CurrentUser.getUser() == null)
			throw new IllegalArgumentException("You need to sign-in first!");
		ArrayList trans = new ArrayList();
		int cnt = 0;
		for (TransactionRequest t : CurrentUser.getUser().getRequests()) {
			trans.add("Request #: "+(cnt++) + ", provider: " + t.getTransaction().getType() + ", amount: " + t.getTransaction().getType());
		}
		return trans;
	}
}