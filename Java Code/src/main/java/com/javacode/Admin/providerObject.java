package com.javacode.Admin;

import com.javacode.DropDownField;
import com.javacode.TextField;

import java.util.ArrayList;

public class providerObject {
    private ArrayList<DropDownField>dropDownField;
    private ArrayList<TextField> textField;

    providerObject(){}
    public void set(ArrayList<DropDownField>dropDownField, ArrayList<TextField> textField){
        this.dropDownField=dropDownField;
        this.textField=textField;
    }


}
