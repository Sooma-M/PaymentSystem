package com.javacode.Providers;

public abstract class ServiceProvider {
    private String name;
    private ProviderForm form;
    private ProviderHandler handler;

   public ServiceProvider(String n, ProviderForm f, ProviderHandler h){
       name = n;
       form = f;
       handler = h;
   }

    public String getName() {return name;}

    public ProviderForm getForm() {return form;}

    public ProviderHandler getHandler() {return handler;}
}
