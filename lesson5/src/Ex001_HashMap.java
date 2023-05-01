

import java.util.*;
 
public class Ex001_HashMap {
    public static void main(String[] args) {
        /*
HashMap
Мар - это множество коллекций, работающих с данными по принципу <Ключ / Значение>.
Ключевые особенности:
1) ускоренная обработка данных;
2) порядок добавления не запоминается.
B HashMap элементы располагаются как угодно и могут менять свое положение.
         */
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один"); 
        db.put(2, "два"); 
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        //db.remove(null); // удаляет пустые ключи
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true - проверяет, есть ли такой элемент
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet());
        System.out.println(db.values());


    }
}