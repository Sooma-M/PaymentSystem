package com.javacode.Providers.Mobile;

import com.javacode.Providers.ProviderForm;
import com.javacode.Providers.ProviderHandler;
import com.javacode.Providers.ServiceProvider;

public class Vodafone extends ServiceProvider {
    public Vodafone(ProviderForm form, ProviderHandler handler){
        super("Vodafone", form, handler);
    }
}
