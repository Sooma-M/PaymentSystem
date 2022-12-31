package com.PaymentApplication.UserFunctionallity.Search;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
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
            return ("Search Result: \n" + list.toString());
        }catch (IllegalArgumentException ex) {
            //failed
            return ex.getMessage();
        }
    }
}
