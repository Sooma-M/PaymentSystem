package com.javacode.UserFunctionallity.checkDiscount;

import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.Services.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class checkDicount implements Check{
    DiscountFactory object;

    private ArrayList<Discount>result;
    public checkDicount(){
       result=new ArrayList<>();
       object=new DiscountFactory();
    }
    @Override
    public ArrayList<Discount> check(Map map) {
        Service service_name= (Service) object.create_service(map);
        result= (ArrayList<Discount>) service_name.getDiscounts();

        return result;
    }
}
