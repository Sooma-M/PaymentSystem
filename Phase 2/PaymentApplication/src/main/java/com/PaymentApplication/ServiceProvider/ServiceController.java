package com.PaymentApplication.ServiceProvider;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ServiceController {
    @GetMapping(value = "/user/provider/{type}/{name}/save-for-payment")
    public ResponseEntity<String> getService(@PathVariable String type, @PathVariable String name, @RequestBody HashMap m){
        IServiceHandler handler = ServiceFactory.createService("simple");
        try {
            handler.saveService(type, name, m);
            return ResponseEntity.status(HttpStatus.OK).body("Success");
        }catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @GetMapping(value = "/user/provider/get-fees")
    public ResponseEntity<String> getFees(){
        IServiceHandler handler = ServiceFactory.createService("simple");
        try {
            return ResponseEntity.status(HttpStatus.OK).body("Fees: " + handler.getFees());
        }catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }
}
