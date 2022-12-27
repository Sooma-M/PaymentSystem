package com.PaymentApplication.Sign;

public class SignFactory {
    public static Authentication createSign(String type) {
        if (type.equals("sign-in"))
            return new SignIn();
        else if (type.equals("sign-up"))
            return new SignUp();
        return null;
    }

    public static CheckUser createChecker(String type) {
        if (type.equals("sign-in"))
            return new SignInChecker();
        else if (type.equals("sign-up"))
            return new SignUpChecker();
        return null;
    }
}
