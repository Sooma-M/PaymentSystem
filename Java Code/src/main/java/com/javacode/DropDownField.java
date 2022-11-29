package com.javacode;

import java.util.List;

public class DropDownField extends Field{
    private String label;
    private List value;
    public DropDownField(String label , List value){
        this.label = label;
        this.value = value;
    }
    public void DropDownField_setval(String label , List value){
        this.label = label;
        this.value = value;
    }


    public DropDownField() {}

    public String getValue(){
        return label;
    }
}
