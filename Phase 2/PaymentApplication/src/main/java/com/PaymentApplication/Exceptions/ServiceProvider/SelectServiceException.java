package com.PaymentApplication.Exceptions.ServiceProvider;

import com.PaymentApplication.Exceptions.Payment.PaymentException;

public class SelectServiceException extends ServiceProviderException {
    public SelectServiceException(){
        super("You need to select service provider first!");
    }
}
