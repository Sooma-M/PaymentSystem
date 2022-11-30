package com.javacode.AdminFunctionality.AddProvider;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.*;

public class AddNewProviderForm implements FormUI {
    Command command;
    private List<String> name;
    public AddNewProviderForm()
    {
        name = new ArrayList<>();
        name.add("Mobile Recharge Services");
        name.add("Internet Payment Services");
        name.add("Landline Services");
        name.add("Donation Services");
    }
    public void addNewService(String n) {name.add(n);}
    @Override
    public void setCommand(Command c) {
        command = c;
    }
    @Override
    public void getInfoFromUser(){
        List<TextField>textFields = new ArrayList<>();
        List<DropDownField>dropDownFields = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Services in the system: ");
        for (int i=0 ; i<name.size() ; i++)
            System.out.println((i+1) + ". " +name.get(i));
        System.out.print("Enter number of the service you want to add this provider to it: ");
        String choose = in.nextLine();
        while (Integer.parseInt(choose)<1 || Integer.parseInt(choose)>name.size())
        {
            System.out.print("try again! choose: ");
            choose = in.nextLine();
        }
        System.out.print("Enter provider name : ");
        String providerName=in.nextLine();

        textFields.add(new TextField("amount"));
        System.out.println("* Note: your provider (" + providerName + ") now have TextField called amount to take amount you want to pay!");

        System.out.print("Enter number of DropDownField you want : ");
        String number1= in.nextLine();

        for (int i=0;i<Integer.parseInt(number1);i++)
        {
            System.out.println("DropDownField #"+(i+1));
            System.out.print("enter name of label: ");
            String name = in.nextLine();
            //check exist!
            outer: while (true) {
                for (Field d : dropDownFields)
                    if (d.getLabel().equals(name)) {
                        System.out.print("label is exist! enter the name again: ");
                        name = in.nextLine();
                        continue outer;
                    }
                break;
            }
            List<String> list = new ArrayList<>();
            System.out.print("enter number of element in list you want: ");
            String n = in.nextLine();
            for (int j = 0; j < Integer.parseInt(n); j++) {
                System.out.print("element #" + (j+1) +" : ");
                String numm = in.nextLine();
                //check exist!
                outer: while (true) {
                    for (String s : list)
                        if (s.equals(numm))
                        {
                            System.out.print("element is exist! enter another: ");
                            numm = in.nextLine();
                            continue outer;
                        }
                    break;
                }
                list.add(numm);
            }
            DropDownField obj = new DropDownField(name, list);
            dropDownFields.add(obj);
        }

        System.out.print("Enter number of TextField you want : ");
        String number2= in.nextLine();

        for (int i=0;i<Integer.parseInt(number2);i++)
        {
            System.out.println("TextField #"+(i+1));
            System.out.print("Enter name of text field : ");
            String name=in.nextLine();
            //check exist!
            outer: while (true) {
                for (Field d : dropDownFields)
                    if (d.getLabel().equals(name)) {
                        System.out.print("label is exist! enter the name again: ");
                        name = in.nextLine();
                        continue outer;
                    }
                for (Field d : textFields)
                    if (d.getLabel().equals(name)) {
                        System.out.print("label is exist! enter the name again: ");
                        name = in.nextLine();
                        continue outer;
                    }
                break;
            }
            TextField obj=new TextField(name);
            textFields.add(obj);
        }

        try {
            if (Integer.parseInt(number1) == 0 && Integer.parseInt(number2) == 0)
                throw new IllegalArgumentException("Failed! you cannot add provider without any fields!");

            Map m = new HashMap();
            m.put("service",name.get(Integer.parseInt(choose)-1));
            m.put("name", providerName);
            m.put("drop", dropDownFields);
            m.put("text", textFields);

            command.execute(m);
            System.out.println("Success!");
            System.out.println();
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
