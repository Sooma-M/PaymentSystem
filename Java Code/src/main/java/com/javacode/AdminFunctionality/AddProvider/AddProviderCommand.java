package com.javacode.AdminFunctionality.AddProvider;

import com.javacode.Command;

import java.util.Map;

public class AddProviderCommand implements Command {
    AddNewProvider provider;
    @Override
    public void execute(Map m) {
       provider.add_provider();// put factory later 
    }

}
