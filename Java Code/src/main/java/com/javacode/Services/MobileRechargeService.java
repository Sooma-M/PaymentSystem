package com.javacode.Services;


import com.javacode.AdminFunctionality.AddProvider.DropDownField;
import com.javacode.AdminFunctionality.AddProvider.ServiceProvider;
import com.javacode.AdminFunctionality.AddProvider.TextField;

import java.util.ArrayList;
import java.util.List;

public class MobileRechargeService extends Service {
    private static MobileRechargeService instance = new MobileRechargeService();
    private MobileRechargeService(){
        List<TextField> textFields = new ArrayList<>();
        List<DropDownField> dropDownFields = new ArrayList<>();
        textFields.add(new TextField("amount"));
        textFields.add(new TextField("mobile number"));

        addProvider(new ServiceProvider("Vodafone",dropDownFields,textFields));
        addProvider(new ServiceProvider("Etisalat ",dropDownFields,textFields));

        textFields.add(new TextField("zip code"));
        addProvider(new ServiceProvider("Orange",dropDownFields,textFields));
        addProvider(new ServiceProvider("We",dropDownFields,textFields));
        setCacheAccept(false);
        setName("Mobile Recharge Services");
    }
    //Get the only object available
    public static MobileRechargeService getInstance(){
        return instance;
    }
}
