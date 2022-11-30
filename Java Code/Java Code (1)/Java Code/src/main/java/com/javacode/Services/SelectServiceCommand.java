package com.javacode.Services;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.Map;

public class SelectServiceCommand implements Command {
    @Override
    public void execute(Map m) {
        Service s = new ServiceFactory().createService((String) m.get("name"));
        FormUI form = new ServiceForm(s);
        form.setCommand(new ServiceCommand());
        form.getInfoFromUser();
    }
}
