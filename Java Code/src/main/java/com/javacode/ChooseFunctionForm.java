package com.javacode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChooseFunctionForm implements FormUI{
    private Command command;
    private static String[] functions;
    @Override
    public void setCommand(Command c) {
        command = c;
        functions = new String[]{"search","pay" ,"refund", "discount", "wallet"};
    }

    @Override
    public void getInfoFromUser() {
        //create map to store values
        Map<String, String> m = new HashMap<>();

        //get values from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Select Your Function: ");
        System.out.println("1. Search");
        System.out.println("2. Payment Services");
        System.out.println("3. Get Refund");
        System.out.println("4. Check Discount");
        System.out.println("5. Add Funds to the Wallet");
        Integer choose = in.nextInt();

        //set values to map
        m.put("choose", functions[choose-1]);

        //send values to command
        try {
            command.execute(m);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
