package com.PaymentApplication.Exceptions.ServiceProvider;

public abstract class ServiceProviderException extends IllegalArgumentException {
    ServiceProviderException(String s){
        super(s);
    }
}
