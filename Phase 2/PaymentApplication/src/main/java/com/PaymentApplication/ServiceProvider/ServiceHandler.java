package com.PaymentApplication.ServiceProvider;

import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class ServiceHandler implements IServiceHandler{
    @Override
    public void saveService(String type, String name, HashMap m) {
        if (CurrentUser.getUser() == null)
            throw new IllegalArgumentException("You need to sign-in first!");

        ServiceProvider serviceProvider = ServiceFactory.createFactory(type).createService(name);
        if (serviceProvider == null)
            throw new IllegalArgumentException("Enter correct provider type and name");
        m.put("original-amount", m.get("amount"));
        serviceProvider.setParameters(m);
        CurrentService.setService(serviceProvider);
    }

    @Override
    public double getFees() {
        if (CurrentUser.getUser() == null)
            throw new IllegalArgumentException("You need to sign-in first!");
        //check service
        if (CurrentService.getService() == null)
            throw new IllegalArgumentException("You need to select service provider first!");

        return Double.parseDouble(CurrentService.getService().getParameters().get("amount").toString());
    }
}
