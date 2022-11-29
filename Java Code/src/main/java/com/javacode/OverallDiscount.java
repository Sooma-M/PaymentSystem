package com.javacode;
import java.util.Map;
import java.util.Objects;

public class OverallDiscount implements discount {
    @Override
    public void makeDiscount(Map<String, Long> map) {

        for (Map.Entry<String, Long> entry : map.entrySet()){
            long price =(entry.getValue());
            price=price*(DiscountPercent/100);
            entry.setValue(price);
        }
    }

}
