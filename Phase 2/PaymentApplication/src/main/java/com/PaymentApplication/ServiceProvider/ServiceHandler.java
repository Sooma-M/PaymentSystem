package com.PaymentApplication.ServiceProvider;

import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class ServiceHandler implements IServiceHandler{
    @Override
    public void saveService(String type, String name, HashMap m) {
        ServiceProviderFactory ff = ServiceFactory.createFactory(type);
        if (ff == null)
            throw new IllegalArgumentException("Enter correct provider type");
        ServiceProvider serviceProvider = ff.createService(name);
        if (serviceProvider == null)
            throw new IllegalArgumentException("Enter correct provider name");
        CurrentUser.checkUser();
        serviceProvider.setParameters(m);
        CurrentService.setService(serviceProvider);
    }
}
