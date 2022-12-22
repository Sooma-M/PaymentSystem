package com.javacode.Services;

import com.javacode.Providers.Mobile.*;
import com.javacode.Providers.ProviderHandler;

public class InternetPaymentService extends Service {
    private static InternetPaymentService instance = new InternetPaymentService();
    private InternetPaymentService(){
        ProviderHandler handler = new MobileHandler();
        addProvider("Vodafone", new Vodafone(new MobileForm(handler), handler));
        addProvider("Etisalat", new Etisalat(new MobileForm(handler), handler));

        handler = new MobileHandler2();
        addProvider("Orange", new Orange(new MobileForm2(handler), handler));
        addProvider("We", new We(new MobileForm2(handler), handler));

        setCacheAccept(false);
        setName("Internet Payment Services");
    }
    //Get the only object available
    public static InternetPaymentService getInstance(){
        return instance;
    }
}
