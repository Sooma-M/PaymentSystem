package com.PaymentApplication.UserFunctionallity.RefundRequest;

import java.util.ArrayList;
import java.util.HashMap;

public interface IRefund {
    ArrayList getTransactions();
    String makeRequest(HashMap m);
    ArrayList getRequests();
}
