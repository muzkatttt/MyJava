public class cycleWhile {
    public static void main(String[] args) {
/*
        // цикл while
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10; // делить - присвоить краткая запись
            count++;
        }
        System.out.println(count);

        // цикл do while - цикл с постусловием, сначала выполняются операции, затем проверяется условие
        int value1 = 321;
        int count1 = 0;
        do {
            value1 /= 10;
            count1++;
        } while (value1 != 0);
        System.out.println(count1);

        // цикл for
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);

        // операторы управления циклами continue - выполнение следующей итерации цикла
        int some = 10;


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue; // если остаток от деления на 2 будет равен 0
            // то оператор continue продолжит выполнять цикл и число 0 не будет выведено на экран,
            // так как цикл пойдет снова проверять следующее значение
            System.out.println(i); // выведет на экран 1, 3, 5, 7, 9
        }

        // вложенные циклы
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println('\n');
        }
*/
        // цикл for для работы с коллекциями

        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();

        // второй пример из лекции
        int[] array = new int[]{1, 2, 3, 4, 5, 77};
        for (int item : array) { // используется только для коллекций!!!
            System.out.println(item);
        }

        // третий пример
        int[] array1 = new int[]{1, 2, 3, 4, 5, 77};
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 10; // массив принудительно заполняется 10
            for (int item : array1) { // используется только для коллекций!!!
                System.out.println(item);
        }
        }
    }
}

