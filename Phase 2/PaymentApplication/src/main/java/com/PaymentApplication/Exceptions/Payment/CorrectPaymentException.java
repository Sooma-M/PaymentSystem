package com.PaymentApplication.Exceptions.Payment;

public class CorrectPaymentException extends PaymentException{
    public CorrectPaymentException(){
        super("You need to enter correct payment way in the URL");
    }
}
