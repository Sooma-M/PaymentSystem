package com.PaymentApplication.ServiceProvider;

import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class ServiceController {
    public void execute(String type, String name, HashMap m){
        if (CurrentUser.getUser() == null)
            throw new IllegalArgumentException("You need to sign-in first!");
        ServiceProvider serviceProvider = ServiceFactory.createFactory(type).createService(name);
        if (serviceProvider == null)
            throw new IllegalArgumentException("Enter correct provider name");
        CurrentService.setService(serviceProvider);
        CurrentService.setParameters(m);
    }
}
