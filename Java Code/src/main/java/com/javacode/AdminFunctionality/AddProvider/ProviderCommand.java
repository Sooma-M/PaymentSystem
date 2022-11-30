package com.javacode.AdminFunctionality.AddProvider;

import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.Model.CurrentService;
import com.javacode.Model.CurrentUser;
import com.javacode.Payment.PaymentCommand;
import com.javacode.Payment.PaymentForm;
import com.javacode.Transactions;

import java.util.List;
import java.util.Map;

public class ProviderCommand implements Command {
    @Override
    public void execute(Map m) {
        Map text = (Map) m.get("text");
        double amount = Double.parseDouble((String) text.get("amount"));

        //make discounts
        List<Discount> dicounts = CurrentService.getService().getDiscounts();
        for (Discount discount : dicounts)
            amount = discount.makeDiscount(amount);

        //go to pay
        FormUI form = new PaymentForm(amount);
        form.setCommand(new PaymentCommand());
        try {
            form.getInfoFromUser();
            Transactions transaction = new Transactions(CurrentService.getService().getName(),amount);
            CurrentUser.getUser().addTransaction(transaction);
        }catch (IllegalArgumentException ex) {
            //System.out.println("");
        }
    }
}
