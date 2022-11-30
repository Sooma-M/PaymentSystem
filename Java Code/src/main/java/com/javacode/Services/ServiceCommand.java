package com.javacode.Services;

import com.javacode.AdminFunctionality.AddProvider.ProviderCommand;
import com.javacode.AdminFunctionality.AddProvider.ProviderForm;
import com.javacode.AdminFunctionality.AddProvider.ServiceProvider;
import com.javacode.Command;
import com.javacode.FormUI;

import java.util.Map;

public class ServiceCommand implements Command {
    @Override
    public void execute(Map m) {
        FormUI form = new ProviderForm((ServiceProvider) m.get("provider"));
        form.setCommand(new ProviderCommand());
        form.getInfoFromUser();
    }
}
