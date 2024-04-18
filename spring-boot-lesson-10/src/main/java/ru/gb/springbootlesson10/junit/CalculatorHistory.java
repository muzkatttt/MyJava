package ru.gb.springbootlesson10.junit;

public class CalculatorHistory {

    private final Storage storage;

    public CalculatorHistory(Storage storage) {
        this.storage = storage;
    }

    void logOperation(int a, int b, int res){
//        System.out.printf("%s, + %s = %s%n", a, b, res);
        if (!storage.save(String.format("%s + %s = %s", a, b, res))){
            throw new RuntimeException("Не удалось сохранить");
        }
    }
}
