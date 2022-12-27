package com.PaymentApplication.Exceptions.ServiceProvider;

public class ProviderNameException extends ServiceProviderException{
    public ProviderNameException(){
        super("Enter correct provider name");
    }
}
