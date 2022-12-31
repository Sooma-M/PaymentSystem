package com.PaymentApplication.Sign;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class SignController {

    @PostMapping(value = "/user/sign/{way}") //sign-in, sign-up
    public ResponseEntity user_sign(@PathVariable String way, @RequestBody HashMap<String, String> m)
    {
        try {
            Authentication controller = SignFactory.createSign(way);
            if (controller == null)
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Check the URL and try again");
            controller.executeSign(m);

            if (way.equals("sign-up"))
                return ResponseEntity.status(HttpStatus.CREATED).build();
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
        }
    }
}
