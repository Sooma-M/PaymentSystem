package com.javacode;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        while (true)
        {
            System.out.println("Choose what you want: ");
            System.out.println("1. Sign-In");
            System.out.println("2. Sign-Up");
            System.out.print("choose: ");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();
            while (choose != 1 && choose != 2)
            {
                System.out.println("try again! choose: ");
                choose = in.nextInt();
            }
            if (choose == 1)
            {
                Authentication sign = new SignIn();
                Command c = new SignCommand(sign);
                FormUI form = new SignFactory().createForm("sign-in");
                form.setCommand(c);
                form.getInfoFromUser();
            }
            else if (choose == 2)
            {
                Authentication sign = new SignUp();
                Command c = new SignCommand(sign);
                FormUI form = new SignFactory().createForm("sign-up");
                form.setCommand(c);
                form.getInfoFromUser();
            }
            System.out.println("Thank You");
        }
    }
}