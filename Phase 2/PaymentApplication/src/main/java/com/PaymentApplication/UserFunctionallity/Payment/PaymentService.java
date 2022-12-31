package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.AdminFunctionality.Discounts.ApplyDiscount;
import com.PaymentApplication.ServiceProvider.CurrentService;
import com.PaymentApplication.User.Transaction;
import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class PaymentService implements IPayment {
    public void check(String way){
        //check user
        if (!CurrentUser.checkUser())
            throw new IllegalAccessError("This function not allowed, you need to sign in first!");
        //check service
        if (CurrentService.getService() == null)
            throw new IllegalArgumentException("You need to select service provider first!");
        //check cache acceptance
        if (way.toLowerCase().equals("cache") && !CurrentService.getService().getCacheAccept())
            throw new IllegalArgumentException("This service doesn't accept cache! choose another payment way");
    }

    public void payForService(String way, HashMap m){
        check(way);
        //get payment way
        PaymentWay payment = PaymentFactory.createPaymentWay(way);
        if (payment == null)
            throw new IllegalArgumentException("You need to enter correct payment way in the URL");

        //apply discount
        double amount = ApplyDiscount.makeDiscount(Double.parseDouble(CurrentService.getService().getParameters().get("original-amount").toString()));
        CurrentService.getService().updateAmount(amount);

        //pay
        payment.pay(m);

        //save transaction
        CurrentUser.getUser().addTransaction(new Transaction(CurrentService.getService().getName(),
                (double) CurrentService.getService().getParameters().get("amount")));
        CurrentService.setService(null);
    }
}
