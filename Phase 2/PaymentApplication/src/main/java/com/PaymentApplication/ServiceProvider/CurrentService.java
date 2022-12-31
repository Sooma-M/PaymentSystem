package com.PaymentApplication.ServiceProvider;

public class CurrentService {
    private static ServiceProvider service = null;
    public static void setService(ServiceProvider service) {CurrentService.service = service;}
    public static ServiceProvider getService() {return service;}
}