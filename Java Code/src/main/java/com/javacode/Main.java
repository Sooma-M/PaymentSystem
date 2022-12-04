package com.javacode;

import com.javacode.AdminFunctionality.AdminFunctionFactory;
import com.javacode.Model.MainFunction.AdminFumctionList;
import com.javacode.Model.MainFunction.SignList;
import com.javacode.Model.MainFunction.UserFunctionList;
import com.javacode.Model.CurrentUser;
import com.javacode.Sign.Authentication;
import com.javacode.Sign.SignFactory;
import com.javacode.UserFunctionallity.UserFunctionFactory;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true)
        {
            List<String> signs = SignList.getInstance().getName();
            System.out.println("Choose what you want: ");
            for (int i = 0 ; i<signs.size() ; i++)
                System.out.println((i+1)+". "+signs.get(i));
            System.out.println((signs.size()+1) +". Exit");
            System.out.print("choose: ");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();
            while (choose < 1 || choose > signs.size()+1)
            {
                System.out.print("try again! choose: ");
                choose = in.nextInt();
            }
            if (choose == signs.size()+1) {
                System.out.println("Thank you for using our system.");
                break;
            }
            try {
                SignFactory signFactory = new SignFactory();
                Authentication sign = signFactory.createSign(signs.get(choose-1));
                FormUI form = signFactory.createForm(signs.get(choose-1));
                Controller c = signFactory.createController(signs.get(choose-1),sign);
                form.setController(c);
                form.getInfoFromUser();
                System.out.println("Success");
                System.out.println();
                List<String> services = null;
                //admin
                if (signs.get(choose-1).equals("sign-in") && CurrentUser.getUser().getUsername().equals("admin"))
                {
                    //get values from the admin
                    services = AdminFumctionList.getInstance().getName();
                    while (true) {
                        System.out.println("Welcome " + CurrentUser.getUser().getUsername() + ", please select the function that you want to use: ");
                        for (int i = 0 ; i<services.size() ; i++)
                            System.out.println((i+1)+". "+services.get(i));
                        System.out.println((services.size()+1) +". Log-out");
                        System.out.print("choose: ");
                        choose = in.nextInt();
                        while (choose < 1 || choose > services.size()+1)
                        {
                            System.out.print("try again! choose: ");
                            choose = in.nextInt();
                        }
                        System.out.println();

                        if (choose == services.size()+1 || services.get(choose-1).equals("Access user functionality")) {
                            break;
                        }
                        FunctionFactory factory = new AdminFunctionFactory();
                        Object serve = factory.createFunction(services.get(choose - 1));
                        c = factory.createController(services.get(choose - 1), serve);
                        form = factory.createForm(services.get(choose - 1));
                        form.setController(c);
                        form.getInfoFromUser();
                    }
                }//user
                if ((services == null && signs.get(choose-1).equals("sign-in") && !CurrentUser.getUser().getUsername().equals("admin"))
                        || ( services != null && choose <= services.size() && services.get(choose-1).equals("Access user functionality")))
                {
                    //get values from the user
                    services = UserFunctionList.getInstance().getName();
                    while (true)
                    {
                        System.out.println("Welcome " + CurrentUser.getUser().getUsername() + ", please select the function that you want to use: ");
                        for (int i = 0 ; i<services.size() ; i++)
                            System.out.println((i+1)+". "+services.get(i));
                        System.out.println((services.size()+1) +". Log-out");
                        System.out.print("choose: ");
                        choose = in.nextInt();
                        while (choose < 1 || choose > services.size()+1)
                        {
                            System.out.print("try again! choose: ");
                            choose = in.nextInt();
                        }
                        System.out.println();

                        if (choose == services.size()+1) {
                            break;
                        }

                        FunctionFactory factory = new UserFunctionFactory();
                        Object serve = factory.createFunction(services.get(choose-1));
                        c = factory.createController(services.get(choose-1), serve);
                        form = factory.createForm(services.get(choose-1));
                        form.setController(c);
                        form.getInfoFromUser();
                    }
                }
            }catch (IllegalArgumentException ex)
            {
                //System.out.println("");
            }
        }
    }
}