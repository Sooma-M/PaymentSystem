package com.javacode.Services;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ServiceForm implements FormUI {
    Service service;
    Command command;
    public ServiceForm(Service s) {service = s;}
    @Override
    public void setCommand(Command c) {command = c;}

    @Override
    public void getInfoFromUser() {
        /*List<ServiceProvider> providers = service.getProviders();
        Scanner in = new Scanner(System.in);
        if (providers.size() == 0)
        {
            System.out.println("No providers to this service yet.");
            return;
        }
        System.out.println("Select service provider: ");
        for (int i=0 ; i<providers.size() ; i++)
        {
            System.out.println((i+1) + ". " +providers.get(i).getName());
        }
        System.out.print("choose: ");
        int choose = in.nextInt();
        while (choose <1 || choose> providers.size())
        {
            System.out.print("try again! choose: ");
            choose = in.nextInt();
        }
        Map m = new HashMap();
        m.put("provider", providers.get(choose - 1));
        command.execute(m);*/
    }
}
