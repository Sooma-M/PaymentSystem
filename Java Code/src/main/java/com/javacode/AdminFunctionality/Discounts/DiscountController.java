package com.javacode.AdminFunctionality.Discounts;

import com.javacode.Controller;
import com.javacode.FormUI;

import java.util.Map;

public class DiscountController implements Controller {
    @Override
    public void execute(Map m) {
        MakeDiscountFactory factory =new MakeDiscountFactory();
        FormUI form = factory.createForm((String) m.get("Discount_type"));
        form.setController(factory.createController((String) m.get("Discount_type")));
        form.getInfoFromUser();
    }
}
