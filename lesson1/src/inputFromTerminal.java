
import java.util.Scanner;
public class inputFromTerminal {
    // Получение данных из терминала
    public static String dataFromUser(String args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(args); // приглашение ко вводу
        String inputA = iScanner.nextLine();
        return inputA;
        // iScanner.close(); // лучше не закрывать сканер
    }
}

/*
import java.util.Scanner;
public class inputFromTerminal {
    // Получение данных из терминала
    public static String dataFromUser(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}
 */

// получение данных от пользователя с терминала - код работает проверила
// import java.util.Scanner;
//public class Program {
//public static void main(String[] args) {
//Scanner iScanner = new Scanner(System.in);
//System.out.printf("int a: ");
//int x = iScanner.nextInt();
//System.out.printf("double a: ");
//}}

// проверка на соответствие получаемого типа - код работает
/* import java.util.Scanner;
// public class inputFromTerminal {
     public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }}

// форматирование вывода данных
public class Program {
    public static void main(String[] args) {
    int a = 1, b = 2;
    int c = a + b;
    String res = a + " + " + b + " = " + c;
    System.out.println(res);
    }
}


public class Program {
    public static void main(String[] args) {
    int a = 1, b = 2;
    int c = a + b;
    String res = String.format("%d + %d = %d \n", a, b, c); //
    // в методе String.format первый аргумент - указать шаблон, по которому создается строка, а вторым аргументом
    // через запятую указать количество переменных
    System.out.printf("%d + %d = %d \n", a, b, c);
    System.out.println(res);
    }
}

// Виды спецификаторов
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
// %c: для вывода одиночного символа %s: для вывода строковых значений


public class Program {
    public static void main(String[] args) {
    float pi = 3.1415f;
    System.out.printf("%f\n", pi);    // 3,141500
    System.out.printf("%.2f\n", pi);  // 3,14
    System.out.printf("%.3f\n", pi);  // 3,141
    System.out.printf("%e\n", pi);    // 3,141500e+00
    System.out.printf("%.2e\n", pi);  // 3,14e+00
    System.out.printf("%.3e\n", pi);  // 3,141e+00
    }
}

//  Область видимости переменных
// У переменных существует понятие «область видимости».
// Если переменную объявили внутри некоторого блока фигурных скобок { },
// то снаружи этого блока переменная будет недоступна.
// public class Program {
//   public static void main(String[] args) {
//{
//int i = 123;
//           System.out.println(i);
//       }
//       System.out.println(i);  // error: cannot find symbol
//   }
//}


 */