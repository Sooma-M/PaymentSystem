package com.PaymentApplication.ServiceProvider.Donation;

import com.PaymentApplication.Exceptions.ServiceProvider.ServiceProviderException;
import com.PaymentApplication.ServiceProvider.ServiceController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DonationForm {
    @GetMapping(value = "/user/provider/donation/{name}")
    public String getInfoFromUser(@PathVariable String name, @RequestBody HashMap m){
        try {
            ServiceController service = new ServiceController();
            service.execute("donation", name, m);
            return "Success";
        }catch (ServiceProviderException ex) {
            return ex.getMessage();
        }
    }
}
