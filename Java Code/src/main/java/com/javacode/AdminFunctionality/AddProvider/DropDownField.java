package com.javacode.AdminFunctionality.AddProvider;

import java.util.List;

public class DropDownField implements Field {
    private String label;
    private List value;
    public DropDownField(String label , List value){
        this.label = label;
        this.value = value;
    }
    @Override
    public String getLabel() {
        return label;
    }

    public List getValue() {
        return value;
    }
}
