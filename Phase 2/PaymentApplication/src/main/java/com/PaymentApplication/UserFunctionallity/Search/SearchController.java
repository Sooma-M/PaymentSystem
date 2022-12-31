package com.PaymentApplication.UserFunctionallity.Search;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SearchController {

    @GetMapping(value = "/user/search/{search}")
    public ResponseEntity searchForServices(@PathVariable String search)
    {
        try {
            ISearch s = SearchFactory.createSearch("simple");
            ArrayList<String> list = s.search(search);
            //success
            return ResponseEntity.status(HttpStatus.OK).body("Search Result: \n" + StringUtils.join(list, '\n'));
        }catch (IllegalAccessError ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
        }
    }
}
