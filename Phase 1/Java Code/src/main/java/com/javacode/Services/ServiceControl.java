package com.javacode.Services;

import com.javacode.Providers.ProviderForm;
import com.javacode.Providers.ServiceProvider;
import com.javacode.Controller;

import java.util.Map;

public class ServiceControl implements Controller {
    @Override
    public void execute(Map m) {
        ServiceProvider provider = (ServiceProvider) m.get("provider");
        ProviderForm form = provider.getForm();
        form.getInfoFromUser();
    }
}
