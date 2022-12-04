package com.javacode.AdminFunctionality.Discounts;

import com.javacode.Controller;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class DiscountForm implements FormUI {
    Controller controller;
    List<String> name;
    public DiscountForm(List<String> n){this.name = n;}
    @Override
    public void setController(Controller c) {
        controller = c;
    }

    @Override
    public void getInfoFromUser() {
        Map<String, String> m = new HashMap<>();
        System.out.println("Choose which type you want: ");
        for (int i=0 ; i<name.size() ; i++)
        {
            System.out.println((i+1) + ". " +name.get(i));
        }
        System.out.println((name.size()+1)+". Back");
        System.out.print("choose: ");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        while (choose < 1 || choose > name.size()+1)
        {
            System.out.print("try again! choose: ");
            choose = in.nextInt();
        }
        if (choose == name.size()+1)
             return;

        m.put("Discount_type",name.get(choose-1));
        controller.execute(m);
    }
}
