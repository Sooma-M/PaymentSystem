package com.PaymentApplication.UserFunctionallity.RefundRequest;

import com.PaymentApplication.AdminFunctionality.ManageRefunds.refundsRequestsModel;
import com.PaymentApplication.Exceptions.Sign.UserException;
import com.PaymentApplication.Exceptions.TransactionException;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.Transaction;
import com.PaymentApplication.User.TransactionRequest;

import java.util.ArrayList;
import java.util.HashMap;

public class RequestFunds implements IRefund {
	public void check() {
		if (!CurrentUser.checkUser())
			throw new UserException();
	}

	public ArrayList getTransactions() {
		check();
		ArrayList trans = (ArrayList) CurrentUser.getUser().getTransactions();
		return trans;
	}

	public String makeRequest(HashMap m) {
		check();
		Transaction transaction = null;
		for (Transaction trans : CurrentUser.getUser().getTransactions()) {
			if (trans.getService().equals(m.get("service-name")) && (trans.getAmount() == Double.parseDouble(m.get("amount").toString()))) {
				transaction = trans;
				break;
			}
		}
		//failed
		if (transaction == null)
			throw new TransactionException();

		//success -> save and request
		TransactionRequest t = new TransactionRequest(CurrentUser.getUser().getUsername(), transaction);
		CurrentUser.getUser().addRequest(t);
		refundsRequestsModel.getInstance().Subscribe(t);
		return "this request send to the admin successfully";
	}

	public ArrayList getRequests() {
		check();
		ArrayList trans = (ArrayList) CurrentUser.getUser().getRequests();
		return trans;
	}
}