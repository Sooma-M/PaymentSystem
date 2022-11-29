package com.javacode.Admin;

import com.javacode.DropDownField;
import com.javacode.TextField;

import java.security.Provider;
import java.util.ArrayList;

public class providerObject {
    private String  ProviderName;
    private ArrayList<DropDownField>dropDownField;
    private ArrayList<TextField> textField;

    providerObject(){}
    public void set(String ProviderName,  ArrayList<DropDownField>dropDownField, ArrayList<TextField> textField){
        this.dropDownField=dropDownField;
        this.textField=textField;
        this.ProviderName=ProviderName;
    }


}
