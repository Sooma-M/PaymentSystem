package com.javacode.AdminFunctionality.Discounts;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.Map;

public class DiscountCommand implements Command {
    @Override
    public void execute(Map m) {
        MakeDiscountFactory factory =new MakeDiscountFactory();
        FormUI form = factory.createForm((String) m.get("Discount_type"));
        form.setCommand(factory.createCommand((String) m.get("Discount_type")));
        form.getInfoFromUser();
    }
}
