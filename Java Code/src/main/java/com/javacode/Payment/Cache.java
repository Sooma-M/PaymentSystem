package com.javacode.Payment;


import java.util.Scanner;

public class Cache implements Payment {
    @Override
    public void pay(double amount){
        Scanner in = new Scanner(System.in);
        System.out.println("You will pay " + amount +" by cache!");
        System.out.print("Your address: ");
        String addr = in.nextLine();
    }
}
