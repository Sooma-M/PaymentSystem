package com.javacode.UserFunctionallity.Search;

import com.javacode.Command;
import com.javacode.Printer;
import com.javacode.Services.SelectServiceCommand;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintSearchResult implements Printer {
    private Map items;
    public PrintSearchResult(Map result)
    {
        this.items = result;
    }

    @Override
    public void print() {
        System.out.println("Search Result: ");
        for (int i=0 ; i<items.size() ; i++)
        {
            System.out.println((i+1) + ". " +items.get(i));
        }
        if (items.size() == 0)
            System.out.println("No Services with this name!");
        else
        {
            System.out.print("write service number: ");
            Scanner in = new Scanner(System.in);
            int srv = in.nextInt();

            Map service = new HashMap<>();
            service.put("name", items.get(srv-1));
            Command c = new SelectServiceCommand();
            c.execute(service);
        }
    }
}
