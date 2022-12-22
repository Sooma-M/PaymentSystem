package com.javacode.Providers.Landline;

import com.javacode.Providers.ProviderForm;
import com.javacode.Providers.ProviderHandler;
import com.javacode.Providers.ServiceProvider;

public class MonthlyReceipt extends ServiceProvider {
    public MonthlyReceipt(ProviderForm f, ProviderHandler h) {
        super("Monthly Receipt", f, h);
    }
}
