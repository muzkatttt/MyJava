package models;

import interfaceCalculate.CalcInterface;

import java.util.Scanner;

public class Calculate extends AbstractClass implements CalcInterface {

    public Calculate(double a, double b, double c, double d) {
        setA(a);
        setB(b);
        setC(c);
        setD(d);
    }
    public static double inputAToFirst(){
        System.out.println("Введите действительную часть числа 1: >>\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
}
    public static double inputBbToFirst(){
        System.out.println("Введите мнимую часть числа 1: >>\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double inputCToSecond(){
        System.out.println("Введите действительную часть числа 2: >>\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double inputDToSecond(){
        System.out.println("Введите мнимую часть числа 2: >>\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    @Override
    public void addition(double a, double b, double c, double d) {

    }

    @Override
    public void substraction(double a, double b, double c, double d) {
    }

    @Override
    public void division(double a, double b, double c, double d) {

    }

    @Override
    public void multiplication(double a, double b, double c, double d) {

    }
}
