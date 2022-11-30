package com.javacode.AdminFunctionality.Discounts;
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
        Integer choose = in.nextInt();
        while (choose < 1 || choose > name.size())
        {
            System.out.print("try again! choose: ");
            choose = in.nextInt();
        }
        System.out.print("Enter the DiscountPercent you want (e.g., write 10 for 10%): ");
        double DiscountPercent= in.nextDouble();
        //set values to map
        m.put("CrossedServices",name.get(choose-1));
        m.put("DiscountPercent",DiscountPercent);
        m.put("type", "specific");
        //send values to command
        try {
            command.execute(m);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}