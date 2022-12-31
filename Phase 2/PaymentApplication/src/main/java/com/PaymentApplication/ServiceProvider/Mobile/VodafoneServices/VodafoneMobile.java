package com.PaymentApplication.ServiceProvider.Mobile.VodafoneServices;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class VodafoneMobile extends ServiceProvider {
    private static VodafoneMobile instance = new VodafoneMobile();
    private VodafoneMobile(){
        super("Vodafone Mobile Recharge Service", false);
        setHandler(new VodafoneMobileHandler());
    }
    public static VodafoneMobile getInstance(){
        return instance;
    }
}
