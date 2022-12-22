package com.javacode.Providers.Landline;

import com.javacode.Providers.ProviderForm;
import com.javacode.Providers.ProviderHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReceiptForm extends ProviderForm {
    public ReceiptForm(ProviderHandler h) {
        super(h);
    }

    @Override
    public void getInfoFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.print("Landline Number: ");
        String number = in.nextLine();
        System.out.print("Amount: ");
        String amount = in.nextLine();

        Map m = new HashMap<>();
        m.put("number", number);
        m.put("amount", amount);
        try {
            handler.execute(m);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
