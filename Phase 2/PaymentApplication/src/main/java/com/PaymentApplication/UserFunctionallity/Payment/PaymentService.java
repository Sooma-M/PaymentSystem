package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.AdminFunctionality.Discounts.ApplyDiscount;
import com.PaymentApplication.ServiceProvider.CurrentService;
import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class PaymentService implements IPayment {
    public void check(String way){
        //check user
        CurrentUser.checkUser();
        //check service
        if (CurrentService.getService() == null)
            throw new IllegalArgumentException("You need to select service provider first!");
        //check cache acceptance
        if (way.toLowerCase().equals("cache") && !CurrentService.getService().getCacheAccept())
            throw new IllegalArgumentException("This service doesn't accept cache! choose another payment way");
    }

    public String payForService(String way, HashMap m){
        //get payment way
        PaymentWay payment = PaymentFactory.createPaymentWay(way);
        if (payment == null)
            throw new IllegalStateException("You need to enter correct payment way in the URL");

        check(way);

        //apply discount
        double amount = ApplyDiscount.makeDiscount(Double.parseDouble(m.get("amount").toString()));
        m.put("amount", amount);
        //pay
        payment.pay(m);

        //save transaction
        CurrentService.getService().getHandler().saveTransaction(Double.parseDouble(m.get("amount").toString()));
        CurrentService.setService(null);

        return "You are pay " + amount + "$ successfully";
    }
}
