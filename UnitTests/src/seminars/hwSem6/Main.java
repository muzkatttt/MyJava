package seminars.hwSem6;

import seminars.hwSem6.model.MyList;

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
        // создаем лист с целыми числами
        MyList<Integer> list1 = new MyList<>();
        list1.addList(1);
        list1.addList(1);
        list1.addList(1);
        list1.addList(1);
        list1.addList(1);
        list1.addList(1);
        list1.addList(1);
        MyList<Integer> list2 = new MyList<>();
        list2.addList(5);
        list2.addList(0);
        list2.addList(5);
        list2.addList(6);
        list2.addList(2);
        list2.addList(1);
        System.out.println(list1 + " " + list2);


        //IntSummaryStatistics avg1 = list1.stream().collect(Collectors.summarizingInt(Integer::intValue));
        //System.out.println(avg1);

        //double avg2 = list2.getResultAverage();
        //System.out.println(avg2);
        //List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        //List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        //System.out.println(Arrays.asList(1,2,3,4,5).stream().collect(Collectors.summarizingInt(Integer::intValue)));
        // System.out.println(list1.stream().mapToInt(Integer::intValue).average());



    }
}
