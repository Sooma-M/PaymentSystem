package com.javacode.AdminFunctionality.AddProvider;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProviderForm implements FormUI {
    ServiceProvider provider;
    Command command;
    public ProviderForm(ServiceProvider p) {
        provider = p;
    }
    @Override
    public void setCommand(Command c) {
        command = new ProviderCommand();
    }

    @Override
    public void getInfoFromUser() {
        List<TextField> textFields = provider.getTextField();
        List<DropDownField> dropDownFields = provider.getDropDownField();
        Map textResult = new HashMap<>();
        Map dropResult = new HashMap<>();
        Scanner in = new Scanner(System.in);

        for (TextField text : textFields)
        {
            System.out.print(text.getLabel() + ": ");
            String value = in.nextLine();
            textResult.put(text.getLabel(), value);
        }
        for (DropDownField text : dropDownFields)
        {
            List values = text.getValue();
            System.out.println(text.getLabel() + ": ");
            for (int i=0; i<values.size();i++)
                System.out.println((i+1)+ ". "+values.get(i));
            System.out.print("choose: ");
            String choose = in.nextLine();
            while (Integer.parseInt(choose) <1 || Integer.parseInt(choose)> values.size())
            {
                System.out.print("try again! choose: ");
                choose = in.nextLine();
            }
            dropResult.put(text.getLabel(), values.get(Integer.parseInt(choose)-1));
        }
        Map m = new HashMap<>();
        m.put("text", textResult);
        m.put("drop", dropResult);
        command.execute(m);
    }
}
