package com.PaymentApplication.Exceptions.Sign;

public class AdminException extends SignException{
    public AdminException(){
        super("You need to be admin to be able to use this feature");
    }
}
