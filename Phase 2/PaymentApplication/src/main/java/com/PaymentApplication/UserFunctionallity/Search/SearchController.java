package com.PaymentApplication.UserFunctionallity.Search;

import com.PaymentApplication.Exceptions.Sign.SignException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SearchController {

    @GetMapping(value = "/user/search/{search}")
    public String searchForServices(@PathVariable String search)
    {
        try {
            ISearch s = SearchFactory.createSearch("simple");
            ArrayList<String> list = s.search(search);
            //success
            return ("Search Result: " + list.toString());
        }catch (SignException ex) {
            //failed
            return ex.getMessage();
        }
    }
}
