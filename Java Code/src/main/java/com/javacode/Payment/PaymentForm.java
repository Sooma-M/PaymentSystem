package com.javacode.Payment;

import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.Model.CurrentService;

import java.util.*;

public class PaymentForm implements FormUI {
    private Command command;
    private double amount;
    private List<String> names;

    public PaymentForm(double amount, List<String> names) {
        this.amount = amount;
        this.names = names;
    }
    @Override
    public void setCommand(Command c) {
        command = new PaymentCommand();
    }

    @Override
    public void getInfoFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("the amount: "+amount);
        System.out.println("you will pay by credit card, do you want to change? y/n");
        char ans = in.next().charAt(0);
        while (ans != 'y' && ans!='n')
        {
            System.out.print("please write y (for yes) or n (for no): ");
            ans = in.next().charAt(0);
        }
        Map m = new HashMap<>();
        if (ans == 'y')
        {
            System.out.println("you can pay by: ");
            for (int i=0;i<2;i++)
                System.out.println((i+1)+". "+names.get(i));
            if(CurrentService.getService().getCacheAccept())
                System.out.println("3. "+names.get(2));
            System.out.print("choose: ");
            String choose = in.next();
            while ((Integer.parseInt(choose) < 1 || Integer.parseInt(choose) > names.size()) && CurrentService.getService().getCacheAccept())
            {
                System.out.print("try again! choose: ");
                choose = in.next();
            }
            while ((Integer.parseInt(choose) < 1 || Integer.parseInt(choose) > (names.size()-1))&& !CurrentService.getService().getCacheAccept())
            {
                System.out.print("try again! choose: ");
                choose = in.next();
            }
            m.put("way", names.get(Integer.parseInt(choose)-1));
        }
        else
            m.put("way", "no change");
        m.put("amount", amount);
        try {
            command.execute(m);
            System.out.println("Success!");
            System.out.println();
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}
