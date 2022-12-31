package com.PaymentApplication.ServiceProvider;

import java.util.HashMap;

public interface IServiceHandler {
    void saveService(String type,String name,HashMap m);
    double getFees();
}
