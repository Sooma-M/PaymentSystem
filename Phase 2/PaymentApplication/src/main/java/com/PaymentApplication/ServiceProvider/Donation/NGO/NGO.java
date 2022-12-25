package com.PaymentApplication.ServiceProvider.Donation.NGO;


import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class NGO extends ServiceProvider {
    private static NGO instance = new NGO();
    private NGO() {
        super("NGO (Non profitable organization) Donation Service", true);
    }
    public static NGO getInstance(){
        return instance;
    }
}
