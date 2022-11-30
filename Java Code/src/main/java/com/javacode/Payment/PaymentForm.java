package com.javacode.Payment;

import com.javacode.Command;
import com.javacode.FormUI;

public class PaymentForm implements FormUI {
    Command command;
    double amount;
    public PaymentForm(double amount)
    {
        this.amount = amount;
    }
    @Override
    public void setCommand(Command c) {
        command = new PaymentCommand();
    }

    @Override
    public void getInfoFromUser() {
        System.out.println("in payment form");
    }
}
