package com.javacode.Services;

import com.javacode.AdminFunctionality.AddProvider.DropDownField;
import com.javacode.AdminFunctionality.AddProvider.ServiceProvider;
import com.javacode.AdminFunctionality.AddProvider.TextField;

import java.util.ArrayList;
import java.util.List;

public class InternetPaymentService extends Service {
    private static InternetPaymentService instance = new InternetPaymentService();
    private InternetPaymentService(){
        List<TextField> textFields = new ArrayList<>();
        List<DropDownField> dropDownFields = new ArrayList<>();
        textFields.add(new TextField("amount"));
        textFields.add(new TextField("mobile number"));

        addProvider(new ServiceProvider("Vodafone",dropDownFields,textFields));
        addProvider(new ServiceProvider("Etisalat ",dropDownFields,textFields));

        textFields.add(new TextField("zip code"));
        addProvider(new ServiceProvider("Orange",dropDownFields,textFields));
        addProvider(new ServiceProvider("We",dropDownFields,textFields));
        setCacheAccept(true);
        setName("Internet Payment Services");
    }
    //Get the only object available
    public static InternetPaymentService getInstance(){
        return instance;
    }
}
