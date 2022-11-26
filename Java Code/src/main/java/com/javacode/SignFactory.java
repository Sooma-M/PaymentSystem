package com.javacode;

public class SignFactory implements FormFactory{
    @Override
    public FormUI createForm(String type) {
        if (type.equals("sign-in"))
            return new SignInForm();
        else if (type.equals("sign-up"))
            return new SignUpForm();
        return null;
    }
}
