package com.javacode.AdminFunctionality.Discounts.Specific;

import com.javacode.Controller;
import com.javacode.FormUI;

import java.util.*;
public class SpecificDiscountForm implements FormUI {
    private Controller controller;
    List<String> name;
    public SpecificDiscountForm(List<String> name){this.name = name;}
    @Override
    public void setController(Controller c) {
        controller = c;
    }
    @Override
    public void getInfoFromUser() {
        System.out.println("Choose which services  you want to add discount to it: ");
        for (int i =0 ; i<name.size() ; i++)
            System.out.println((i+1) +". "+name.get(i));
        System.out.print("choose: ");
        Scanner in = new Scanner(System.in);
        String choose = in.nextLine();
        while (Integer.parseInt(choose) < 1 ||Integer.parseInt(choose) > name.size())
        {
            System.out.print("try again! choose: ");
            choose = in.nextLine();
        }
        System.out.print("Enter the DiscountPercent you want (e.g., write 10 for 10%): ");
        String DiscountPercent= in.nextLine();
        while (Integer.parseInt(DiscountPercent) <= 0)
        {
            System.out.print("please enter positive value: ");
            DiscountPercent= in.nextLine();
        }
        //create map to store values
        Map m = new HashMap<>();
        m.put("CrossedServices",name.get(Integer.parseInt(choose)-1));
        m.put("DiscountPercent", Double.parseDouble(DiscountPercent));
        m.put("type", "specific");

        //send values to command
        try {
            controller.execute(m);
            System.out.println("Success");
            System.out.println();
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}