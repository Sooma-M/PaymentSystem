package com.PaymentApplication.Exceptions.Sign;

public class SignInException extends SignException{
    public SignInException(){
        super("Account not exist, please try again");
    }
}
