package com.PaymentApplication.ServiceProvider.Landline.Quarter;


import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class QuarterReceipt extends ServiceProvider {
    private static QuarterReceipt instance = new QuarterReceipt();
    private QuarterReceipt() {
        super("Quarter Receipt Landline Services", false);
        setHandler(new QuarterReceiptHandler());
    }
    public static QuarterReceipt getInstance(){
        return instance;
    }
}
