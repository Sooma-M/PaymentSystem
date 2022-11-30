package com.javacode;

import java.util.Date;
import java.util.Map;

public interface discount {
    String describtion = "";
    Date date = null;
    Integer DiscountPercent = null;
    public void makeDiscount(Map<String,Long>  map);
}
