package com.PaymentApplication.Sign;

import com.PaymentApplication.User.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CheckUserController {

    @GetMapping(value = "/user/check")
    public ResponseEntity check_user(@RequestBody HashMap<String, String> m)
    {
        CheckUser controller = SignFactory.createChecker("sign-in");
        User u = controller.check(m);
        if (u==null)
            return ResponseEntity.status(HttpStatus.OK).body("User not exist!");
        return ResponseEntity.status(HttpStatus.OK).body(u.toString());
    }
}
