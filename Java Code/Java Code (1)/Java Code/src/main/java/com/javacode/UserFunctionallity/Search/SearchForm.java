package com.javacode.UserFunctionallity.Search;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchForm implements FormUI {
    Command command;
    @Override
    public void setCommand(Command c) {
        command = c;
    }

    @Override
    public void getInfoFromUser() {
        Map m = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter search text: ");
        String text = in.nextLine();
        m.put("search", text);
        m.put("form", this);
        command.execute(m);
    }

    public void searchResult(Map items){
        System.out.println("Search Result: ");
        for (int i=0 ; i<items.size() ; i++)
        {
            System.out.println((i+1) + ". " +items.get(i));
        }
        if (items.size() == 0)
            System.out.println("No Services with this name!");
    }
}
