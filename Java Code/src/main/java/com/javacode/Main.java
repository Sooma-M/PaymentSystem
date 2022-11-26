package com.javacode;

public class Main{

    public static void main(String[] args) {
        Authentication sign = new SignIn();
        Command c = new SignCommand(sign);
        FormUI form = new SignInForm();
        form.setCommand(c);
        form.getInfoFromUser();
    }
}