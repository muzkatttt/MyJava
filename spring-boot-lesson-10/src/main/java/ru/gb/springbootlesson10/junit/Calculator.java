package ru.gb.springbootlesson10.junit;

public class Calculator {

    private final CalculatorHistory calculatorHistory;

    public Calculator(CalculatorHistory calculatorHistory) {
        this.calculatorHistory = calculatorHistory;
    }

    public int sum(int a, int b) {
        int res = a + b;
        calculatorHistory.logOperation(a, b, res);
        return res;
    }
}
