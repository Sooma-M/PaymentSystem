package com.PaymentApplication.ServiceProvider;


import java.util.HashMap;

public class CurrentService {
    private static ServiceProvider service = null;
    private static HashMap parameters = new HashMap<>();

    public static void setService(ServiceProvider service) {CurrentService.service = service;}
    public static void setParameters(HashMap parameters) {CurrentService.parameters = parameters;}

    public static ServiceProvider getService() {return service;}
    public static HashMap getParameters() {return parameters;}
}