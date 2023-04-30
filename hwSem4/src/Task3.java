import java.util.LinkedList;

public class Task3 {
    /*
    Найдите сумму всех элементов LinkedList,
    сохраняя все элементы в списке. Используйте итератор
     */
    public static void main(String[] args) {
        linkedList();
    }
    public static void linkedList(){
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

}

