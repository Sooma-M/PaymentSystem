package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.User.CurrentUser;

public class PaymentFactory {
    public static PaymentWay createPaymentWay(String type){
        if(type.toLowerCase().equals("wallet"))
            return CurrentUser.getUser().getWallet();
        else if(type.toLowerCase().equals("credit-card"))
            return new CreditCard();
        else if (type.toLowerCase().equals("cache"))
            return new Cache();
        return null;
    }
    public static IPayment createPayment(String type){
        if (type.equals("simple"))
            return new PaymentService();
        return null;
    }
}
