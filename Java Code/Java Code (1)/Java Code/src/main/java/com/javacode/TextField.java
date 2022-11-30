package com.javacode;

public class TextField extends Field{
    private String value;
    public TextField(String label){
        this.value = label;
    }
    public void setValue(String value){
        this.value = value;
    }
    @Override
    public String getValue(){
        return value;
    }
}
