package com.PaymentApplication.Sign;

import com.PaymentApplication.ServiceProvider.CurrentService;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.User;

import java.util.HashMap;

public class SignIn implements Authentication {
    @Override
    public void executeSign(HashMap m) {
        CheckUser controller = SignFactory.createChecker("sign-in");
        User user = controller.check(m);

        //failed
        if (user == null)
            throw new IllegalArgumentException("User not exist, please try again");

        //success
        CurrentService.setService(null);
        CurrentUser.setUser(user);
    }
}
