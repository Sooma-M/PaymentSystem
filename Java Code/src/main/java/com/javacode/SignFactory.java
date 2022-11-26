package com.javacode;

public class SignFactory implements FormFactory{
    @Override
    public FormUI createForm(String type) {
        if (type == "sign-in")
            return new SignInForm();
        else if (type == "sign-up")
            return new SignUpForm();
        return null;
    }
}
