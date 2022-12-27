package com.PaymentApplication.Exceptions;

public class RequestBodyException extends IllegalArgumentException{
    public RequestBodyException(){
        super("You need to send correct arguments in body!");
    }
}
