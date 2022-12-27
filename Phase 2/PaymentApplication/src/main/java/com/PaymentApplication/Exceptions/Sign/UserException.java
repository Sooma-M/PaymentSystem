package com.PaymentApplication.Exceptions.Sign;

public class UserException extends SignException {
    public UserException(){
        super("This function not allowed, you need to sign in first!");
    }
}
