package com.javacode.AdminFunctionality.Discounts;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DiscountForm implements FormUI {
    Command command;
    @Override
    public void setCommand(Command c) {
        command = c;
    }

    @Override
    public void getInfoFromUser() {
            Map<String, String> m = new HashMap<>();
            System.out.println("Choose which type you want: ");
            System.out.println("1. Overall discount");
            System.out.println("2. Specific discount");
            System.out.println("3. Back");
            System.out.print("choose: ");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();
        while (choose < 1 || choose > 3)
        {
            System.out.print("try again! choose: ");
            choose = in.nextInt();
        }
        if (choose == 3)
             return;

        if(choose==1)
            m.put("Discount_type","Overall_discount");
        else
            m.put("Discount_type","Specific_discount");
        command.execute(m);
    }
}
