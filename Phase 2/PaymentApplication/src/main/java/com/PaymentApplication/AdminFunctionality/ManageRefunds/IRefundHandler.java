package com.PaymentApplication.AdminFunctionality.ManageRefunds;

import java.util.HashMap;
import java.util.Map;

public interface IRefundHandler {
    HashMap getRequests();
    void execute(Map m);
}
