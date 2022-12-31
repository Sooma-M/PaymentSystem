package com.PaymentApplication.Sign;

import com.PaymentApplication.User.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SignController {

    @PostMapping(value = "/user/sign-in")
    public ResponseEntity sign_in(@RequestBody HashMap<String, String> m)
    {
        try {
            Authentication controller = SignFactory.createSign("sign-in");
            controller.executeSign(m);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
        }
    }

    @PostMapping(value = "/user/sign-up")
    public ResponseEntity sign_up(@RequestBody HashMap<String, String> m)
    {
        try {
            Authentication controller = SignFactory.createSign("sign-up");
            controller.executeSign(m);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
        }
    }

    @GetMapping(value = "/user/check")
    public ResponseEntity check_user(@RequestBody HashMap<String, String> m)
    {
        CheckUser controller = SignFactory.createChecker("sign-in");
        User u = controller.check(m);
        if (u==null)
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("User not exist!");
        return ResponseEntity.status(HttpStatus.OK).body(u.toString());
    }
}
