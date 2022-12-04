package com.javacode.Payment;

import com.javacode.Controller;
import com.javacode.FormUI;
import com.javacode.Model.CurrentUser;
import com.javacode.Model.PaymentWaysList;

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
    public FormUI createForm(double amount) {
        return new PaymentForm(amount, PaymentWaysList.getInstance().getWaysName());
    }
    public Controller createController(){
        return new PaymentController();
    }
}
