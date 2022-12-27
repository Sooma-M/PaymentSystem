package com.PaymentApplication.Sign;

import com.PaymentApplication.Exceptions.Sign.SignException;
import com.PaymentApplication.User.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SignController {

    @PostMapping(value = "/user/sign-in")
    public String sign_in(@RequestBody HashMap<String, String> m)
    {
        try {
            Authentication controller = SignFactory.createSign("sign-in");
            controller.executeSign(m);
            return "Success";
        }catch (SignException ex) {
            return ex.getMessage();
        }
    }

    @PostMapping(value = "/user/sign-up")
    public String sign_up(@RequestBody HashMap<String, String> m)
    {
        try {
            Authentication controller = SignFactory.createSign("sign-up");
            controller.executeSign(m);
            return "Success";
        }catch (SignException ex) {
            return ex.getMessage();
        }
    }

    @GetMapping(value = "/user/check")
    public String check_user(@RequestBody HashMap<String, String> m)
    {
        CheckUser controller = SignFactory.createChecker("sign-in");
        User u = controller.check(m);
        if (u==null)
            return "user not exist";
        return u.toString();
    }
}
