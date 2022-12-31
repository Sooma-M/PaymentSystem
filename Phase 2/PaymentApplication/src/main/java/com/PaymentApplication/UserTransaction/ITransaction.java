package com.PaymentApplication.UserTransaction;

import java.util.ArrayList;
import java.util.HashMap;

public interface ITransaction {
    HashMap getAllTrans(String username);
    ArrayList getTransactions();
}
