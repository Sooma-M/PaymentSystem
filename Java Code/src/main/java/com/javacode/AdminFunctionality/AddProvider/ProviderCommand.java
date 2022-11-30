package com.javacode.AdminFunctionality.AddProvider;

import com.javacode.Command;

import java.util.Map;

public class ProviderCommand implements Command {
    @Override
    public void execute(Map m) {
        Map text = (Map) m.get("text");
        String amount = (String) text.get("amount");
        
    }
}
