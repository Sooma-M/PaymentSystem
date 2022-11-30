package com.javacode.Services;

import com.javacode.AdminFunctionality.Discounts.Discount;

import java.util.List;
import java.util.Map;

public class InternetPaymentService extends Service {
    private static InternetPaymentService instance = new InternetPaymentService();
    private InternetPaymentService(){}
    //Get the only object available
    public static InternetPaymentService getInstance(){
        return instance;
    }
}
