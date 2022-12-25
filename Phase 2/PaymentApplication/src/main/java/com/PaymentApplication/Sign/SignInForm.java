package com.PaymentApplication.Sign;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SignInForm {

    @PostMapping(value = "/user/sign-in")
    public String getInfoFromUser(@RequestBody HashMap<String, String> m)
    {
        //send values to command
        try {
            Controller controller = SignFactory.createController("sign-in");
            controller.execute(m);
            return "Success";
        }catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }
}
