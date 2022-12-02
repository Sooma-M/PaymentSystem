package com.javacode.Services;

import com.javacode.AdminFunctionality.AddProvider.ServiceProvider;
import com.javacode.Command;
import com.javacode.FormUI;

import java.util.*;

public class ServiceForm implements FormUI {
    private Map providers;
    Command command;
    public ServiceForm(Map p) {providers = p;}
    @Override
    public void setCommand(Command c) {command = c;}

    @Override
    public void getInfoFromUser() {
        //create list with providers name
        List<String> names = new ArrayList<>();
        for (Object pro : providers.keySet())
            names.add((String) pro);

        if (names.size() == 0)
        {
            System.out.println("No providers to this service yet.");
            return;
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Select service provider: ");
        for (int i=0 ; i<names.size() ; i++)
            System.out.println((i+1)+". "+names.get(i));
        System.out.print("choose: ");
        int choose = in.nextInt();
        while (choose <1 || choose> names.size())
        {
            System.out.print("try again! choose: ");
            choose = in.nextInt();
        }
        System.out.println();
        Map m = new HashMap();
        m.put("provider", providers.get(names.get(choose-1)));
        m.put("type","cli");
        command.execute(m);
    }
}
