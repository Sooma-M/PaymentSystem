package com.javacode.UserFunctionallity.checkDiscount;

import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.Command;
import com.javacode.FormUI;

import java.util.*;

public class DicountForm implements FormUI {
    Command command;

    @Override
    public void setCommand(Command c) {
        this.command=c;
    }

    @Override
    public void getInfoFromUser() {
        Map m = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of service you want to check discount  :");
        System.out.println("1.Mobile Recharge Services");
        System.out.println("2.Internet Payment Services");
        System.out.println("3.Landline Services");
        System.out.println("4.Donation Services");
        System.out.print("choose: ");
        String dis=in.nextLine();
        m.put("service name",dis);
        m.put("form", this);
        command.execute(m);
    }
    public void DiscountResult(List result){
        List<Discount>res=new ArrayList<>();
        res=result;
        if(res.size()==0){
            System.out.println("no");
        }
        for (int i=0;i<res.size();i++){
            System.out.println(res.get(i).getName()+" "+res.get(i).getAmount());
        }
    }
}
