package com.PaymentApplication.ServiceProvider.Mobile;

import com.PaymentApplication.ServiceProvider.ServiceController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MobileForm{
    @GetMapping(value = "/user/provider/mobile/{name}")
    public String getInfoFromUser(@PathVariable String name, @RequestBody HashMap m){
        try {
            ServiceController service = new ServiceController();
            service.execute("mobile", name, m);
            return "Success";
        }catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }
}
