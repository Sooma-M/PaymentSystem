package com.javacode.Sign;

import com.javacode.Command;
import com.javacode.FormUI;

public class SignFactory {
    public FormUI createForm(String type) {
        if (type.equals("sign-in"))
            return new SignInForm();
        else if (type.equals("sign-up"))
            return new SignUpForm();
        return null;
    }

    public Authentication createSign(String type) {
        if (type.equals("sign-in"))
            return new SignIn();
        else if (type.equals("sign-up"))
            return new SignUp();
        return null;
    }

    public Command createCommand(String type , Object o) {
        if (type.equals("sign-in") || type.equals("sign-up"))
            return new SignCommand((Authentication) o);
        return null;
    }

}
