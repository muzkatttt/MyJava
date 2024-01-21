package org.example;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
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
        System.out.println(Lists.charactersOf(string)); // разделение строки по-символьно

        System.out.println(Lists.partition(list, 2));

        System.out.println(Sets.union(new HashSet<>(list), new HashSet<>(list2)));

        System.out.println(Sets.intersection(new HashSet<>(list), new HashSet<>(list2)));
        System.out.println(Sets.symmetricDifference(new HashSet<>(list), new HashSet<>(list2)));
        System.out.println(Sets.difference(new HashSet<>(list2),new HashSet<>(list)));
        System.out.println(Sets.difference(new HashSet<>(list),new HashSet<>(list2)));

        List<List<String>> newList = Lists.partition(list2, 3);
        System.out.println(newList);
    }
}