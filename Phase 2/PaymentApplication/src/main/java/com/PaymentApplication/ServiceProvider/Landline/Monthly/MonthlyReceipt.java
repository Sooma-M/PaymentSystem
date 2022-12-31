package com.PaymentApplication.ServiceProvider.Landline.Monthly;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class MonthlyReceipt extends ServiceProvider {
    private static MonthlyReceipt instance  = new MonthlyReceipt();
    private MonthlyReceipt() {
        super("Monthly Receipt Landline Services",  true);
        setHandler(new MonthlyReceiptHandler());
    }
    public static MonthlyReceipt getInstance(){
        return instance;
    }
}
