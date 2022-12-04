package com.javacode.UserFunctionallity.Search;

import com.javacode.Controller;
import com.javacode.FormResult;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SearchForm implements FormUI, FormResult {
    Controller controller;
    @Override
    public void setController(Controller c) {
        controller = c;
    }

    @Override
    public void getInfoFromUser() {
        Map m = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter search text: ");
        String text = in.nextLine();
        m.put("search", text);
        m.put("form", this);
        m.put("type", "Payment for service");
        controller.execute(m);
    }

    public void result(List result)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Search Result: ");
        for (int i=0 ; i<result.size() ; i++)
        {
            System.out.println((i+1) + ". " +result.get(i));
        }
        if (result.size() == 0) {
            System.out.println("No Services with this name!");
            System.out.println("Do you want to try again? y/n");
            char again = in.next().charAt(0);
            while (again != 'y' && again != 'Y' && again !='n' && again !='N')
            {
                System.out.println("Please enter y or n (y for yes and n for no) to continue");
                again = in.next().charAt(0);
            }
            if (again == 'y' ||again == 'Y')
                getInfoFromUser();
        }
        else
        {
            System.out.println("Do you want to continue with this result? y/n");
            char again = in.next().charAt(0);
            while (again != 'y' && again != 'Y' && again !='n' && again !='N')
            {
                System.out.println("Please enter y or n (y for yes and n for no) to continue");
                again = in.next().charAt(0);
            }
            if (again == 'n' || again == 'N')
                return;

            System.out.print("write service number: ");
            int srv = in.nextInt();
            while (srv <1 || srv> result.size())
            {
                System.out.print("try again! choose: ");
                srv = in.nextInt();
            }
            Map service = new HashMap<>();
            service.put("name", result.get(srv-1));
            service.put("type", "cli");

            controller.execute(service);
        }
    }
}
