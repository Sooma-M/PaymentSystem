package com.javacode.Model;

import java.util.ArrayList;
import java.util.List;

public class PaymentWaysList {
    private List<String> name;
    private static PaymentWaysList instance = new PaymentWaysList();
    private PaymentWaysList()
    {
        name = new ArrayList<>();
        //get from database
        name.add("Credit Card");
        name.add("Wallet");
        name.add("Cache");
    }
    public void addPaymentWay(String n){
        name.add(n);
        //add to database
    }
    public List<String> getWaysName() {return name;}

    //Get the only object available
    public static PaymentWaysList getInstance(){
        return instance;
    }
}
