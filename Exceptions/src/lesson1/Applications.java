package lesson1;

import java.io.File;

public class Applications {
    public static void main(String[] args) {
        //System.out.println(getFileSize(new File("Hello.txt")));
        //System.out.println(divide(10, 0)); // вернет ошибку ArithmeticException
        System.out.println(div(10,0));

        // исключение - ArrayIndexOutOfBoundsException  - обращение к элементу за границами массива
        //int[] ints = new int[10];
        //System.out.println(ints[11]);
        a(); // вызов метода a() в main() выдаст исключение ArrayIndexOutOfBoundsException,
        // а также покажет всю цепочку вызовов этой функции (стэк-трейс)
    }

    //стэк-трейс
    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[11]);
    }

    // функция деления на ноль
    public static int divide(int a1, int a2){
        // для обработки ошибки при делении на ноль:
        if (a2 == 0) {
            return -1;
        }
            return a1 / a2;
    }

// метод divide() с обработкой исключений:
    public static int div(int a, int b){
        if (b == 0){
            throw new RuntimeException("Нельзя делить на 0");
        }
        return a/b;
    }

    public static long getFileSize(File file) {
        if (!file.exists()){
            return -1L;
        }
        return file.length();
    }
}
