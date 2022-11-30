package com.javacode.Sign;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SignInForm implements FormUI {
    private Command command;
    @Override
    public void setCommand(Command c) {
        command = c;
    }
    @Override
    public void getInfoFromUser() {
        //create map to store values
        Map<String, String> m = new HashMap<>();

        //get values from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = in.nextLine();
        System.out.print("Enter your password: ");
        String pw = in.nextLine();

        //set values to map
        m.put("email", email);
        m.put("password", pw);

        //send values to command
        try {
            command.execute(m);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            throw new IllegalArgumentException("");
        }
    }
}
