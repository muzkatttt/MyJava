package sem6;

public class Task2 {
    public static void main(String[] args) {
        /*
        В рамках выполнения задачи необходимо:
Создать свой Java Gradle проект;
Добавить зависимость Guava (популярная библиотека от Google, содержащая набор утилитарных механизмов).
Воспользоваться утилитарным классом Lists:
Развернуть список элементов
Получить лист Character из строки
Разделить лист на группы по 2 элемента
Воспользоваться утилитарным классом Sets
Получить итоговый Set из двух коллекций
Получить итоговый Set из общих элементов двух коллекций
Получить итоговый Set из непересекающихся элементов двух коллекций
         */
        /*
        package org.gr40in;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    //В рамках выполнения задачи необходимо:
    //Создать свой Java Gradle проект;
    //Добавить зависимость Guava (популярная библиотека от Google, содержащая набор утилитарных механизмов).
    //Воспользоваться утилитарным классом Lists:
    //Развернуть список элементов
    //Получить лист Character из строки
    //Разделить лист на группы по 2 элемента
    //Воспользоваться утилитарным классом Sets
    //Получить итоговый Set из двух коллекций
    //Получить итоговый Set из общих элементов двух коллекций
    //Получить итоговый Set из непересекающихся элементов двух коллекций
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> list = new ArrayList<>() {{
            add("Hi");
            add("Gradle");
            add("glad");
            add("to");
            add("see");
            add("you");
        }};
        List<String> list2 = new ArrayList<>() {{
            add("Hi!");
            add("Gradle!");
            add("glad!");
            add("to");
            add("see");
            add("you");
        }};
        System.out.println(Lists.reverse(list));

        String string = "Im string";
        System.out.println(Lists.charactersOf(string));

        System.out.println(Lists.partition(list, 2));

        System.out.println(Sets.union(new HashSet<>(list), new HashSet<>(list2)));

        System.out.println(Sets.intersection(new HashSet<>(list), new HashSet<>(list2)));
        System.out.println(Sets.symmetricDifference(new HashSet<>(list), new HashSet<>(list2)));
        System.out.println(Sets.difference(new HashSet<>(list2),new HashSet<>(list)));
        System.out.println(Sets.difference(new HashSet<>(list),new HashSet<>(list2)));

    }
}
         */
    }
}
