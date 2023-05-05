import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
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
        LinkedList<Integer> myList = myMethod(linkedList);
        System.out.println();
        System.out.println(myList);
    }
    public static LinkedList<Integer> myMethod(LinkedList<Integer> list) {

        LinkedList<Integer> ll = (LinkedList<Integer>) list.clone();
        Collections.reverse(ll);
        //System.out.println(ll);
        //System.out.println(linkedList);
        return ll;
    }

    /*
    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < 5; i++) {
        list.add(getRanNum());
    }
    System.out.println(list);

    for (int i = 0; i < 5; i++) {
        System.out.print(list.getLast() + ", ");
        list.removeLast();

    }
}
    public static int getRanNum() {
        double random = (Math.random() * 10);
        int num = (int) random;
        return num;
    }
     */
}