package com.javacode.AdminFunctionality.AddProvider;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.List;

public class ProviderFactory {
    public FormUI createForm(String type, List<TextField> t, List<DropDownField> d){
        if (type.equals("cli"))
            return new ProviderForm(t,d);
        return null;
    }
    public Command createCommand(String type){
        if (type.equals("cli"))
            return new ProviderCommand();
        return null;
    }
}
