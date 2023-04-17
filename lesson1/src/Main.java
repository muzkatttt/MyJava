
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
/*
        short age = 10;
        int salary = 123456;
        System.out.println(age);        //10
        System.out.println(salary);     //123456

        float e = 2.7f;
        double pi = 3.1415; // для чисел типа double
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        char ch = '1';
        System.out.println(Character.isDigit(ch));  // true
        ch = 'a';
        System.out.println(Character.isDigit(ch));  // false

        char ch = '{'; // или char ch = 123 - где 123 это код символа скобки в кодировке -
        // неявное преобразование одного типа данных в другой
        System.out.println(ch);

        // преобразование типов данных int в double
        int a = 13;
        double d = a;
        System.out.println(d);


        // тип данных boolean
        // для обозначения логических операций используются  && - и, || - или, | и & - побитовые операции
        // ^ - разделительная дизьюнкция - если одно из значений истина

        boolean flag1 = 123 <= 234;
        System.out.println(flag1);  // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2);  // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);  // false

        // тип данных строка
        String msg ="Hello world";
        System.out.println(msg); // Hello world

        // неявная типизация - преобразование типов
        var i = 123;
        System.out.println(i);  // 123
        // System.out.println(getType(i));
        var ds = 123.456;
        System.out.println(ds);  // 123.456
        //System.out.println(getType(ds)); // double чтобы метод работал внутри необхрдимо создать класс getType
        //static String getType(Object o) {
        //return o.getClass().getSimpleName();
        //}

        // минимальное и максимальное значение у типа данных найти
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648


        // операции Java
        // Присваивание: =
        // Арифметические: *, /, +, -, %, ++, --
        // Операции сравнения: <, >, ==, !=, >=, <=
        // Логические операции: ||, &&, ^, !
        // Побитовые операции <<, >>, &, |, ^

        // оператор инкремента
        int a = 123;
        System.out.println(a++); // выведет в консоли 123
        System.out.println(a); // выведет в консоли 124, т.к. в предыдущей строке прибавилась единица
        // если в строке поставить ++a (префиксный), то сначала прибавится инкремент и только потом на экране появится
        a = a-- - --a; // ответ 2
        System.out.println(a);
        a = --a - a--; // ответ 0
        System.out.println(a);

        boolean f = 123 > 124;
        System.out.println(f); // false
        boolean g = 123 != 124;
        System.out.println(g); // true

        // операции побитовых сдвигов
        int a = 8; // 1000
        // a = a << 1;
        // System.out.println(a);
        System.out.println(a << 1); // выведет в консоли 16 т.к. добавит один бит т.е. 0 в конец числа >> 10000

        int b = 18; // 10010
        System.out.println(a >> 1); // выведет в консоли 4 т.к. удалит один бит т.е. 0 с конца числа >> 1001


        // побитовые операции
        int a = 5; // в двоичной СС 5 = 101
        int b = 2; // в двоичной СС 2 = 010
        System.out.println(a | b); // побитовая операция или
        // 101
        // 010
        // 111
        // в итоге (5 или 2) будет 7
        int c = 5; // в двоичной СС 5 = 101
        int d = 2; // в двоичной СС 2 = 010
        System.out.println(c & d); // побитовая операция и
        // 101
        // 010
        // 000
        // в итоге (5 и 2) будет 0
        int e = 5; // в двоичной СС 5 = 101
        int f = 2; // в двоичной СС 2 = 010
        System.out.println(c ^ d); // разделительная операция или ^ строго одно из значений истина должно быть
        // 101
        // 010
        // 111
        // в итоге (5 ^ 2) будет 7

        // boolean a = true;
        // bolean b = true;
        // System.out.println(a & b);
        // System.out.println(a && b); // быстрая операция

        string s = "qwer"; // индексы 0 1 2 3
        bolean b = s.length() >=5 && s.char(4) == '1'; // где s.length() длина строки >=5 и 4 символ равен 1
        bolean b = s.length() >=5 & s.char(4) == '1'; // операция с одним & проверяет обе части условия
        System.out.println(b); // выдаст false
        // аналогично работает дизьюнкция (хотя бы одно высказывание правда) || (или)


        // одномерные массивы
        int[] arr = new int[10];
        // int brr[] - так тоже можно обозначать массивы НО ЕСТЬ РАЗЛИЧИЯ
        System.out.println(arr.length); // 10
        // System.out.println(arr[3]);
        arr2 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr2.length); // 5


        // двумерные массивы
        int[] arr4[] = new int[3][5];
        for (int[] line : arr4) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();


        // второй пример из лекции
            int[][] arr1 = new int[3][5];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    System.out.printf("%d ", arr1[i][j]);
                }
                System.out.println();

        // преобразования
                int i = 123; double d = i;
                System.out.println(i);  // 123
                System.out.println(d);  // 123.0
                d = 3.1415; i = (int)d;
                System.out.println(d);  // 3.1415
                System.out.println(i);  // 3
                d = 3.9415; i = (int)d;
                System.out.println(d);  // 3.9415
                System.out.println(i);  // 3
                byte b = Byte.parseByte("123");
                System.out.println(b);  // 123
                b = Byte.parseByte("1234");
                System.out.println(b);  // NumberFormatException: Value out of range

*/
        // Получение данных из терминала - код работает - проверено
        // здесь запускаем import java.util.Scanner;
            // public class inputFromTerminal {
                // public static void main(String[] args) {
                    //Scanner iScanner = new Scanner(System.in);
        //System.out.printf("name: ");
        //String name = iScanner.nextLine();
        //System.out.printf("Привет, %s!", name);
        //iScanner.close();
        //}
        //}
/*
        // получение данных от пользователя с терминала - код работает проверила
    // import java.util.Scanner;
        // public class Program {
            //public static void main(String[] args) {
                //Scanner iScanner = new Scanner(System.in);
                //System.out.printf("int a: ");
                //int x = iScanner.nextInt();
                //System.out.printf("double a: ");
            //}}

        //Управляющие конструкции: условный оператор if else
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);

        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b) c = a; // можно писать без else и сразу присвоить с = а
        if (b > a) c = b;
        System.out.println(c);

        // тернарный оператор
        int a = 1;
        int b = 2;
        int min = a < b ? a : b;
        // если условие a < b выполняется, то будет возвращена та часть, которая указана после тернарного оператора ?
        // то есть а, если условие не выполняется, то возвращается аргумент после знака : то есть b
        System.out.println(min);

        // операторы выбора

 */


    }
}