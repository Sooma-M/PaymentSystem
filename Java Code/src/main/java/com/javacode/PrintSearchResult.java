package com.javacode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintSearchResult implements Printer{

    @Override
    public void print(Map m) {
        List<String> result = (List<String>) m.get("result");
        System.out.println("Search Result: ");
        for (int i=0 ; i<result.size() ; i++)
        {
            System.out.println((i+1) + ". " +result.get(i));
        }
        if (result.size() == 0)
            System.out.println("No Services with this name!");
        else
        {
            System.out.print("write service number: ");
            Scanner in = new Scanner(System.in);
            int srv = in.nextInt();

            Map service = new HashMap<>();
            service.put("name", result.get(srv-1));
            Command c = new SelectServiceCommand();
            c.execute(service);
        }
    }
}
