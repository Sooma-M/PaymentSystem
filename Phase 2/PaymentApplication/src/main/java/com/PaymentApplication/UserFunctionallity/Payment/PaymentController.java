package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.AdminFunctionality.Discounts.ApplyDiscount;
import com.PaymentApplication.Exceptions.Payment.CacheException;
import com.PaymentApplication.Exceptions.Payment.CorrectPaymentException;
import com.PaymentApplication.Exceptions.Payment.PaymentException;
import com.PaymentApplication.Exceptions.ServiceProvider.SelectServiceException;
import com.PaymentApplication.Exceptions.ServiceProvider.ServiceProviderException;
import com.PaymentApplication.Exceptions.Sign.UserException;
import com.PaymentApplication.ServiceProvider.CurrentService;
import com.PaymentApplication.User.Transaction;
import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class PaymentController{
    public void execute(String way, HashMap m){
        if (CurrentUser.getUser() == null)
            throw new UserException();
        if (CurrentService.getService() == null)
            throw new SelectServiceException();
        if (way.toLowerCase().equals("cache") && !CurrentService.getService().getCacheAccept())
            throw new CacheException();
        Payment payment = PaymentFactory.createPayment(way);
        if (payment == null)
            throw new CorrectPaymentException();
        double amount = ApplyDiscount.makeDiscount(Double.parseDouble(CurrentService.getParameters().get("amount").toString()));
        CurrentService.setAmount(amount);

        try {
            payment.pay(m);
        }catch (PaymentException | ServiceProviderException ex){
            CurrentService.setService(null);
            CurrentService.setParameters(null);
            throw ex;
        }

        CurrentUser.getUser().addTransaction(new Transaction(CurrentService.getService().getName(),
                (double) CurrentService.getParameters().get("amount")));
        CurrentService.setService(null);
        CurrentService.setParameters(null);
    }
}
