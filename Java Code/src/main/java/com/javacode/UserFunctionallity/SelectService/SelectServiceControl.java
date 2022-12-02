package com.javacode.UserFunctionallity.SelectService;

import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.Model.CurrentService;
import com.javacode.Services.Service;
import com.javacode.Services.ServiceFactory;

import java.util.Map;

public class SelectServiceControl implements Command {
    @Override
    public void execute(Map m) {
        Service s = new ServiceFactory().createService((String) m.get("name"));
        CurrentService.setService(s);
        ServiceFactory factory = new ServiceFactory();
        FormUI form = factory.createForm((String) m.get("type"), s.getProviders());
        form.setCommand(factory.createCommand((String) m.get("type")));
        form.getInfoFromUser();
    }
}
