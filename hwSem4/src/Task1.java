import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        linkedList();
    }
    public static void linkedList(){
        /* Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
        Постараться не обращаться к листу по индексам.*/
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(4);
        linkedList.add(13);
        linkedList.add(12);
        linkedList.add(8);
        linkedList.add(1);
        System.out.println(linkedList);
        System.out.println();
        LinkedList<Integer> ll = (LinkedList<Integer>) linkedList.clone();
        Collections.reverse(ll);
        System.out.println(ll);
    }
}