package com.PaymentApplication.UserFunctionallity.Search;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class SearchForm {

    @GetMapping(value = "/user/search/{search}")
    public HashMap getInfoFromUser(@PathVariable String search)
    {
        HashMap message = new HashMap<>();
        try {
            SearchController controller = SearchFactory.createController("simple");
            ArrayList list = controller.execute(search);
            message.put("Status", true);
            message.put("Services List", list);
            return message;
        }catch (IllegalArgumentException ex) {
            message.put("Status", false);
            message.put("Message", ex.getMessage());
            return message;
        }
    }
}
