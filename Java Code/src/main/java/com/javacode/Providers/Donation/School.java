package com.javacode.Providers.Donation;

import com.javacode.Providers.ProviderForm;
import com.javacode.Providers.ProviderHandler;
import com.javacode.Providers.ServiceProvider;

public class School extends ServiceProvider {
    public School(ProviderForm f, ProviderHandler h) {
        super("School", f, h);
    }
}
