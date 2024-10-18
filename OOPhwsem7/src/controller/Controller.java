package controller;

import interfaceCalculate.CalcInterface2Impl;
import models.Calculate;

public class Controller {
    CalcInterface2Impl calc;

    public Controller() {
        this.calc = new CalcInterface2Impl();
    }

    public double inputAToFirst() {
        return Calculate.inputAToFirst();
    }

    public double inputBbToFirst() {
        return Calculate.inputBbToFirst();
    }

    public double inputCToSecond() {
        return Calculate.inputCToSecond();
    }

    public double inputDToSecond() {
        return Calculate.inputDToSecond();
    }

    public void addition(double a, double b, double c, double d) {
        calc.addition(a, b, c, d);
    }

    public void subtraction(double a, double b, double c, double d) {
        calc.substraction(a, b, c, d);
    }

    public void multiplication(double a, double b, double c, double d) {
        calc.multiplication(a, b, c, d);
    }

    public void division(double a, double b, double c, double d) {
        calc.division(a, b, c, d);
    }

}
