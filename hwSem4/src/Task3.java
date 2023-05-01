import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Task3 {
    /*
    Найдите сумму всех элементов LinkedList,
    сохраняя все элементы в списке. Используйте итератор
     */
    public static void main(String[] args) {
        linkedList();
        iteratorSum();
    }

    public static void linkedList() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0, 14);
        ll.add(1, 15);
        ll.add(2, 16);
        ll.add(3, 17);
        ll.add(4, 18);
        System.out.println(ll);
        int sum = 0;
        for (int item : ll) {
            sum += item;
        }
        System.out.println("Сумма элементов равна >>> \n" + sum);
    }

    public static void iteratorSum() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(18);
        System.out.println(arrayList);
        Iterator<Integer> iterator = arrayList.iterator();
        int summ = 0;
        while (iterator.hasNext()) {
            summ += iterator.next();
        }
        System.out.println("Сумма элементов массива равна >>\n" + summ);
    }
}


