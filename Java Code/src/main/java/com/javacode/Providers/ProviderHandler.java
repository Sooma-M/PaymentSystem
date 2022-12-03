package com.javacode.Providers;

import com.javacode.AdminFunctionality.Discounts.ApplyDiscount;
import com.javacode.FormUI;
import com.javacode.Model.CurrentService;
import com.javacode.Model.CurrentUser;
import com.javacode.Payment.PaymentFactory;
import com.javacode.Transaction;

import java.util.Map;

public abstract class ProviderHandler{

    public void execute(Map m) {
        //apply discounts
        double amount = Double.parseDouble((String) m.get("amount"));
        amount = ApplyDiscount.makeDiscount(amount);

        //go to pay
        PaymentFactory factory = new PaymentFactory();
        FormUI form = factory.createForm(amount);
        form.setCommand(factory.createCommand());
        try {
            form.getInfoFromUser();

            //save the transaction!
            Transaction transaction = new Transaction(CurrentService.getService().getName(), amount);
            CurrentUser.getUser().addTransaction(transaction);
        }catch (IllegalArgumentException ex) {
            //System.out.println("");
        }
    }
}
