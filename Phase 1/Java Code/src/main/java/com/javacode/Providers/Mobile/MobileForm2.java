package com.javacode.Providers.Mobile;

import com.javacode.Providers.ProviderForm;
import com.javacode.Providers.ProviderHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MobileForm2 extends ProviderForm {
    public MobileForm2(ProviderHandler h) {
        super(h);
    }

    @Override
    public void getInfoFromUser() {
        Scanner in = new Scanner(System.in);

        System.out.print("Mobile Number: ");
        String mobile = in.nextLine();

        System.out.print("Amount: ");
        String amount = in.nextLine();

        System.out.print("Zip Code: ");
        String zip = in.nextLine();

        Map m = new HashMap<>();
        m.put("mobile", mobile);
        m.put("amount", amount);
        m.put("zip", zip);
        try {
            handler.execute(m);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
