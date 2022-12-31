package com.PaymentApplication.ServiceProvider;

public interface ServiceProviderFactory {
    public ServiceProvider createService(String type);
}
