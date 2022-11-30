package com.javacode.Services;

import com.javacode.AdminFunctionality.AddProvider.DropDownField;
import com.javacode.AdminFunctionality.AddProvider.ServiceProvider;
import com.javacode.AdminFunctionality.AddProvider.TextField;

import java.util.ArrayList;
import java.util.List;

public class DonationService extends Service {
    private static DonationService instance = new DonationService();
    private DonationService(){
        List<TextField> textFields = new ArrayList<>();
        List<DropDownField> dropDownFields = new ArrayList<>();
        textFields.add(new TextField("amount"));
        textFields.add(new TextField("name"));

        addProvider(new ServiceProvider("Cancer Hospital",dropDownFields,textFields));
        addProvider(new ServiceProvider("Schools",dropDownFields,textFields));
        addProvider(new ServiceProvider("NGOs (Non profitable organizations)",dropDownFields,textFields));
    }
    //Get the only object available
    public static DonationService getInstance(){
        return instance;
    }
}
