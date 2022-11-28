package com.javacode;

import java.util.Map;

public class SelectServiceCommand implements Command {
    @Override
    public void execute(Map m) {
        Service s = new ServiceFactory().createService((String) m.get("name"));
        System.out.println("Iam in SelectServiceCommand");
    }
}
