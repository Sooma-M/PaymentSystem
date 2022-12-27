package com.PaymentApplication.ServiceProvider.Landline;

import com.PaymentApplication.Exceptions.ServiceProvider.ServiceProviderException;
import com.PaymentApplication.ServiceProvider.ServiceController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LandlineForm {
    @GetMapping(value = "/user/provider/landline/{name}")
    public String getInfoFromUser(@PathVariable String name, @RequestBody HashMap m){
        try {
            ServiceController service = new ServiceController();
            service.execute("landline",name, m);
            return "Success";
        }catch (ServiceProviderException ex) {
            return ex.getMessage();
        }
    }
}
