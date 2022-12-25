package com.PaymentApplication.ServiceProvider.Donation.Hospital;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class CancerHospital extends ServiceProvider {
    private static CancerHospital instance = new CancerHospital();
    private CancerHospital() {
        super("Cancer Hospital Donation Service", true);
    }
    public static CancerHospital getInstance(){
        return instance;
    }
}
