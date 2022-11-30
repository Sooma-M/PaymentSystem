package com.javacode;

import java.util.Map;
import java.util.Objects;

public class SpecificDiscount implements discount{
    @Override
    public void makeDiscount(Map<String, Long> map) {
        for (Map.Entry<String, Long> entry : map.entrySet()){
            if(Objects.equals(entry.getKey(), "MobileRechargeService")){
                long price =entry.getValue();
              //  entry.setValue()
            }
            else if(Objects.equals(entry.getKey(), "InternetPaymentService")){
                long price =entry.getValue();
                //  entry.setValue()
            }
            else if(Objects.equals(entry.getKey(), "DonationService")){
                long price =entry.getValue();
                //  entry.setValue()
            }
            else if(Objects.equals(entry.getKey(), "LandlineService")){
                long price =entry.getValue();
                //  entry.setValue()
            }

        }
    }
}
