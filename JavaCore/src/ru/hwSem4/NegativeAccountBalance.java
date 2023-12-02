package ru.hwSem4;


public class NegativeAccountBalance extends IllegalArgumentException{
    public NegativeAccountBalance(String message) {
        super(message);
    }

}
