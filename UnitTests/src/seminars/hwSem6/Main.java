package seminars.hwSem6;

public class Main {
    /*
    Задание 1. Создайте программу на Python или Java,
    которая принимает два списка чисел и выполняет следующие действия:
    a. Рассчитывает среднее значение каждого списка.
    b. Сравнивает эти средние значения и выводит соответствующее сообщение:
    - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
    - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
    - ""Средние значения равны"", если средние значения списков равны.

Важно:
Приложение должно быть написано в соответствии с принципами объектно-ориентированного программирования.
Используйте Pytest (для Python) или JUnit (для Java) для написания тестов,
которые проверяют правильность работы программы.
Тесты должны учитывать различные сценарии использования вашего приложения.
Используйте pylint (для Python) или Checkstyle (для Java) для проверки качества кода.
Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.

*Формат и требования к сдаче: *
Отчет о выполнении этого задания должен включать в себя следующие элементы:
- Код программы
- Код тестов
- Отчет pylint/Checkstyle
- Отчет о покрытии тестами
- Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии.
     */
    public static void main(String[] args){
        // создаем массив с целыми числами
        
//        проверка работоспособности кода
//        int[] array = new int[]{1, 2, 3, 4, 5};
//        System.out.println(Arrays.stream(array).average());
//
//        MyList myList = new MyList(new int[]{1, 2, 3, 4, 5});
//        myList.averageArray(array);
//        System.out.println(myList.averageArray(array));

        Controller controller = new Controller();
        int[] array1 = controller.createArray();
        controller.toString(array1);
        int[] array2 = controller.createArray();
        controller.toString(array2);
        double averageArray1 = controller.averageArray(array1);
        double averageArray2 = controller.averageArray(array2);
        controller.compareArray(averageArray1, averageArray2);
    }
}
