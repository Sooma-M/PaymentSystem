package com.javacode.Payment;

import com.javacode.Model.CurrentUser;

public class PaymentFactory {
    public Payment createPayment(String type){
        if(type.equals("Wallet"))
            return CurrentUser.getUser().getWallet();
        else if(type.equals("Credit Card"))
            return new CreditCard();
        else if (type.equals("Cache"))
            return new Cache();
        return null;
    }
}
