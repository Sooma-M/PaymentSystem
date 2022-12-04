package com.javacode.Model.MainFunction;

import java.util.ArrayList;
import java.util.List;

public class UserFunctionList {
    private List<String> name;
    private static UserFunctionList instance = new UserFunctionList();
    private UserFunctionList()
    {
        name = new ArrayList<>();
        //get from database
        name.add("Search for Services");
        name.add("Make Refund");
        name.add("Check Discount");
        name.add("Add Funds to the Wallet");
        name.add("Payment for service");
    }
    public void addName(String n){
        name.add(n);
        //add to database
    }
    public List<String> getName() {return name;}

    //Get the only object available
    public static UserFunctionList getInstance(){
        return instance;
    }
}
