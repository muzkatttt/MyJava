package InterfaceCalculate2;

import java.util.logging.Logger;

public class CalcInterfaceImpl2 implements CalcInterface{

    Logger logger = Logger.getLogger("myLogger");

    public CalcInterfaceImpl2() {
    }

    @Override
    public void addition(double a, double b, double c, double d) {
        System.out.println(a + c + "+" + (b + d) + "* j");
        logger.info("найдена сумма комплексных чисел");
    }

    @Override
    public void substraction(double a, double b, double c, double d) {
        System.out.println((a - c) + "+" + (b - d) + "* j");
        logger.info("Найдена разность двух комплексных чисел");
    }

    @Override
    public void multiplication(double a, double b, double c, double d) {
        System.out.println((a*c + " + "+ (a*d + b*c) + "j + " + b*d +"j*j"));
        logger.info("Найдено произведение двух комплексных чисел");
    }

    @Override
    public void divizion(double a, double b, double c, double d) {
        System.out.println((a * c + b * d)/(c*c + d*d)+"+" +(c*b - a*d)/(c*c+d*d) + "*j");
        logger.info("Найдено частное от деления двух комплексных чисел");
    }
}
