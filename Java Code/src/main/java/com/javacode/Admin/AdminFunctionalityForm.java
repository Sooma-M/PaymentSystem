package com.javacode.Admin;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdminFunctionalityForm implements FormUI {
    private Command command;
    @Override
    public void setCommand(Command c) {
        command=c;
    }

    @Override
    public void getInfoFromUser() {
        Map<String, String> m = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.print("1.Add provider: ");
        System.out.print("2.make discount: ");
        System.out.print("3.List refund: ");
        String choice = in.nextLine();
        m.put("choice",choice);

        try {
            command.execute(m);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}
