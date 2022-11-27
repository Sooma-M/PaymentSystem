package com.javacode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchForm implements FormUI{
    Command command;
    @Override
    public void setCommand(Command c) {
        command = c;
    }

    @Override
    public void getInfoFromUser() {
        Map<String, String> m = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter search text: ");
        String text = in.nextLine();
        m.put("search", text);
        command.execute(m);
    }
}
