package com.javacode.AdminFunctionality.Discounts.Specific;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.*;
public class SpecificDiscountForm implements FormUI {
    private Command command;
    @Override
    public void setCommand(Command c) {
        command = c;
    }
    @Override
    public void getInfoFromUser() {
        //create map to store values
        Map m = new HashMap<>();
        List<String> name = new ArrayList<>();
        name.add("Mobile Recharge Services");
        name.add("Internet Payment Services");
        name.add("Landline Services");
        name.add("Donation Services");
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
        //set values to map
        m.put("CrossedServices",name.get(Integer.parseInt(choose)-1));
        m.put("DiscountPercent", Double.parseDouble(DiscountPercent));
        m.put("type", "specific");
        //send values to command
        try {
            command.execute(m);
            System.out.println("Success");
            System.out.println();
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}