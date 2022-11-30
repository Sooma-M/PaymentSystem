package com.javacode;

import com.javacode.Model.CurrentUser;
import com.javacode.Sign.Authentication;
import com.javacode.Sign.SignCommand;
import com.javacode.Sign.SignFactory;
import com.javacode.UserFunctionallity.UserFunctionFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true)
        {
            List<String> signs = new ArrayList<>();
            signs.add("sign-in");
            signs.add("sign-up");
            System.out.println("Choose what you want: ");
            System.out.println("1. Sign-In");
            System.out.println("2. Sign-Up");
            System.out.println("3. Exit");
            System.out.print("choose: ");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();
            while (choose < 1 || choose > 3)
            {
                System.out.print("try again! choose: ");
                choose = in.nextInt();
            }
            if (choose == 3) {
                System.out.println("Thank you for using our system.");
                break;
            }
            try {
                SignFactory signFactory = new SignFactory();
                Authentication sign = signFactory.createSign(signs.get(choose-1));
                FormUI form = signFactory.createForm(signs.get(choose-1));
                Command c = new SignCommand(sign);
                form.setCommand(c);
                form.getInfoFromUser();
                System.out.println("Success");
                System.out.println();
                if (choose == 1)
                {
                    //get values from the user
                    List<String> services = new ArrayList<>();
                    services.add("search");
                    services.add("refund");
                    services.add("discount");
                    services.add("wallet");
                    while (true)
                    {
                        System.out.println("Welcome "+ CurrentUser.getUser().getUsername() +", please select the function that you want to use: ");
                        System.out.println("1. Search for Services");
                        System.out.println("2. Get Refund");
                        System.out.println("3. Check Discount");
                        System.out.println("4. Add Funds to the Wallet");
                        System.out.println("5. Log-out");
                        System.out.print("choose: ");
                        choose = in.nextInt();
                        while (choose < 1 || choose > 5)
                        {
                            System.out.print("try again! choose: ");
                            choose = in.nextInt();
                        }
                        System.out.println();
                        if (choose == 5)
                            break;
                        FunctionFactory factory = new UserFunctionFactory();
                        Object serve = factory.createFunction(services.get(choose-1));
                        c = factory.createCommand(services.get(choose-1), serve);
                        form = factory.createForm(services.get(choose-1));
                        form.setCommand(c);
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