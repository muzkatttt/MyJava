package ru.gb.springhwsem8;

import io.micrometer.core.annotation.TimedSet;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Component
public class MyHwBean {

    public long sum() throws InterruptedException {
        long a = 600000000;
        long b = 1000000000;
        long result = (a * a + b * b) * (a * b) - (a * b * a * b);
        System.out.println(result);
        Thread.sleep(1000); // замедлить время выполнения метода
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
