import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task2 {
    /*
    Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее арифметическое из этого списка.
    Collections.max()
     */
    public static void main(String[] args) {
        List<Integer> list = task1.randomArray(13, 10, 1);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        double sum = 0;
        for(int i : list){ // цикл foreach в java - для каждого элемента списка выполняется
            sum += i; // вот это условие
        }
        System.out.println(sum/list.size());
    }
}
