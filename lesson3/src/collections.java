import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class collections {
    //«Удобный массив»
    //Разные способы создания
//    ArrayList list = new ArrayList(); // создание массива
//    List – пронумерованный набор элементов.
//    Пользователь этого интерфейса имеет точный контроль над тем,
//    где в списке вставляется каждый элемент.
//    Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке)
//    и искать элементы в списке.

//ArrayList, LinkedList (Vector, Stack – устаревшие) названия массивов

    //«Удобный массив» Разные способы создания
//    ArrayList<Integer> list1 = new ArrayList<Integer>();
//    ArrayList<Integer> list2 = new ArrayList<>();
//    ArrayList<Integer> list3 = new ArrayList<>(10);
//    ArrayList<Integer> list4 = new ArrayList<>(list3);
    public static void main(String[] args) {
        /*
        List<Integer> list = new ArrayList<Integer>(); // правильно
        // List list = new ArrayList(); // а вот так неправильно, т.к. не определен тип элементов
        list.add(1);
        list.add(123);
// list.add("string line");
        for (Object o : list) {
            System.out.println(o);
        }

        // Функционал коллекций
//    add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
//    get(pos) – возвращает элемент из списка по указанной позиции
//    indexOf(item) – первое вхождение или -1
//    lastIndexOf(item) – последнее вхождение или -1
//    remove(pos) – удаление элемента на указанной позиции и его возвращение
//    void sort(Comparator) – сортирует набор данных по правилу
//    subList(int start, int end) – получение набора данных от позиции start до end
    }
// с помощью массива целочисленных значений
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = {day, month, year};
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]

        // с помощью StringBuilder
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        List<StringBuilder> d = Arrays.asList(day, month, year);
        System.out.println(d); // [29, 9, 1990]
        day = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]

        // методы работы с коллекциями
//        clear() – очистка списка
//        toString() – «конвертация» списка в строку
//        Arrays.asList – преобразует массив в список
//        containsAll(col) – проверяет включение всех элементов из col
//        removeAll(col) – удаляет элементы, имеющиеся в col
//        retainAll(col) – оставляет элементы, имеющиеся в col
//        toArray() – конвертация списка в массив Object’ов
//        toArray(type array) – конвертация списка в массив type
//        List.copyOf(col) – возвращает копию списка на основе имеющегося
//        List.of(item1, item2,...) – возвращает неизменяемый список

        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        //list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);

        Character value1 = null;
        List<Character> list3 = new ArrayList<Character>();
        list3.add('S');
        list3.add('e');
        list3.add('r');
        System.out.println(list3);
        list3.remove(1);
        List<Character> list4 = List.copyOf(list3); // копируем лист 1 в лист 2
        System.out.println(list4);
    }
*/
        // Итератор
        // hasNext(), next(), remove()
        //ListIterator<E> URL
        //hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) { // цикл foreach
            // item - наименование переменной, list - имя коллекции
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        while (((Iterator<?>) col).hasNext()) {
            System.out.println(col.next());
            // col.next(); вызовет ошибку, т.к. два раза нельзя добавлять один и тот же элемент
            // col.remove(); тоже будет ошибка
        }

    }
}
