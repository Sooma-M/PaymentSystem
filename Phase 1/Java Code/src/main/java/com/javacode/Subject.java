package com.javacode;

import java.util.List;

public interface Subject {
    void Subscribe(Observer o);
    void Unsubscribe(Observer o);
    void Notify(List response);
}
