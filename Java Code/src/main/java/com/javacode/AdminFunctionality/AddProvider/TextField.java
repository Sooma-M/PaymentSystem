package com.javacode.AdminFunctionality.AddProvider;

public class TextField implements Field {
    private String label;
    public TextField(String label){
        this.label = label;
    }

    @Override
    public String getLabel(){
        return label;
    }
}
