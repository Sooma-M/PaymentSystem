package com.javacode.Model.MainFunction;

import java.util.ArrayList;
import java.util.List;

public class SignList {
    private List<String> name;
    private static SignList instance = new SignList();
    private SignList()
    {
        name = new ArrayList<>();
        //get from database
        name.add("sign-in");
        name.add("sign-up");
    }
    public void addName(String n){
        name.add(n);
        //add to database
    }
    public List<String> getName() {return name;}

    //Get the only object available
    public static SignList getInstance(){
        return instance;
    }
}
