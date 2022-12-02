package com.javacode.AdminFunctionality.AddProvider;

import com.javacode.AdminFunctionality.Discounts.ApplyDiscount;
import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.Model.CurrentService;
import com.javacode.Model.CurrentUser;
import com.javacode.Payment.PaymentCommand;
import com.javacode.Payment.PaymentForm;
import com.javacode.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProviderCommand implements Command {
    @Override
    public void execute(Map m) {
        Map text = (Map) m.get("text");
        double amount = Double.parseDouble((String) text.get("amount"));

        amount = ApplyDiscount.makeDiscount(amount);

        //go to pay
        FormUI form = new PaymentForm(amount);
        form.setCommand(new PaymentCommand());
        try {
            form.getInfoFromUser();
            Transaction transaction = new Transaction(CurrentService.getService().getName(),amount);
            CurrentUser.getUser().addTransaction(transaction);
        }catch (IllegalArgumentException ex) {
            //System.out.println("");
        }
    }
}
