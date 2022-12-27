package com.PaymentApplication.Exceptions.Sign;

public abstract class SignException extends IllegalArgumentException{

    public SignException(String s) {
        super(s);
    }
}
