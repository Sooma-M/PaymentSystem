package com.javacode.Model;

import java.util.ArrayList;
import java.util.List;

public class TypesOfDiscounts {
    private List<String> name;
    private static TypesOfDiscounts instance = new TypesOfDiscounts();
    private TypesOfDiscounts()
    {
        name = new ArrayList<>();
        //get from database
        name.add("Overall discount");
        name.add("Specific discount");
    }
    public void addDiscountName(String n){
        name.add(n);
        //add to database
    }
    public List<String> getDiscountNames() {return name;}

    //Get the only object available
    public static TypesOfDiscounts getInstance(){
        return instance;
    }
}
