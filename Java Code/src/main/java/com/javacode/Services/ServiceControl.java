package com.javacode.Services;

import com.javacode.AdminFunctionality.AddProvider.ProviderFactory;
import com.javacode.AdminFunctionality.AddProvider.ServiceProvider;
import com.javacode.Command;
import com.javacode.FormUI;

import java.util.Map;

public class ServiceControl implements Command {
    @Override
    public void execute(Map m) {
        ProviderFactory p = new ProviderFactory();
        ServiceProvider provider = (ServiceProvider) m.get("provider");
        FormUI form = p.createForm((String) m.get("type"), provider.getTextField(), provider.getDropDownField());
        form.setCommand(p.createCommand((String) m.get("type")));
        form.getInfoFromUser();
    }
}
