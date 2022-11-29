package com.javacode.Services;

import com.javacode.Command;

import java.util.Map;

public class SelectServiceCommand implements Command {
    @Override
    public void execute(Map m) {
        Service s = new ServiceFactory().createService((String) m.get("name"));
        System.out.println("Iam in SelectServiceCommand");
    }
}
