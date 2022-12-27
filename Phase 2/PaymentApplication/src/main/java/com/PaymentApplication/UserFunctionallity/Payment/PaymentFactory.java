package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.UserFunctionallity.Payment.PaymentWays.Cache;
import com.PaymentApplication.UserFunctionallity.Payment.PaymentWays.CreditCard;
import com.PaymentApplication.UserFunctionallity.Payment.PaymentWays.Payment;

public class PaymentFactory {
    public static Payment createPayment(String type){
        if(type.toLowerCase().equals("wallet"))
            return CurrentUser.getUser().getWallet();
        else if(type.toLowerCase().equals("credit-card"))
            return new CreditCard();
        else if (type.toLowerCase().equals("cache"))
            return new Cache();
        return null;
    }
}
