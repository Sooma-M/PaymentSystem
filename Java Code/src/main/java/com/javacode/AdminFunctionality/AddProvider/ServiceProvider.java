package com.javacode.AdminFunctionality.AddProvider;

import java.util.List;

public class ServiceProvider {
    private String  ProviderName;
    private List<DropDownField>dropDownField;
    private List<TextField> textField;

    public ServiceProvider(String ProviderName, List<DropDownField> dropDownField, List<TextField> textField){
        this.dropDownField=dropDownField;
        this.textField=textField;
        this.ProviderName=ProviderName;
    }

    public List<DropDownField> getDropDownField() {
        return dropDownField;
    }

    public List<TextField> getTextField() {
        return textField;
    }

    public String getProviderName() {
        return ProviderName;
    }
}
