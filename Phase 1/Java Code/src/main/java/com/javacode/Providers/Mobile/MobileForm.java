package com.javacode.Providers.Mobile;

import com.javacode.Providers.ProviderForm;
import com.javacode.Providers.ProviderHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MobileForm extends ProviderForm {
    public MobileForm(ProviderHandler h) {
        super(h);
    }

    @Override
    public void getInfoFromUser() {
        Map m = new HashMap<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Mobile Number: ");
        String mobile = in.nextLine();

        System.out.print("Amount: ");
        String amount = in.nextLine();

        m.put("mobile", mobile);
        m.put("amount", amount);
        try {
            handler.execute(m);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
