package com.javacode.AdminFunctionality;
import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.AdminFunctionality.Discounts.DiscountCommand;
import com.javacode.Command;
import com.javacode.CommandFactory;
public class AdminFunctionCommandFactory implements CommandFactory {
    @Override
    public Command createCommand(String type, Object o) {
        if (type.equals("Add_NewService_provider"))
            return null;
        else if (type.equals("Add_Discount"))
            return new DiscountCommand();
        else if (type.equals("List_refund_Requests"))
            return null;
        return null;
    }
}
