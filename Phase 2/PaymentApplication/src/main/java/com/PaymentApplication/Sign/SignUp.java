package com.PaymentApplication.Sign;

import com.PaymentApplication.Exceptions.Sign.SignUpException;
import com.PaymentApplication.User.User;
import com.PaymentApplication.User.UserAccounts;

import java.util.HashMap;

public class SignUp implements Authentication{
    @Override
    public void executeSign(HashMap m){

        CheckUser controller = SignFactory.createChecker("sign-up");
        User user = controller.check(m);

        //failed
        if (user != null)
            throw new SignUpException();

        //success
        User new_user = new User((String) m.get("username"), (String) m.get("email"), (String) m.get("password"));
        UserAccounts.getInstance().addUser(new_user);
    }
}
