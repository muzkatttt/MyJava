package controller;

import InterfaceCalculate2.CalcInterfaceImpl2;
import model2.Calculate2;

public class Controller2 {

    CalcInterfaceImpl2 calcInterfaceImpl2;

    public Controller2() {
        this.calcInterfaceImpl2 = new CalcInterfaceImpl2();
    }

    public double inputAToFirst() {

        return Calculate2.inputAToFirst();
    }

    public double inputBbToFirst() {
        return Calculate2.inputBToFirst();
    }

    public double inputCToSecond() {
        return Calculate2.inputCToSecond();
    }

    public double inputDToSecond() {
        return Calculate2.inputDToSecond();
    }
    public void addition(double a, double b, double c, double d) {
        calcInterfaceImpl2.addition(a, b, c, d);
    }

    public void subtraction(double a, double b, double c, double d) {
        calcInterfaceImpl2.substraction(a, b, c, d);
    }

    public void multiplication(double a, double b, double c, double d) {
        calcInterfaceImpl2.multiplication(a, b, c, d);
    }

    public void division(double a, double b, double c, double d) {
        calcInterfaceImpl2.divizion(a, b, c, d);
    }
}
