package com.javacode.Model;

import java.util.ArrayList;
import java.util.List;

public class ServiceList {
    private List<String> name;
    private static ServiceList instance = new ServiceList();
    private ServiceList()
    {
        name = new ArrayList<>();
        //get from database
        name.add("Mobile Recharge Services");
        name.add("Internet Payment Services");
        name.add("Landline Services");
        name.add("Donation Services");
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
