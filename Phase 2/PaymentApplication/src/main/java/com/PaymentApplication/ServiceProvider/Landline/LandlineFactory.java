package com.PaymentApplication.ServiceProvider.Landline;

import com.PaymentApplication.ServiceProvider.Landline.Monthly.MonthlyReceipt;
import com.PaymentApplication.ServiceProvider.Landline.Quarter.QuarterReceipt;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;

public class LandlineFactory implements ServiceProviderFactory {
    @Override
    public ServiceProvider createService(String type) {
        if (type.toLowerCase().contains("monthly")) {
            return MonthlyReceipt.getInstance();
        } else if (type.toLowerCase().contains("quarter")) {
            return QuarterReceipt.getInstance();
        }
        return null;
    }
}
