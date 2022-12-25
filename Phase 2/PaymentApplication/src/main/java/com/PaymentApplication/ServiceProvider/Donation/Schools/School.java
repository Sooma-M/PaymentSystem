package com.PaymentApplication.ServiceProvider.Donation.Schools;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class School extends ServiceProvider {
    private static School instance = new School();
    private School() {
        super("School Donation Service", true);
    }
    public static School getInstance(){
        return instance;
    }
}
