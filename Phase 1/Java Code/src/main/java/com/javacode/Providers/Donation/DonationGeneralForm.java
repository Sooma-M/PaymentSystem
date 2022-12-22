package com.javacode.Providers.Donation;

import com.javacode.Providers.ProviderForm;
import com.javacode.Providers.ProviderHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DonationGeneralForm extends ProviderForm {
    public DonationGeneralForm(ProviderHandler h) {
        super(h);
    }

    @Override
    public void getInfoFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.print("Address: ");
        String number = in.nextLine();
        System.out.print("Amount: ");
        String amount = in.nextLine();

        Map m = new HashMap<>();
        m.put("address", number);
        m.put("amount", amount);
        try {
            handler.execute(m);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
