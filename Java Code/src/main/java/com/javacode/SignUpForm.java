package com.javacode;

public class SignUpForm implements FormUI{
    private Command command;
    @Override
    public void setCommand(Command c) {
        command = c;
    }
    @Override
    public void getInfoFromUser() {

    }
}
