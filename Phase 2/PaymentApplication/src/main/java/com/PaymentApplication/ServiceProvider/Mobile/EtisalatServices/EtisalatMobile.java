package com.PaymentApplication.ServiceProvider.Mobile.EtisalatServices;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class EtisalatMobile extends ServiceProvider {
    private static EtisalatMobile instance = new EtisalatMobile();
    private EtisalatMobile(){
        super("Etisalat Mobile Recharge Service",  false);
    }
    public static EtisalatMobile getInstance(){
        return instance;
    }
}
