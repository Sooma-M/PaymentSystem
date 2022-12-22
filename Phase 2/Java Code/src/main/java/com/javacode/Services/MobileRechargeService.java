package com.javacode.Services;

import com.javacode.Providers.Mobile.*;
import com.javacode.Providers.ProviderHandler;

public class MobileRechargeService extends Service {
    private static MobileRechargeService instance = new MobileRechargeService();
    private MobileRechargeService(){
        ProviderHandler handler = new MobileHandler();
        addProvider("Vodafone", new Vodafone(new MobileForm(handler), handler));
        addProvider("Etisalat", new Etisalat(new MobileForm(handler), handler));

        handler = new MobileHandler2();
        addProvider("Orange", new Orange(new MobileForm(handler), handler));
        addProvider("We", new We(new MobileForm(handler), handler));

        setCacheAccept(false);
        setName("Mobile Recharge Services");
    }
    //Get the only object available
    public static MobileRechargeService getInstance(){
        return instance;
    }
}
