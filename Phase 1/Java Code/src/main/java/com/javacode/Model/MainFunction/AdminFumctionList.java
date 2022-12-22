package com.javacode.Model.MainFunction;

import java.util.ArrayList;
import java.util.List;

public class AdminFumctionList {
    private List<String> name;
    private static AdminFumctionList instance = new AdminFumctionList();
    private AdminFumctionList()
    {
        name = new ArrayList<>();
        //get from database
        name.add("Make discount");
        name.add("List refund");
        name.add("Access user functionality");
    }
    public void addName(String n){
        name.add(n);
        //add to database
    }
    public List<String> getName() {return name;}

    //Get the only object available
    public static AdminFumctionList getInstance(){
        return instance;
    }
}
