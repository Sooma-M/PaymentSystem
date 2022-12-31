package com.PaymentApplication.UserFunctionallity.RefundRequest;

import java.util.ArrayList;
import java.util.HashMap;

public interface IRefund {
    void makeRequest(HashMap m);
    ArrayList getRequests();
}
