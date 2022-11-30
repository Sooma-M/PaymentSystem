package com.javacode.Model;

import com.javacode.Services.Service;

public class CurrentService {
    private static Service service = null;
    public static void setService(Service service) {CurrentService.service = service;}
    public static Service getService() {return service;}
}
