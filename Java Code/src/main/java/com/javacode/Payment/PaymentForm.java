package com.javacode.Payment;

import com.javacode.Command;
import com.javacode.FormUI;

public class PaymentForm implements FormUI {
    Command command;
    @Override
    public void setCommand(Command c) {
        command = c;
    }

    @Override
    public void getInfoFromUser() {

    }
}
