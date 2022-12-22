package com.javacode.Providers;

public abstract class ProviderForm{
    public ProviderHandler handler;
    public ProviderForm(ProviderHandler h){handler = h;}

    public abstract void getInfoFromUser();
}
