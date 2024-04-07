package ru.gb.springhwsem8;

import org.springframework.stereotype.Component;

@Component
public class MyHwBean {
    public long sum(){
        long a = 600000000;
        long b = 1000000000;
        long result = (a * a + b * b) * (a * b) - (a * b * a * b);
        System.out.println(result);
        return result;
    }

    public int factorial(int n){
        int result;
        if (n == 1) return 1;
        result = factorial(n - 1) * n;
        //System.out.println("рекурсия здесь"); // проверка
        return result;
    }
}
