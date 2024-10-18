package model2;

import java.util.Scanner;

public class Calculate2 extends AbstactClass2{
    public Calculate2(Double a, Double b, Double c, Double d) {
        setA(a);
        setB(b);
        setC(c);
        setD(d);
    }

    @Override
    public void setA(Double a) {
        super.setA(a);
    }

    @Override
    public void setB(Double b) {
        super.setB(b);
    }

    @Override
    public void setC(Double c) {
        super.setC(c);
    }

    @Override
    public void setD(Double d) {
        super.setD(d);
    }

    public static double inputAToFirst(){
        System.out.println("Введите действительную часть числа 1: >>\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double inputBToFirst(){
        System.out.println("Введите мнимую часть числа 1: >>\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
