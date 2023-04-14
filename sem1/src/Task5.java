/*
Реализовать функцию возведения числа а в степень b. a, b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */

    public class Task5 {
        public static void main(String[] args) {
            int a = 3;
            int b = 2;

            if (b == 0) {
                System.out.println("1");
            }
            else if (b == 1) {
                System.out.println(a);
            }
            else if (b < 0) {
                float f = a;
                for (int i = 0; i >= b; i--) {
                    f = f/a;
                }
                System.out.println(f);
            }
            else {
                for (int i = 1; i < b; i++) {
                    a = a*a;
                }
                System.out.println(a);
            }
        }
    }

/* решение от преподавателя
 static double ex4(int a, int b) {

            if (b == 0 || a == 1) {
                return 1;
            }
            if (a == 0){
                return 0;
            }
            double res = 1;
            for (int i = 0; i < Math.abs(b); i++) {
                res *= a;
            }
            return b>0 ? res : 1.0/res;
        }
        */
