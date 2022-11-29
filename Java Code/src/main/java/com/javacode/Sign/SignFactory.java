package com.javacode.Sign;

public class SignFactory {
    public Authentication createForm(String type) {
        if (type.equals("sign-in"))
            return new SignIn();
        else if (type.equals("sign-up"))
            return new SignUp();
        return null;
    }
}
