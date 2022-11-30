package com.javacode.Admin.AdminFunctionality.Discounts;
import com.javacode.Command;
import com.javacode.FormUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OverallDiscountForm  implements FormUI {
    private Command command;

    @Override
    public void setCommand(Command c) {
        command = c;
    }
    @Override
    public void getInfoFromUser() {
        //create map to store values
        Map m = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Now you will make discount for all services based on number of transaction!");
        System.out.print("Enter the number of transaction you want to add discount to it: ");
        Integer transaction = Integer.valueOf(in.nextLine());
        System.out.print("Enter the DiscountPercent you want (e.g., write 10 for 10%): ");
        double DiscountPercent= in.nextDouble();
        //set values to map
        m.put("transaction",transaction);
        m.put("DiscountPercent",DiscountPercent );
        m.put("type", "overall");
        //send values to command
        try {
            command.execute(m);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}
