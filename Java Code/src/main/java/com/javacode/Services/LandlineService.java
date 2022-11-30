package com.javacode.Services;


import com.javacode.AdminFunctionality.AddProvider.DropDownField;
import com.javacode.AdminFunctionality.AddProvider.ServiceProvider;
import com.javacode.AdminFunctionality.AddProvider.TextField;

import java.util.ArrayList;
import java.util.List;

public class LandlineService extends Service {
    private static LandlineService instance = new LandlineService();
    private LandlineService(){
        List<TextField> textFields = new ArrayList<>();
        List<DropDownField> dropDownFields = new ArrayList<>();
        textFields.add(new TextField("amount"));
        textFields.add(new TextField("landline number"));

        addProvider(new ServiceProvider("Monthly receipt",dropDownFields,textFields));
        addProvider(new ServiceProvider("Quarter receipt ",dropDownFields,textFields));
        setCacheAccept(false);
        setName("Landline Services");
    }
    //Get the only object available
    public static LandlineService getInstance(){
        return instance;
    }
}
