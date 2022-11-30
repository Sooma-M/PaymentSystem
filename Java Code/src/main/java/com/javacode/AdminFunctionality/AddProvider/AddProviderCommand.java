package com.javacode.AdminFunctionality.AddProvider;

import com.javacode.Command;
import com.javacode.Services.Service;
import com.javacode.Services.ServiceFactory;

import java.util.List;
import java.util.Map;

public class AddProviderCommand implements Command {
    @Override
    public void execute(Map m) {
        Service service = new ServiceFactory().createService((String) m.get("service"));
        ServiceProvider provider = new ServiceProvider((String) m.get("name"),
                (List<DropDownField>) m.get("drop"), (List<TextField>)  m.get("text"));
        service.addProvider(provider);
    }
}
