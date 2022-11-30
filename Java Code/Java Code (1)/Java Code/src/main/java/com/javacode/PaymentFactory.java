package com.javacode;

import java.util.Objects;

public class PaymentFactory {
    public Payment createPayment(String type){
        if(Objects.equals(type, "Wallet")){
            return new Wallet();
        }
        else if(Objects.equals(type, "Credit Card")){
            return new CreditCard();
        }
        else{
            return new Cache();
        }
    }
}
