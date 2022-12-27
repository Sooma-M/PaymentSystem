package com.PaymentApplication.Exceptions.Payment;

public class CacheException extends PaymentException{
    public CacheException(){
        super("This service doesn't accept cache! choose another payment way");
    }
}
