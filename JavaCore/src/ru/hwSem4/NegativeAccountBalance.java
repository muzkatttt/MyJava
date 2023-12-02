package ru.hwSem4;

import java.io.IOException;

public class NegativeAccountBalance extends IllegalArgumentException{
    public NegativeAccountBalance(String message) {
        super(message);
    }
}
