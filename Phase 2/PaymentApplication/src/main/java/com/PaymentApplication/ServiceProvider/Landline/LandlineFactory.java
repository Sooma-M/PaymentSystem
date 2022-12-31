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
        switch (type.toLowerCase()) {
            case "monthly-receipt":
            case "monthly receipt landline services":
                return MonthlyReceipt.getInstance();
            case "quarter-receipt":
            case "quarter receipt landline services":
                return QuarterReceipt.getInstance();
        }
        return null;
    }
}
