package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.AdminFunctionality.Discounts.ApplyDiscount;
import com.PaymentApplication.ServiceProvider.CurrentService;
import com.PaymentApplication.User.Transaction;
import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class PaymentController{
    public void execute(String way, HashMap m){
        if (CurrentUser.getUser() == null)
            throw new IllegalArgumentException("You need to sign-in first!");
        if (CurrentService.getService() == null)
            throw new IllegalArgumentException("You need to select service provider first!");
        if (way.toLowerCase().equals("cache") && !CurrentService.getService().getCacheAccept())
            throw new IllegalArgumentException("This service doesn't accept cache! choose another payment way");
        Payment payment = PaymentFactory.createPayment(way);
        if (payment == null)
            throw new IllegalArgumentException("You need to enter correct payment way in the URL");

        m.put("amount", ApplyDiscount.makeDiscount(Double.parseDouble((String) m.get("amount"))));
        payment.pay(m);

        CurrentUser.getUser().addTransaction(new Transaction(CurrentService.getService().getName(),
                (double) CurrentService.getParameters().get("amount")));
    }
}
