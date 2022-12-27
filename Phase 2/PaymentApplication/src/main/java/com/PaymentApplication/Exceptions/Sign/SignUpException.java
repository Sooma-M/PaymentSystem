package com.PaymentApplication.Exceptions.Sign;

public class SignUpException extends SignException{
    public SignUpException(){
        super("This account exist! try again");
    }
}
