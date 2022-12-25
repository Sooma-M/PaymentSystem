package com.PaymentApplication.ServiceProvider.Landline;


import com.PaymentApplication.ServiceProvider.Landline.Monthly.MonthlyReceipt;
import com.PaymentApplication.ServiceProvider.Landline.Monthly.MonthlyReceiptHandler;
import com.PaymentApplication.ServiceProvider.Landline.Quarter.QuarterReceipt;
import com.PaymentApplication.ServiceProvider.Landline.Quarter.QuarterReceiptHandler;
import com.PaymentApplication.ServiceProvider.ProviderHandler;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;

import java.util.HashMap;

public class LandlineFactory implements ServiceProviderFactory {
    @Override
    public ServiceProvider createService(String type) {
        if (type.toLowerCase().equals("monthly-receipt") || type.toLowerCase().equals("Monthly Receipt Landline Services"))
            return MonthlyReceipt.getInstance();
        else if (type.toLowerCase().equals("quarter-receipt") || type.toLowerCase().equals("Quarter Receipt Landline Services"))
            return QuarterReceipt.getInstance();
        return null;
    }

    @Override
    public ProviderHandler createHandler(String type) {
        if (type.toLowerCase().equals("monthly-receipt") || type.toLowerCase().equals("Monthly Receipt Landline Services"))
            return new MonthlyReceiptHandler();
        else if (type.toLowerCase().equals("quarter-receipt") || type.toLowerCase().equals("Quarter Receipt Landline Services"))
            return new QuarterReceiptHandler();
        return null;
    }
}
