package com.javacode.AdminFunctionality.Discounts;
import com.javacode.Command;
import com.javacode.FormUI;
import java.util.Map;
public class DiscountCommand implements Command {
    @Override
    public void execute(Map m) {
        if(m.get("Discount_type").equals("Overall_discount")){
            FormUI form = new OverallDiscountForm();
        }
        else if(m.get("Discount_type").equals("Specific_discount")){
            FormUI form = new SpecificDiscountForm();
        }
    }
}
