package interfaceCalculate;


import java.util.logging.Logger;

public class CalcInterfaceImpl implements CalcInterface{
    Logger logger = Logger.getLogger("logger");

    public CalcInterfaceImpl() {

    }

    @Override
    public void addition(double a, double b, double c, double d) {
        System.out.println(a + c + "+" + (b + d) + "* j");
        logger.info("Найдена сумма двух комплексных чисел");
    }

    @Override
    public void substraction(double a, double b, double c, double d) {
        System.out.println((a - c) + "+" + (b - d) + "* j");
        logger.info("Найдена разность двух комплексных чисел");
    }

    @Override
    public void division(double a, double b, double c, double d) {
        System.out.println((a * c + b * d)/(c*c + d*d)+"+" +(c*b - a*d)/(c*c+d*d) + "*j");
        logger.info("Найдено частное от деления двух комплексных чисел");
    }

    @Override
    public void multiplication(double a, double b, double c, double d) {
        System.out.println((a*c + " + "+ (a*d + b*c) + "j + " + b*d +"j*j"));
        logger.info("Найдено произведение двух комплексных чисел");
    }
}

