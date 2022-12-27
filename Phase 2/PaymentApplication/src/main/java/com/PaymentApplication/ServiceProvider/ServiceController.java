package com.PaymentApplication.ServiceProvider;

import com.PaymentApplication.Exceptions.ServiceProvider.ProviderNameException;
import com.PaymentApplication.Exceptions.Sign.UserException;
import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class ServiceController {
    public void execute(String type, String name, HashMap m){
        if (CurrentUser.getUser() == null)
            throw new UserException();
        ServiceProvider serviceProvider = ServiceFactory.createFactory(type).createService(name);
        if (serviceProvider == null)
            throw new ProviderNameException();
        CurrentService.setService(serviceProvider);
        CurrentService.setParameters(m);
    }
}
