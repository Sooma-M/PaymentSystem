package com.javacode.Providers.Donation;

import com.javacode.Providers.ProviderForm;
import com.javacode.Providers.ProviderHandler;
import com.javacode.Providers.ServiceProvider;

public class NGO extends ServiceProvider {
    public NGO(ProviderForm f, ProviderHandler h) {
        super("NGO (Non profitable organization)", f, h);
    }
}
