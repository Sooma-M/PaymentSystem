package com.javacode.Admin;

import com.javacode.DropDownField;
import com.javacode.Model.AdminDatabase;
import com.javacode.Services.*;
import com.javacode.TextField;

import java.security.Provider;
import java.util.*;

public class AddNewProvider {
    private ArrayList<providerObject>NewProvider;
    private ArrayList<TextField>textFields;
    private ArrayList<DropDownField>dropDownFields;
    private ServiceFactory factory;
    AddNewProvider(){
    NewProvider=new ArrayList<>();
    textFields=new ArrayList<>();
    dropDownFields=new ArrayList<>();
    factory=new ServiceFactory();
    }
      public void add_provider(){
          Scanner in = new Scanner(System.in);
          System.out.println("Enter provider name :");
          String providerName=in.nextLine();
          System.out.println("Enter Service name you want to add this provider to it  :");
          String sreviceName=in.nextLine();
          Service ser= factory.createService(sreviceName);
          System.out.print("Enter number of DropDownfield you want : ");
          String number1= in.nextLine();
          System.out.print("Enter number of Text field you want : ");
          String number2= in.nextLine();

          for (int i=0;i<Integer.parseInt(number1);i++){
              List<String> list = new ArrayList<>();
              System.out.print("enter name of label: ");
              String name= in.nextLine();
              System.out.println("enter number of element in list you want: ");
              String n=in.nextLine();
              for (int j=0;j<Integer.parseInt(n);j++){
                  String numm=in.nextLine();
                  list.add(numm);

              }
              DropDownField obj=new DropDownField();
              obj.DropDownField_setval(name,list);
              dropDownFields.add(obj);
          }
          for (int i=0;i<Integer.parseInt(number2);i++){
              System.out.println("Enter name of text field : ");
              String name=in.nextLine();
              TextField obj=new TextField();
              obj.setValue(name);
              textFields.add(obj);

          }
          providerObject p=new providerObject();
          p.set(providerName,dropDownFields,textFields);
          ser.addProvider(p);
        }


}
