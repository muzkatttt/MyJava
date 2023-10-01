package seminars.third.coverage;

public class SomeService {

    /*
    Создайте набор тестов, полностью покрывающих все ветви кода функции fizzBuzz.
    Эта функция принимает на вход число и возвращает "Fizz", если число делится на 3,
    "Buzz", если число делится на 5, и "FizzBuzz", если число делится на 15.
    Если число не делится ни на 3, ни на 5, ни на 15, функция возвращает входное число в виде строки.
     */

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return " " + i;
        }
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
     */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double discountedAmount = 0; // Сумма со скидкой (первоначальная сумма - скидка%)
        if (purchaseAmount >= 0) {
            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException("Скидка должна быть в диапазоне от 0 до 100%");
            }
        } else {
            // сумма покупки не может быть отрицтельной
            throw new ArithmeticException("Сумма покупки не может быть отрицательной");
        }
        return discountedAmount;
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return b + c;
        } else if (b == 13) {
            return a + c;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }
    public int luckySum2(int a, int b, int c) {
        if (a == 13) {
            return a = 0;
        } if (b == 13) {
            return b = 0;
        } if (c == 13) {
            return c = 0;
        }
        return a + b + c;
    }
}