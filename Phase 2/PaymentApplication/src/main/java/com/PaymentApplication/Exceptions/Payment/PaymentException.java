package com.PaymentApplication.Exceptions.Payment;

public abstract class PaymentException extends IllegalArgumentException{
    PaymentException(String s){
        super(s);
    }
}
