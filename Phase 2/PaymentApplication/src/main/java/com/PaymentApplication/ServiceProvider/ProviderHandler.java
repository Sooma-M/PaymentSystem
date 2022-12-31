package com.PaymentApplication.ServiceProvider;

import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.Transaction;

import java.util.Map;

public abstract class ProviderHandler{

    public void handleTheRequest(Map m) {
        //handle the request
    }

    public void saveTransaction(double amount) {
        //save transaction
        CurrentUser.getUser().addTransaction(new Transaction(CurrentService.getService().getName(), amount));
    }
}
