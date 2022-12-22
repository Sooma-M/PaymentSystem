package com.javacode.Services;

import com.javacode.Providers.Landline.MonthlyReceipt;
import com.javacode.Providers.Landline.QuarterReceipt;
import com.javacode.Providers.Landline.ReceiptForm;
import com.javacode.Providers.Landline.ReceiptHandler;
import com.javacode.Providers.ProviderHandler;

public class LandlineService extends Service {
    private static LandlineService instance = new LandlineService();
    private LandlineService(){
        ProviderHandler handler = new ReceiptHandler();
        addProvider("Monthly Receipt", new MonthlyReceipt(new ReceiptForm(handler), handler));
        addProvider("Quarter Receipt", new QuarterReceipt(new ReceiptForm(handler), handler));
        setCacheAccept(false);
        setName("Landline Services");
    }
    //Get the only object available
    public static LandlineService getInstance(){
        return instance;
    }
}
