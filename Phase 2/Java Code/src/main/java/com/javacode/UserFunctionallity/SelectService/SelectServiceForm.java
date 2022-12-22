package com.javacode.UserFunctionallity.SelectService;

import com.javacode.Controller;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SelectServiceForm implements FormUI {
    Controller controller;
    List<String> services;
    public SelectServiceForm(List<String> s) {services = s;}
    @Override
    public void setController(Controller c) {controller = c;}

    @Override
    public void getInfoFromUser() {
        System.out.println("Services: ");
        for (int i=0;i<services.size();i++)
            System.out.println((i+1) + ". " + services.get(i));

        Scanner in = new Scanner(System.in);
        System.out.print("choose: ");
        int srv = in.nextInt();
        while (srv <1 || srv> services.size())
        {
            System.out.print("try again! choose: ");
            srv = in.nextInt();
        }

        Map m = new HashMap<>();
        m.put("name", services.get(srv-1));
        m.put("type", "cli");
        controller.execute(m);
    }
}
