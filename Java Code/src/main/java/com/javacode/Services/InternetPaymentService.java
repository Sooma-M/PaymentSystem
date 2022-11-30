package com.javacode.Services;

public class InternetPaymentService extends Service {
    private static InternetPaymentService instance = new InternetPaymentService();
    private InternetPaymentService(){}
    //Get the only object available
    public static InternetPaymentService getInstance(){
        return instance;
    }
}
