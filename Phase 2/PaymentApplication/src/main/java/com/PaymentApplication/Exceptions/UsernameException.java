package com.PaymentApplication.Exceptions;

public class UsernameException extends IllegalArgumentException{
    public UsernameException(){
        super("username didn't exist, try again!");
    }
}
