package com.javacode.Admin;

import com.javacode.Command;

import java.util.Map;

public class AddProviderCommand implements Command {
    AddNewProvider provider;
    @Override
    public void execute(Map m) {
       provider.add_provider();
    }

}
