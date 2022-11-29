package com.javacode.Model;
import com.javacode.Admin.*;

import java.util.ArrayList;

public class AdminDatabase {
    private ArrayList<providerObject>providerObjects;
    AdminDatabase(){
        providerObjects=new ArrayList<>();
    }
    public void AddToDatabase(providerObject object){
        providerObjects.add(object);
    }
    public ArrayList<providerObject> getProviders(){
        return providerObjects;
    }
}
