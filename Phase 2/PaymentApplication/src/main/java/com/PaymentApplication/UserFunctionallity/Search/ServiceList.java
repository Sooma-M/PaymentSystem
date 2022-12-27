package com.PaymentApplication.UserFunctionallity.Search;

import java.util.ArrayList;
import java.util.List;

public class ServiceList {
    private List<String> name;
    private static ServiceList instance = new ServiceList();
    private ServiceList()
    {
        name = new ArrayList<>();
        //get from database
        name.add("We Mobile Recharge Service");
        name.add("Orange Mobile Recharge Service");
        name.add("Etisalat Mobile Recharge Service");
        name.add("Vodafone Mobile Recharge Service");

        name.add("We Internet Payment Service");
        name.add("Orange Internet Payment Service");
        name.add("Etisalat Internet Payment Service");
        name.add("Vodafone Internet Payment Service");

        name.add("School Donation Service");
        name.add("NGO (Non profitable organization) Donation Service");
        name.add("Cancer Hospital Donation Service");

        name.add("Monthly Receipt Landline Services");
        name.add("Quarter Receipt Landline Services");
    }
    public void addService(String n){
        name.add(n);
        //add to database
    }
    public List<String> getServicesName() {return name;}

    //Get the only object available
    public static ServiceList getInstance(){
        return instance;
    }
}
