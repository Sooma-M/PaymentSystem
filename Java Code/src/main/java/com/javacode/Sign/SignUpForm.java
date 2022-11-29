package com.javacode.Sign;
import com.javacode.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SignUpForm implements FormUI{
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
        System.out.print("Enter your username: ");
        String username = in.nextLine();
        System.out.print("Enter your email: ");
        String email = in.nextLine();
        System.out.print("Enter your password: ");
        String pw = in.nextLine();

        //set values to map
        m.put("username", username);
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
